package com.teampark.globalstudiossingapore.DAO;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.teampark.globalstudiossingapore.Entity.Order;
import com.teampark.globalstudiossingapore.utility.SharedPrefsUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by darrylong on 26/3/18.
 */

public class OrdersDAO {


    public static void addOrder (Order order){
        ArrayList<Order> orderList = getOrderList();
        orderList.add(order);

        SharedPrefsUtil.setObject("orders", orderList);
    }

    public static ArrayList<Order> getOrderList(){
        ArrayList<LinkedTreeMap> orders = SharedPrefsUtil.getObject("orders", ArrayList.class);

        if (orders == null){
            return new ArrayList<>();
        }


        ArrayList<Order> orderList = new ArrayList<>();

        for (LinkedTreeMap map : orders){
            String time = (String) map.get("time");
            String restaurantName = (String) map.get("restaurantName");
            String foodName = (String) map.get("foodName");
            String price = (String) map.get("price");
            String status = (String) map.get("status");
            int image = ((Double) map.get("image")).intValue();

            Order order = new Order(time, restaurantName, foodName, price, status, image);
            orderList.add(order);
        }


        return orderList;
    }

    public static void updateOrder(Order order, String status){

        ArrayList<Order> orderList = getOrderList();

        Order orderRetrieved = orderList.get(orderList.size()-1);

        orderRetrieved.setStatus("Ready");

        SharedPrefsUtil.setObject("orders", orderList);


    }


}
