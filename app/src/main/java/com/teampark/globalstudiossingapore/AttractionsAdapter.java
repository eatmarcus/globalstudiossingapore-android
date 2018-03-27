package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Theresa Lee on 3/24/2018.
 */

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.ViewHolder>{

    private List<Attractions> attractions;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public AttractionsAdapter(Context context,List<Attractions> attractionsList){
        mContext = context;
        attractions = attractionsList;
    }

    private Context getContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name;
        public TextView information;
        public TextView queue;
        public ImageView imageView;
        public TextView category;

        private Context context;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(final Context context, View itemView) {
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.attractionName);
            information = (TextView)itemView.findViewById(R.id.attractionInfor);
            queue = (TextView)itemView.findViewById(R.id.attractionQueue);
            imageView = (ImageView)itemView.findViewById(R.id.attractionImage);
            category = (TextView)itemView.findViewById(R.id.attractionCategory);

            this.context = context;
        }
    }
        // To inflate the item layout and create the holder
        @Override
        public AttractionsAdapter.ViewHolder onCreateViewHolder (ViewGroup parent,int viewType){

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View attractionView = inflater.inflate(R.layout.item_attractionlayout, parent, false);

        // Return a new holder instance
        AttractionsAdapter.ViewHolder viewHolder = new AttractionsAdapter.ViewHolder(context, attractionView);
        return viewHolder;
    }


    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(AttractionsAdapter.ViewHolder viewHolder, final int position) {
        // Get the data model based on position
        final Attractions rides = attractions.get(position);

        // Set item views based on your views and data model
        TextView textViewName = viewHolder.name;
        textViewName.setText(rides.getAttractionName());

        TextView textViewInfo = viewHolder.information;
        textViewInfo.setText(rides.getAttractionInfo());

        TextView textViewQueue = viewHolder.queue;
        textViewQueue.setText(rides.getAttractionQueue()+"");

        TextView textViewCat = viewHolder.category;
        textViewCat.setText(rides.getAttractionCategory());

        ImageView imageViewRes = viewHolder.imageView;
        imageViewRes.setImageResource(rides.getImageUrl());

        // This is to move to the dining menu from the list of dining places
        View itemView = viewHolder.itemView;

        // Attach a click listener to the entire row view
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String attractionName = rides.getAttractionName();
                Intent intent = new Intent(mContext,AttractionInfor.class);
                intent.putExtra("rideName", rides.getAttractionName());
                intent.putExtra("rideInfo",rides.getAttractionInfo());
                intent.putExtra("rideCategory", rides.getAttractionCategory());
                intent.putExtra("rideAge", rides.getAttractionAgeRange());
                intent.putExtra("rideQueueTime", "< "+ rides.getAttractionQueue() + " mins");
                intent.putExtra("rideImage", rides.getImageUrl());

                if(attractionName.equals("Raging River")){
                    intent.putExtra("coordinates", "1.2543797, 103.8231613");
                }else if(attractionName.equals("Dare Devil")){
                    intent.putExtra("coordinates", "1.2540289,103.8230367");
                }else if(attractionName.equals("Sponglash Wave Pool")){
                    intent.putExtra("coordinates", "1.253302,103.8227258");
                }else if(attractionName.equals("Steamin' Demon")){
                    intent.putExtra("coordinates", "1.2532943,103.8220809");
                }else if(attractionName.equals("Thomie's Mine Train")){
                    intent.putExtra("coordinates", "1.2540289,103.8230367");
                }else{
                    intent.putExtra("coordinates", "1.253882,103.822778");
                }

                // When the person click should go to the DiningMenu page
                mContext.startActivity(intent);
            }
        });

    }
    // To determine the number of items
    @Override
    public int getItemCount() {
        return attractions.size();
    }
}
