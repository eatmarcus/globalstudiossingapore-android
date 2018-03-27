package com.teampark.globalstudiossingapore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DiningMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining_menu);

        // To add the back button of the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Get the selected dining place's name
        Intent intent = getIntent();
        final int restaurantId = intent.getIntExtra("restaurantId", -1);
        String diningName = intent.getStringExtra("diningPlace");
        int diningPhoto = intent.getIntExtra("diningPic",-1);

        ImageView diningPlace = (ImageView)findViewById(R.id.diningIcon);
        diningPlace.setImageResource(diningPhoto);

        TextView name = (TextView)findViewById(R.id.selectedDiningName);
        name.setText(diningName);

        ImageView directions = (ImageView)findViewById(R.id.GetDirections);
        directions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(restaurantId == 1){
                    directToPlace(1.3015317,103.8342214);
                }else if(restaurantId == 2){
                    directToPlace(1.3044001,103.8294458);
                }else if(restaurantId == 3){
                    directToPlace(1.3044001,103.8228797);
                }else if(restaurantId == 4){
                    directToPlace(1.3019241,103.8480892);
                }else if(restaurantId == 5){
                    directToPlace(1.2995103,103.8519873);
                }else if(restaurantId == 6){
                    directToPlace(1.2861563,103.8274415);
                }else if(restaurantId == 7){
                    directToPlace(1.2864689,103.8251236);
                }else if(restaurantId == 8){
                    directToPlace(1.3343797,103.8874858);
                }else if(restaurantId == 9){
                    directToPlace(1.2992771,103.8454868);
                }else if(restaurantId == 10){
                    directToPlace(1.3005142,103.8354485);
                }
            }
        });

        CardView promoMeal = (CardView) findViewById(R.id.cardViewPromo);
        CardView main = (CardView)findViewById(R.id.cardViewMain);
        CardView appetizer = (CardView)findViewById(R.id.cardViewAppetizer);
        CardView dessert = (CardView)findViewById(R.id.cardViewDessert);
        CardView beverage = (CardView)findViewById(R.id.cardViewBeverage);
        CardView snack = (CardView)findViewById(R.id.cardViewSnacks);

        promoMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 1);
            }
        });

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 2);
            }
        });

        appetizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 3);
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 4);
            }
        });

        beverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 5);
            }
        });

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiningMain(restaurantId, 6);
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

    private void openDiningMain(int restaurantId, int value){
        // Go to the dining mains view
        Intent intent = new Intent(DiningMenu.this,DiningMains.class);
        intent.putExtra("restaurantId", restaurantId);
        intent.putExtra("selection",value);
        startActivity(intent);
    }

    public void directToPlace(double lat, double lng){
        String toParse = "google.navigation:q=" + lat + ", " + lng + "&mode=w";
        Uri gmmIntentUri = Uri.parse(toParse);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
