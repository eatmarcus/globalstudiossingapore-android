package com.teampark.globalstudiossingapore;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.teampark.globalstudiossingapore.Entity.Attraction;

public class AttractionInfor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_infor);

        // To add the back button of the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Get the selected dining place's name
        Intent intent = getIntent();
        String name = intent.getStringExtra("rideName");
        String information = intent.getStringExtra("rideInfo");
        String category = intent.getStringExtra("rideCategory");
        String ageGroup = intent.getStringExtra("rideAge");
        String time = intent.getStringExtra("rideQueueTime");
        int ridePhoto = intent.getIntExtra("rideImage",-1);
        int id = intent.getIntExtra("rideId",-1);

        ImageView rideImage = (ImageView)findViewById(R.id.attractionImage);
        rideImage.setImageResource(ridePhoto);

        TextView rideName = (TextView)findViewById(R.id.attractionName);
        rideName.setText(name);
        TextView rideInfo = (TextView)findViewById(R.id.attractionInformation);
        rideInfo.setText(information);
        TextView rideCategory = (TextView)findViewById(R.id.attractionCategory);
        rideCategory.setText(category);
        TextView rideAge = (TextView)findViewById(R.id.attractionAge);
        rideAge.setText(ageGroup);
        TextView rideTime = (TextView)findViewById(R.id.queueTime);
        rideTime.setText(time);

//        ImageView map = (ImageView)findViewById(R.id.mapIcon);
//        map.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent(AttractionInfor.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });

        ImageView directions = (ImageView)findViewById(R.id.directionIcon);
        directions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(id == 1){
                    directToPlace(1.3015317,103.8342214);
                }else if(id == 2){
                    directToPlace(1.3044001,103.8294458);
                }else if(id == 3){
                    directToPlace(1.3044001,103.8228797);
                }else if(id == 4){
                    directToPlace(1.3019241,103.8480892);
                }else if(id == 5){
                    directToPlace(1.2995103,103.8519873);
                }else if(id == 6){
                    directToPlace(1.2861563,103.8274415);
                }else if(id == 7){
                    directToPlace(1.2864689,103.8251236);
                }else if(id == 8){
                    directToPlace(1.3343797,103.8874858);
                }else if(id == 9){
                    directToPlace(1.2992771,103.8454868);
                }else if(id == 10){
                    directToPlace(1.3005142,103.8354485);
                }
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //
        //  HANDLE BACK BUTTON
        //
        int id = item.getItemId();

        if (id == android.R.id.home) {
            // Back button clicked
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void directToPlace(double lat, double lng){
        String toParse = "google.navigation:q=" + lat + ", " + lng + "&mode=w";
        Uri gmmIntentUri = Uri.parse(toParse);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
