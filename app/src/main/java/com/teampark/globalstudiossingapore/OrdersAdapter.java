package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teampark.globalstudiossingapore.Entity.Order;
import com.teampark.globalstudiossingapore.Entity.PhotoCharacter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.ViewHolder> {

    private List<Order> orderList;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public OrdersAdapter(Context context, List<Order> orderList){
        mContext = context;
        this.orderList = orderList;
    }

    private Context getContext(){
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row

        private ImageView foodImage;
        private TextView timeTextView;
        private TextView restaurantTextView;
        private TextView foodTextView;
        private TextView priceTextView;
        private TextView statusTextView;

        private CardView cardView;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            foodImage = itemView.findViewById(R.id.foodImage);
            timeTextView = itemView.findViewById(R.id.timeTextView);
            restaurantTextView = itemView.findViewById(R.id.restaurantTextView);
            foodTextView = itemView.findViewById(R.id.foodTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            statusTextView = itemView.findViewById(R.id.statusTextView);

            cardView = itemView.findViewById(R.id.cardView);
        }
    }

    // To inflate the item layout and create the holder
    @Override
    public OrdersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View photoSelectionView = inflater.inflate(R.layout.item_orders, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(photoSelectionView);
        return viewHolder;
    }

    // To set the view attributes based on the data
    @Override
    public void onBindViewHolder(OrdersAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        System.out.println(orderList.get(position));
        Order order = orderList.get(position);

        // Set item views based on your views and data model
        ImageView foodImageView = viewHolder.foodImage;
        foodImageView.setImageResource(order.getImage());

        TextView timeTextView = viewHolder.timeTextView;
        timeTextView.setText(order.getTime());

        TextView restaurantTextView = viewHolder.restaurantTextView;
        restaurantTextView.setText(order.getRestaurantName());

        TextView foodTextView = viewHolder.foodTextView;
        foodTextView.setText(order.getFoodName());

        TextView priceTextView = viewHolder.priceTextView;
        priceTextView.setText(order.getPrice());

        TextView statusTextView = viewHolder.statusTextView;
        statusTextView.setText(order.getStatus());

        CardView cardView = viewHolder.cardView;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    // To determine the number of items
    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public void updateList(ArrayList<Order> orderList){
        this.orderList = orderList;
    }

}
