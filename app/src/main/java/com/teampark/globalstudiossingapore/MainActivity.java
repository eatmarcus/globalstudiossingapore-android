package com.teampark.globalstudiossingapore;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.estimote.coresdk.observation.region.beacon.BeaconRegion;
import com.estimote.coresdk.recognition.packets.Beacon;
import com.estimote.coresdk.service.BeaconManager;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.teampark.globalstudiossingapore.Entity.Records;
import com.teampark.globalstudiossingapore.Network.RecordRequestInterface;
import com.teampark.globalstudiossingapore.utility.DialogBuilder;
import com.teampark.globalstudiossingapore.utility.SharedPrefsUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, GuideMapFragment.OnFragmentInteractionListener, DiningFragment.OnFragmentInteractionListener
        , AttractionsFragment.OnFragmentInteractionListener, ItineraryFragment.OnFragmentInteractionListener, PhotoSelectionFragment.OnFragmentInteractionListener,
        OrdersFragment.OnFragmentInteractionListener{

    protected static final String TAG = "MainActivity";
    private static final int PERMISSIONS_REQUEST_GET_LOCATION = 1;
    private BeaconManager beaconManager;
    private BeaconRegion region1, region2;

    CompositeDisposable compositeDisposable;

    private static String url = "http://heyitsmong.com:8080/gss-server/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        compositeDisposable = new CompositeDisposable();

        FloatingActionButton emergencyCall = (FloatingActionButton) findViewById(R.id.emergencyCall);
        emergencyCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toCall = "81020805";
                DialogBuilder.showDialog("Emergency Call Only", "Are you sure you want to call?", MainActivity.this, "Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + toCall));
                        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            // TODO: Consider calling
                            //    ActivityCompat#requestPermissions
                            // here to request the missing permissions, and then overriding
                            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                            //                                          int[] grantResults)
                            // to handle the case where the user grants the permission. See the documentation
                            // for ActivityCompat#requestPermissions for more details.
                            return;
                        } else {
                            startActivity(intent);
                        }
                    }
                }, "No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // nothing
                    }
                });

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Fragment fragment = new GuideMapFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame, fragment);
        ft.commit();
        /*
         *  REQUEST PERMISSIONS!
         */

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            Log.d(TAG, "Location Permissions not obtained! Requesting Permissions...");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                        PERMISSIONS_REQUEST_GET_LOCATION);
            }
        } else {

            // Permissions already obtained!!
            startProximity();
        }

//        Intent intent = new Intent(this, ARActivity.class);
//        startActivity(intent);


    }

    /*
     *  Permissions user input result!
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSIONS_REQUEST_GET_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay!
                    Log.d(TAG, "Location Permission allowed by user.");
                    // doSomething();
                    startProximity();

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Log.d(TAG, "Location Permission denied by user.");
                    DialogBuilder.showDialog("Permission Required", "Location permissions are required to obtain your current location. Should GSS attempt to obtain location permissions?", this,
                            "YES", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                        requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                                                PERMISSIONS_REQUEST_GET_LOCATION);
                                    }
                                }
                            }, "NO", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // no selected, give up asking for permission!
                                }
                            });
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment;
        if (id == R.id.guidemap) {
            fragment = new GuideMapFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainFrame, fragment);
            ft.commit();
        } else if (id == R.id.dining) {
            fragment = new DiningFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainFrame, fragment);
            ft.commit();
        } else if (id == R.id.attractions) {
            fragment = new AttractionsFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainFrame, fragment);
            ft.commit();
        } else if (id == R.id.orders) {
            fragment = new OrdersFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainFrame, fragment);
            ft.commit();
        } else if (id == R.id.settings) {

        } else if (id == R.id.arphototaking) {
            fragment = new PhotoSelectionFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainFrame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void startProximity(){
        beaconManager = new BeaconManager(this);
        region1 = new BeaconRegion("1", UUID.fromString("b9407f30-f5f8-466e-aff9-25556b57fe6d") , 43349, 38934);
        region2 = new BeaconRegion("2", UUID.fromString("b9407f30-f5f8-466e-aff9-25556b57fe6d") , 34588, 22564);
        beaconManager.setBackgroundScanPeriod(2000, 5000);
        beaconManager.setMonitoringListener(new BeaconManager.BeaconMonitoringListener() {
            @Override
            public void onEnteredRegion(BeaconRegion region, List<Beacon> beacons) {
                Log.d("ENTERED", region.getIdentifier());
                Toast.makeText(getApplicationContext(), "Entered " + region.getIdentifier(), Toast.LENGTH_LONG).show();
                //
                // USER ENTERS REGION, INSERT A RECORD WITH ISENTERED 1
                //
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

                RecordRequestInterface recordRequestInterface = new Retrofit.Builder()
                        .baseUrl(url)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build().create(RecordRequestInterface.class);

                Map<String, String> fieldsMap = new HashMap<>();
                if(region.getIdentifier().equals("1")){
                    fieldsMap.put("beaconId", "1");
                }else if(region.getIdentifier().equals("2")){
                    fieldsMap.put("beaconId", "2");
                }

                fieldsMap.put("isEntered", "1");

                compositeDisposable.add(recordRequestInterface.addRecords(fieldsMap)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(this::handleResponse,this::handleError));
            }

            private void handleResponse(Records records) {
                //dont care
            }

            private void handleError(Throwable error) {
                Log.d("Error", "Entering of record kena error");
                error.printStackTrace();
            }

            @Override
            public void onExitedRegion(BeaconRegion region) {
                Log.d("EXITED", region.getIdentifier());
                Toast.makeText(getApplicationContext(), "Exited " + region.getIdentifier(), Toast.LENGTH_LONG).show();
                //
                // USER EXITS REGION, INSERT A RECORD WITH ISENTERED -1
                //

                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

                RecordRequestInterface recordRequestInterface = new Retrofit.Builder()
                        .baseUrl(url)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(client)
                        .build().create(RecordRequestInterface.class);

                Map<String, String> fieldsMap = new HashMap<>();
                if(region.getIdentifier().equals("1")){
                    fieldsMap.put("beaconId", "1");
                }else if(region.getIdentifier().equals("2")){
                    fieldsMap.put("beaconId", "2");
                }

                fieldsMap.put("isEntered", "-1");

                compositeDisposable.add(recordRequestInterface.addRecords(fieldsMap)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(this::handleResponse,this::handleError));
            }
        });

        beaconManager.connect(new BeaconManager.ServiceReadyCallback() {
            @Override
            public void onServiceReady() {
                beaconManager.startMonitoring(region1);
                beaconManager.startMonitoring(region2);
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeDisposable.clear();
    }
}
