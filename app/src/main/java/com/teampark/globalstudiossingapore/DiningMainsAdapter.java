package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teampark.globalstudiossingapore.DAO.OrdersDAO;
import com.teampark.globalstudiossingapore.Entity.DiningMainItem;
import com.teampark.globalstudiossingapore.Entity.Order;
import com.teampark.globalstudiossingapore.utility.DialogBuilder;
import com.teampark.globalstudiossingapore.utility.NotificationUtil;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningMainsAdapter extends RecyclerView.Adapter<DiningMainsAdapter.ViewHolder> {

    private List<DiningMainItem> diningMainItems;
    private String restaurantName;
    private Context mContext;

    // Pass in the diningPlaces array into the constructor
    public DiningMainsAdapter(Context context, String restaurantName, List<DiningMainItem> diningMainItems){
        mContext = context;
        this.restaurantName = restaurantName;
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
        public TextView price;

        public CardView cardView;

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
            price = (TextView)itemView.findViewById(R.id.itemPrice);
            cardView = itemView.findViewById(R.id.cardView);

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

        TextView textViewPrice = viewHolder.price;
        textViewPrice.setText(diningMainItem.getPrice());

        CardView cardView = viewHolder.cardView;
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogBuilder.showDialog("Preorder Item", "You will be notified when your dish is ready for collection. Would you like to place an order?", mContext,
                        "YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Date currentTime = Calendar.getInstance().getTime();

                                String dateTimeString = currentTime.toString();
                                dateTimeString = dateTimeString.substring(0, dateTimeString.indexOf("GMT"));

                                Order order = new Order(dateTimeString, restaurantName, diningMainItem.getName(), diningMainItem.getPrice(), "Cooking", diningMainItem.getImage());
                                OrdersDAO.addOrder(order);

                                int timeInSeconds = 10;

                                NotificationUtil.countdownNotification(mContext, "Your " + order.getFoodName() + " is now ready!", timeInSeconds);

                                new CountDownTimer(timeInSeconds * 1000, 1000) {

                                    public void onTick(long millisUntilFinished) {
//                                      mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                                    }

                                    public void onFinish() {
                                        OrdersDAO.updateOrder(order, "Ready");

                                        notifyDataSetChanged();

                                    }
                                }.start();




                                // TODO: Show order fragment.
                                //Intent intent = new Intent(mContext, )
                            }
                        }, "NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
            }
        });

    }

    // To determine the number of items
    @Override
    public int getItemCount() {
        return diningMainItems.size();
    }

}
