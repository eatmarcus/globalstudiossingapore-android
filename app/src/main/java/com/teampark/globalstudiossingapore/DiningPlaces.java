package com.teampark.globalstudiossingapore;

import java.util.ArrayList;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningPlaces {
    private String diningName;
    private String diningInfo;
    private String diningDistance;
    private int imageUrl;          // to store the image of the restaurant
    private int priceRange;        // if its 1 -> 1 money bag, 2 -> 2 money bags, 3 -> 3 money bags
    private String diningCategory;


    public DiningPlaces(String name, String info, String distance,int image, int price, String category){
        diningName = name;
        diningInfo = info;
        diningDistance = distance;
        imageUrl = image;
        priceRange = price;
        diningCategory = category;
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

    public static ArrayList<DiningPlaces> createDiningList (int numOfDiningPlaces){
        ArrayList<DiningPlaces> diningList = new ArrayList<DiningPlaces>();

        for(int i = 0; i <= numOfDiningPlaces; i++){
            diningList.add(new DiningPlaces("Kentucky Chicken Restaurant",
                    "MFC, until 1991 known as M Fried Chicken, is an American fast food restaurant chain that specializes in fried chicken."
                    ,"50m",R.drawable.friedchicken, 1, "Western Food"));
            diningList.add(new DiningPlaces("Five Fingers",
                    "5FINGERS is a Singaporean chain of fast casual restaurants that specialises in crispy Asian style fried chicken"
                    ,"100m",R.drawable.fivefingers, 3, "Asian Cuisine"));
            diningList.add(new DiningPlaces("Bacon Box",
                    "Traditional korean cuisine accompanied along with their specialty bacon bits "
                    ,"10m",R.drawable.baconbox, 2, "Korean Cuisine"));
        }
        return diningList;
    }

}
