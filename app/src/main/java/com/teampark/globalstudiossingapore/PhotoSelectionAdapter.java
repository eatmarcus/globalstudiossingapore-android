package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class PhotoSelectionAdapter extends RecyclerView.Adapter<PhotoSelectionAdapter.ViewHolder> {

    private List<DiningPlaces> diningPlaces;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public PhotoSelectionAdapter(Context context, List<DiningPlaces> diningPlacesList){
        mContext = context;
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

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
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
        }
    }

    // To inflate the item layout and create the holder
    @Override
    public PhotoSelectionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View diningView = inflater.inflate(R.layout.item_dininglayout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(diningView);
        return viewHolder;
    }

    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(PhotoSelectionAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        DiningPlaces places = diningPlaces.get(position);

        // Set item views based on your views and data model
        TextView textViewName = viewHolder.name;
        textViewName.setText(places.getDiningName());

        TextView textViewInfo = viewHolder.information;
        textViewInfo.setText(places.getDiningInfo());

        TextView textViewDist = viewHolder.distance;
        textViewDist.setText(places.getDiningDistance());

        TextView textViewCat = viewHolder.category;
        textViewCat.setText(places.getDiningCategory());

        ImageView imageViewRes = viewHolder.imageView;
        imageViewRes.setImageResource(places.getImageUrl());

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
