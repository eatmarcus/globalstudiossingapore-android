package com.teampark.globalstudiossingapore;

import java.util.ArrayList;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningPlaces {
    private int id;
    private String diningName;
    private String diningInfo;
    private String diningDistance;
    private int imageUrl;          // to store the image of the restaurant
    private int priceRange;        // if its 1 -> 1 money bag, 2 -> 2 money bags, 3 -> 3 money bags
    private String diningCategory;


    public DiningPlaces(int id, String name, String info, String distance,int image, int price, String category){
        this.id = id;
        diningName = name;
        diningInfo = info;
        diningDistance = distance;
        imageUrl = image;
        priceRange = price;
        diningCategory = category;
    }

    public int getId() {
        return id;
    }

    public String getDiningName(){
        return diningName;
    }

    public String getDiningInfo(){
        return diningInfo;
    }

    public String getDiningDistance(){
        return diningDistance;
    }

    public int getImageUrl(){
        return imageUrl;
    }

    public int getPriceRange(){
        return priceRange;
    }

    public String getDiningCategory(){
        return diningCategory;
    }

    private static int lastDiningPlace = 0;

    public static ArrayList<DiningPlaces> createDiningList (){
        ArrayList<DiningPlaces> diningList = new ArrayList<DiningPlaces>();

        diningList.add(new DiningPlaces(1, "Kentucky Chicken Restaurant",
                "MacFC is a China fast food company specialises in fried chicken with different flavours."
                ,"50m",R.drawable.friedchicken, 1, "Western Food"));
        diningList.add(new DiningPlaces(2, "Five Fingers",
                "5FINGERS is a classic Singaporean dish that specialises in crispy Southeast Asian style deep fried beef with curry sauce"
                ,"100m",R.drawable.fivefingers, 3, "Asian Cuisine"));
        diningList.add(new DiningPlaces(3, "Bacon Box",
                " Bacon box is the best destination for bacon lovers, where bacons are prepared in different ways. The most popular way is bacon toast"
                ,"10m",R.drawable.baconbox, 2, "Korean Cuisine"));
        diningList.add(new DiningPlaces(4, "Agisen",
                "Agisen is the most authentic Japanese-style noodle. It consists of Chinese-style wheat noodles served in a meat or fish-based broth. "
                ,"20m",R.drawable.agisen, 2, "Japanese Cuisine"));
        diningList.add(new DiningPlaces(5, "Coastal Coffee",
                "Coastal Coffee is an American global coffee company based in New York. We serve specialty coffees, espresso, baked goods. "
                ,"15m",R.drawable.coastalcoffee, 1, "Cafe"));
        diningList.add(new DiningPlaces(6, "Food Paradise",
                "Food Paradise is the largest food court in Singapore. It serves authentic local food with affordable price. "
                ,"15m",R.drawable.foodparadise, 3, "Chinese Cuisine"));
        diningList.add(new DiningPlaces(7, "Hoshino Sushi",
                "Hoshino Sushi has maintained 3 Michelin Star rating. The experienced chief is as good at storytelling as he is with his sushi-making."
                ,"10m",R.drawable.hoshinosushi, 3, "Japanese Cuisine"));
        diningList.add(new DiningPlaces(8, "Lady Bakery",
                "Lady Bakery is the best Mille Crepe cakes in Singapore. Our signature Mille Crepes features no less than twenty paper-thin handmade crepes and we sell more than 800 pieces of crepes every day."
                ,"5m",R.drawable.ladybakery, 1, "Bakery"));
        diningList.add(new DiningPlaces(9, "Mamma Rich",
                "Step into MAMARICH, and you will fall in love with the best Thai food in the town. Our best seller is seafood tom yum."
                ,"20m",R.drawable.mamarich, 2, "Asian Cuisine"));
        diningList.add(new DiningPlaces(10, "Tom & Jerry",
                "Tom & Jerry is the Italy's largest chain of gelato. Gelato is made with a base of milk, cream and other flavourings."
                ,"10m",R.drawable.tomjerry, 2, "Desserts"));

        return diningList;
    }

}
