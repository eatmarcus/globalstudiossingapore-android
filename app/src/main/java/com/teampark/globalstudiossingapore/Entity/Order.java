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

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (image != order.image) return false;
        if (time != null ? !time.equals(order.time) : order.time != null) return false;
        if (restaurantName != null ? !restaurantName.equals(order.restaurantName) : order.restaurantName != null)
            return false;
        if (foodName != null ? !foodName.equals(order.foodName) : order.foodName != null)
            return false;
        if (price != null ? !price.equals(order.price) : order.price != null) return false;
        return status != null ? status.equals(order.status) : order.status == null;
    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (restaurantName != null ? restaurantName.hashCode() : 0);
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + image;
        return result;
    }
}
