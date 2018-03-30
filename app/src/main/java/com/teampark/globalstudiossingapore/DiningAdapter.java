package com.teampark.globalstudiossingapore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningAdapter extends RecyclerView.Adapter<DiningAdapter.ViewHolder> {

    private List<DiningPlaces> diningPlaces;
    private Activity activity;
    private Context mContext;

    private static final int DINING_FOOD = 2;

    // Pass in the diningPlaces array into the constructor
    public DiningAdapter(Context context, Activity activity, List<DiningPlaces> diningPlacesList){
        mContext = context;
        this.activity = activity;
        diningPlaces = diningPlacesList;
    }

    private Context getContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name;
        public TextView information;
        public TextView distance;
        public ImageView imageView;
        public ImageView priceRange1;
        public ImageView priceRange2;
        public ImageView priceRange3;
        public TextView category;

        private Context context;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(final Context context, View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.diningName);
            information = (TextView)itemView.findViewById(R.id.diningInfor);
            distance = (TextView)itemView.findViewById(R.id.diningDist);
            imageView = (ImageView)itemView.findViewById(R.id.diningImage);
            priceRange1 = (ImageView) itemView.findViewById(R.id.diningPriceRange1);
            priceRange2 = (ImageView) itemView.findViewById(R.id.diningPriceRange2);
            priceRange3 = (ImageView) itemView.findViewById(R.id.diningPriceRange3);
            category = (TextView)itemView.findViewById(R.id.diningCategory);

            // Store the context
            this.context = context;


        }
    }

    // To inflate the item layout and create the holder
    @Override
    public DiningAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View diningView = inflater.inflate(R.layout.item_dininglayout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(context,diningView);
        return viewHolder;
    }

    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(DiningAdapter.ViewHolder viewHolder, final int position) {
        // Get the data model based on position
        final DiningPlaces places = diningPlaces.get(position);

        // Set item views based on your views and data model
        TextView textViewName = viewHolder.name;
        textViewName.setText(places.getDiningName());

        TextView textViewInfo = viewHolder.information;
        textViewInfo.setText(places.getDiningInfo());

        TextView textViewDist = viewHolder.distance;
        textViewDist.setText(places.getDiningDistance()+"m");

        TextView textViewCat = viewHolder.category;
        textViewCat.setText(places.getDiningCategory());

        ImageView imageViewRes = viewHolder.imageView;
        imageViewRes.setImageResource(places.getImageUrl());

        // This is to move to the dining menu from the list of dining places
        View itemView = viewHolder.itemView;
        // Attach a click listener to the entire row view
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(activity,DiningMenu.class);
                intent.putExtra("restaurantId", places.getId());
                intent.putExtra("diningPlace",places.getDiningName());
                intent.putExtra("diningPic", places.getImageUrl());
                // When the person click should go to the DiningMenu page
                activity.startActivityForResult(intent, DINING_FOOD);
            }
        });

        int priceRange = places.getPriceRange();
        if(priceRange == 1){
            ImageView imageViewPriceRange1 = viewHolder.priceRange1;
            imageViewPriceRange1.setVisibility(View.VISIBLE);
            imageViewPriceRange1.setImageResource(R.drawable.pricerange);

        }else if(priceRange == 2){
            ImageView imageViewPriceRange1 = viewHolder.priceRange1;
            imageViewPriceRange1.setVisibility(View.VISIBLE);
            imageViewPriceRange1.setImageResource(R.drawable.pricerange);
            ImageView imageViewPriceRange2 = viewHolder.priceRange2;
            imageViewPriceRange2.setVisibility(View.VISIBLE);
            imageViewPriceRange2.setImageResource(R.drawable.pricerange);
        }else{
            ImageView imageViewPriceRange1 = viewHolder.priceRange1;
            imageViewPriceRange1.setVisibility(View.VISIBLE);
            imageViewPriceRange1.setImageResource(R.drawable.pricerange);
            ImageView imageViewPriceRange2 = viewHolder.priceRange2;
            imageViewPriceRange2.setVisibility(View.VISIBLE);
            imageViewPriceRange2.setImageResource(R.drawable.pricerange);
            ImageView imageViewPriceRange3 = viewHolder.priceRange3;
            imageViewPriceRange3.setVisibility(View.VISIBLE);
            imageViewPriceRange3.setImageResource(R.drawable.pricerange);
        }

    }

    // To determine the number of items
    @Override
    public int getItemCount() {
        return diningPlaces.size();
    }

}
