package com.teampark.globalstudiossingapore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.teampark.globalstudiossingapore.DAO.DiningMainsDAO;
import com.teampark.globalstudiossingapore.Entity.DiningMainItem;

import java.util.ArrayList;

public class DiningMains extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining_mains);

        // To add the back button of the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int restaurantId = intent.getIntExtra("restaurantId", -1);
        String restaurantName = intent.getStringExtra("restaurantName");
        int category = intent.getIntExtra("selection", -1);

        if(category == 1){
            getSupportActionBar().setTitle("Promo Meals");

        }else if(category == 2){
            getSupportActionBar().setTitle("Mains");

        }else if(category == 3){
            getSupportActionBar().setTitle("Appetizers");

        }else if(category == 4){
            getSupportActionBar().setTitle("Desserts");

        }else if(category == 5){
            getSupportActionBar().setTitle("Beverages");

        }else{
            getSupportActionBar().setTitle("Snacks");

        }


        ArrayList<DiningMainItem> diningMainItems = DiningMainsDAO.getDiningMainItems(restaurantId, category);


        // Lookup the recycler in activity layout
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        // Create adapter passing in the sample user data
        DiningMainsAdapter adapter = new DiningMainsAdapter(this, this, restaurantName, diningMainItems);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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


}
