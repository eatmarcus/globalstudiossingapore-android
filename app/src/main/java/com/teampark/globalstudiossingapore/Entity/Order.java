package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by darrylong on 26/3/18.
 */

public class Order {
    private String time;
    private String restaurantName;
    private String foodName;
    private String price;
    private String status;
    private int image;

    public Order(String time, String restaurantName, String foodName, String price, String status, int image) {
        this.time = time;
        this.restaurantName = restaurantName;
        this.foodName = foodName;
        this.price = price;
        this.status = status;
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public int getImage() {
        return image;
    }
}
