package com.teampark.globalstudiossingapore.DAO;

import com.teampark.globalstudiossingapore.Entity.Order;
import com.teampark.globalstudiossingapore.utility.SharedPrefsUtil;

import java.util.ArrayList;

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
        ArrayList<Order> orders = SharedPrefsUtil.getObject("orders", ArrayList.class);

        if (orders == null){
            return new ArrayList<>();
        }
        return orders;
    }


}
