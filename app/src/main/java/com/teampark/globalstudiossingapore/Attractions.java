package com.teampark.globalstudiossingapore;

import java.util.ArrayList;

/**
 * Created by Theresa Lee on 3/24/2018.
 */

public class Attractions {
    private int id;                      // Attraction id
    private String attractionName;
    private String attractionInfo;
    private String attractionQueue;
    private int imageUrl;                // to store the image of the restaurant
    private String attractionCategory;
    private String attractionAgeRange;


    public Attractions(int id, String name, String info, String queue,int image, String category, String ageRange){
        this.id = id;
        attractionName = name;
        attractionInfo = info;
        attractionQueue = queue;
        imageUrl = image;
        attractionCategory = category;
        attractionAgeRange = ageRange;
    }

    public int getId() {
        return id;
    }

    public String getAttractionName(){
        return attractionName;
    }

    public String getAttractionInfo(){
        return attractionInfo;
    }

    public String getAttractionQueue(){
        return attractionQueue;
    }

    public int getImageUrl(){
        return imageUrl;
    }

    public String getAttractionCategory(){
        return attractionCategory;
    }

    public String getAttractionAgeRange(){return attractionAgeRange;}

    public static ArrayList<Attractions> createAttractionList (){
        ArrayList<Attractions> attractionList = new ArrayList<Attractions>();

        attractionList.add(new Attractions(1, "Steaming Demon",
                "Plunge into total darkness on this indoor roller coaster as you may come to face with warrior mummies and scarab beetles!"
                ,"50mins",R.drawable.attractions1, "Ancient Egypt", "All Ages"));
        attractionList.add(new Attractions(2, "Dare Devil",
                "Cylon – as you engage in the ultimate intergalactic battle between good and evil on the world’s tallest dueling roller coasters!"
                ,"100mins",R.drawable.attractions2, "Sci-fi City", "All Ages"));
        attractionList.add(new Attractions(3, "Thomie's Mine Train",
                " Test your intergalactic stamina on this whirling twirling attraction."
                ,"10mins",R.drawable.attractions3, "Sci-fi City", "All Ages"));
        attractionList.add(new Attractions(4, "Sponglash Wave Pool",
                "Join OPTIMUS PRIME and the AUTOBOTS as you become a freedom fighter in the ultimate 3D battle against the forces of evil. "
                ,"20mins",R.drawable.attractions4, "Sci-Fi City", "All Ages"));
        attractionList.add(new Attractions(5, "Raging River",
                "Young explorers can drive their own desert jeep through an abandoned Egyptian excavation site."
                ,"15mins",R.drawable.attractions5, "Resort Jungle", "All Ages"));
        attractionList.add(new Attractions(6, "Canopy Flyer",
                "Enjoy a prehistoric bird’s-eye view as you soar over Jurassic Park®."
                ,"15mins",R.drawable.attractions7, "Jurassic Park", "All Ages"));
        attractionList.add(new Attractions(7, "Jurassic Park Rapids Adventure",
                "Enjoy a thrilling river raft ride through primeval dinosaur habitats where you will get wet and possibly soaked."
                ,"10mins",R.drawable.attractions6, "Jurassic Park", "All Ages"));
        attractionList.add(new Attractions(8, "Enchanted Airways",
                "Climb aboard this junior roller coaster for a flight over Far Far Away."
                ,"5mins",R.drawable.attractions8, "Far Far Away", "All Ages"));
        attractionList.add(new Attractions(9, "Crate Adventure",
                "Go on an unforgettable river boat ride with our four heroes, Alex, Marty, Melman and Gloria."
                ,"20mins",R.drawable.attractions9, "Madagascar", "All Ages"));
        attractionList.add(new Attractions(10, "Puss In Boots",
                "Hop onto the world’s first Puss In Boots’ Giant Journey roller coaster & join Puss on this swashbuckling adventure"
                ,"10mins",R.drawable.attractions10,"Ancient Egypt", "All Ages"));

        return attractionList;
    }
}
