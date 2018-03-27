package com.teampark.globalstudiossingapore;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

import im.delight.android.location.SimpleLocation;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningPlaces implements Comparator<DiningPlaces>, Comparable<DiningPlaces> {
    private int id;
    private String diningName;
    private String diningInfo;
    private int diningDistance;
    private int imageUrl;          // to store the image of the restaurant
    private int priceRange;        // if its 1 -> 1 money bag, 2 -> 2 money bags, 3 -> 3 money bags
    private String diningCategory;

    public DiningPlaces(){

    }

    public DiningPlaces(int id, String name, String info, int distance,int image, int price, String category){
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

    public int getDiningDistance(){
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

    public static ArrayList<DiningPlaces> createDiningList (SimpleLocation location){
        final double currentLatitude = location.getLatitude();
        final double currentLongitude = location.getLongitude();
        //GET DISTANCE TO THE DINING IN METRES
        //Kentucky
        int kentuckyDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254608, 103.821182);
        //Five fingers
        int fiveFingersDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254775, 103.821902);
        //Bacon Box
        int baconBoxDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254203, 103.821526);
        //Agisen
        int agisenDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254479, 103.822250);
        //Coastal Coffee
        int coastalDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.253554, 103.822126);
        //Food Paradise
        int foodPDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.253869, 103.823128);
        //Hoshino Sushi
        int hoshinoDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254198, 103.823609);
        //Lady Bakery
        int ladyBDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.254679, 103.823995);
        //Mamma Rich
        int mammaRDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.255165, 103.823600);
        //Tom & Jerry
        int tomJDistance = (int) location.calculateDistance(currentLatitude, currentLongitude, 1.255788, 103.822814);

        ArrayList<DiningPlaces> diningList = new ArrayList<DiningPlaces>();

        diningList.add(new DiningPlaces(1, "Kentucky Chicken Restaurant",
                "MacFC is a China fast food company specialises in fried chicken with different flavours."
                ,kentuckyDistance,R.drawable.friedchicken, 1, "Western Food"));
        diningList.add(new DiningPlaces(2, "Five Fingers",
                "5FINGERS is a classic Singaporean dish that specialises in crispy Southeast Asian style deep fried beef with curry sauce"
                ,fiveFingersDistance,R.drawable.fivefingers, 3, "Asian Cuisine"));
        diningList.add(new DiningPlaces(3, "Bacon Box",
                " Bacon box is the best destination for bacon lovers, where bacons are prepared in different ways. The most popular way is bacon toast"
                ,baconBoxDistance,R.drawable.baconbox, 2, "Korean Cuisine"));
        diningList.add(new DiningPlaces(4, "Agisen",
                "Agisen is the most authentic Japanese-style noodle. It consists of Chinese-style wheat noodles served in a meat or fish-based broth. "
                ,agisenDistance,R.drawable.agisen, 2, "Japanese Cuisine"));
        diningList.add(new DiningPlaces(5, "Coastal Coffee",
                "Coastal Coffee is an American global coffee company based in New York. We serve specialty coffees, espresso, baked goods. "
                ,coastalDistance,R.drawable.coastalcoffee, 1, "Cafe"));
        diningList.add(new DiningPlaces(6, "Food Paradise",
                "Food Paradise is the largest food court in Singapore. It serves authentic local food with affordable price. "
                ,foodPDistance,R.drawable.foodparadise, 3, "Chinese Cuisine"));
        diningList.add(new DiningPlaces(7, "Hoshino Sushi",
                "Hoshino Sushi has maintained 3 Michelin Star rating. The experienced chief is as good at storytelling as he is with his sushi-making."
                ,hoshinoDistance,R.drawable.hoshinosushi, 3, "Japanese Cuisine"));
        diningList.add(new DiningPlaces(8, "Lady Bakery",
                "Lady Bakery is the best Mille Crepe cakes in Singapore. Our signature Mille Crepes features no less than twenty paper-thin handmade crepes and we sell more than 800 pieces of crepes every day."
                ,ladyBDistance,R.drawable.ladybakery, 1, "Bakery"));
        diningList.add(new DiningPlaces(9, "Mamma Rich",
                "Step into MAMARICH, and you will fall in love with the best Thai food in the town. Our best seller is seafood tom yum."
                ,mammaRDistance,R.drawable.mamarich, 2, "Asian Cuisine"));
        diningList.add(new DiningPlaces(10, "Tom & Jerry",
                "Tom & Jerry is the Italy's largest chain of gelato. Gelato is made with a base of milk, cream and other flavourings."
                ,tomJDistance,R.drawable.tomjerry, 2, "Desserts"));
        Collections.sort(diningList ,new DiningPlaces());
        return diningList;
    }

    @Override
    public int compareTo(@NonNull DiningPlaces diningPlaces) {
        return 0;
    }

    @Override
    public int compare(DiningPlaces diningPlaces, DiningPlaces t1) {
        return diningPlaces.diningDistance - t1.diningDistance;
    }
}
