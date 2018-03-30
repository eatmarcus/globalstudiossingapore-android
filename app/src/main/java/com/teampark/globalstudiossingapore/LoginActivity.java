package com.teampark.globalstudiossingapore;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.teampark.globalstudiossingapore.utility.DialogBuilder;
import com.teampark.globalstudiossingapore.utility.SharedPrefsUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    private final int PERMISSIONS_REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupSharedPref();
        checkLoginStatus();
    }

    public void loginClicked(View view) {

        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setOrientationLocked(false);
        integrator.setPrompt("Scan the QR code on your ticket to login!");
        integrator.setCameraId(0);  // Use a specific camera of the device
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
        integrator.initiateScan();
    }

    public void callClicked(View view) {

        String toCall = "81020805";
        DialogBuilder.showDialog("Emergency Call Only", "Are you sure you want to call?", LoginActivity.this, "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + toCall));
                if (ActivityCompat.checkSelfPermission(LoginActivity.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE, android.Manifest.permission.CALL_PHONE},
                                PERMISSIONS_REQUEST_CALL);
                    }
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {

            case PERMISSIONS_REQUEST_CALL:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay!
                    Log.d("LoginActivity", "Location Permission allowed by user.");
                    // doSomething();

                    String toCall = "81020805";

                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + toCall));
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.

                }
                break;

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        if (requestCode == SCAN_QR && resultCode == RESULT_OK){
//
//            String value = data.getStringExtra("value");
//
//
//        }

        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (scanResult != null) {
            // handle scan result
            if(scanResult.getContents() == null) {
                //Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Scanned: " + scanResult.getContents(), Toast.LENGTH_LONG).show();

                String resultValue = scanResult.getContents();

                String dateValue = "";
                String id = null;

                if (resultValue.contains("-")){
                    dateValue = resultValue.substring(0, resultValue.indexOf('-'));
                    id = resultValue.substring(resultValue.indexOf('-') + 1);
                }


                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                try {
                    cal.setTime(sdf.parse(dateValue));// all done
                } catch (ParseException e) {
                    e.printStackTrace();
                    cal = null;
                }



                if (cal != null){

                    Calendar c1 = Calendar.getInstance(); // today

                    if (c1.get(Calendar.YEAR) == cal.get(Calendar.YEAR)
                            && c1.get(Calendar.DAY_OF_YEAR) == cal.get(Calendar.DAY_OF_YEAR)) {
                        SharedPrefsUtil.setObject("user", id);
                        SharedPrefsUtil.setObject("date", cal);

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);

                        LoginActivity.this.finish();

                    } else {
                        DialogBuilder.showDialog("Invalid QR Code", "This is a ticket for another date. Please scan a valid GSS QR Code.", this);
                    }



                } else if (resultValue.equals("BOSSMODE")){
                    SharedPrefsUtil.setObject("user", "BOSSMODE");

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                    LoginActivity.this.finish();

                } else {
                    DialogBuilder.showDialog("Invalid QR Code", "Please scan a valid GSS QR Code.", this);
                }



            }

        }

    }

    private void checkLoginStatus(){
        String id = SharedPrefsUtil.getObject("user", String.class);
        Calendar cal = SharedPrefsUtil.getObject("date", Calendar.class);

        if (id == null) {
            return;
        }

        if (id.equals("BOSSMODE")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            LoginActivity.this.finish();
            return;
        }


        if (cal == null){
            return;
        }

        Calendar c1 = Calendar.getInstance(); // today

        if (c1.get(Calendar.YEAR) == cal.get(Calendar.YEAR)
                && c1.get(Calendar.DAY_OF_YEAR) == cal.get(Calendar.DAY_OF_YEAR)) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            LoginActivity.this.finish();

        } else {
            DialogBuilder.showDialog("Session Expired", "Your ticket has expired. Thank you for coming to Global Studios Singapore!", this);
            SharedPrefsUtil.setObject("user", null);
            SharedPrefsUtil.setObject("date", null);
        }



    }

    private void setupSharedPref(){
        SharedPrefsUtil.setSharedPreferences(getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE));
    }
}
