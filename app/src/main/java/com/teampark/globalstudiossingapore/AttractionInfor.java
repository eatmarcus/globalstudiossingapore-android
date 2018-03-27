package com.teampark.globalstudiossingapore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionInfor extends AppCompatActivity {

    String coordinates;

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
        coordinates = intent.getStringExtra("coordinates");

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

    public void goThere(View view) {

        String toParse = "google.navigation:q=" + coordinates + "&mode=w";
        Uri gmmIntentUri = Uri.parse(toParse);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
