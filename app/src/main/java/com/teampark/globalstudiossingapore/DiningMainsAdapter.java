package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teampark.globalstudiossingapore.Entity.DiningMainItem;

import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningMainsAdapter extends RecyclerView.Adapter<DiningMainsAdapter.ViewHolder> {

    private List<DiningMainItem> diningMainItems;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public DiningMainsAdapter(Context context, List<DiningMainItem> diningMainItems){
        mContext = context;
        this.diningMainItems = diningMainItems;
    }

    private Context getContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView name;
        public TextView information;
        public ImageView imageView;

        private Context context;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(final Context context, View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.mainName);
            information = (TextView)itemView.findViewById(R.id.mainDescription);
            imageView = (ImageView)itemView.findViewById(R.id.mainIcon);


            // Store the context
            this.context = context;


        }
    }

    // To inflate the item layout and create the holder
    @Override
    public DiningMainsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View diningView = inflater.inflate(R.layout.item_dining_main_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(context,diningView);
        return viewHolder;
    }

    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(DiningMainsAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        final DiningMainItem diningMainItem = diningMainItems.get(position);

        // Set item views based on your views and data model
        TextView textViewName = viewHolder.name;
        textViewName.setText(diningMainItem.getName());

        TextView textViewInfo = viewHolder.information;
        textViewInfo.setText(diningMainItem.getDescription());

        ImageView imageViewRes = viewHolder.imageView;
        imageViewRes.setImageResource(diningMainItem.getImage());

    }

    // To determine the number of items
    @Override
    public int getItemCount() {
        return diningMainItems.size();
    }

}
