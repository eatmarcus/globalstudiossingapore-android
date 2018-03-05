package com.teampark.globalstudiossingapore;

import java.util.ArrayList;

/**
 * Created by Theresa Lee on 3/5/2018.
 */

public class DiningPlaces {
    private String diningName;
    private String diningInfo;
    private String diningDistance;
    private String imageUrl;       // to store the image of the restaurant
    private int priceRange;        // if its 1 -> 1 money bag, 2 -> 2 money bags, 3 -> 3 money bags
    private String diningCategory;


    public DiningPlaces(String name, String info, String distance, String image, int price, String category){
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

    public String getImageUrl(){
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
            diningList.add(new DiningPlaces("Dining Name" + ++lastDiningPlace,
                    "Dining info", "Dining dist", "imageURL", 1, "Dining category"));
        }
        return diningList;
    }
}
