package com.teampark.globalstudiossingapore.DAO;

import com.teampark.globalstudiossingapore.Entity.DiningCategory;
import com.teampark.globalstudiossingapore.Entity.DiningMainItem;
import com.teampark.globalstudiossingapore.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Theresa Lee on 3/19/2018.
 */

public class DiningMainsDAO {

    private static HashMap<Integer, ArrayList<DiningCategory>> restaurantHashMap;

    static{
        restaurantHashMap = new HashMap<>();

        //  Restaurant 1: Kentucky
        ArrayList<DiningMainItem> promotionItems1 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems1 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems1 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems1 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems1 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems1 = new ArrayList<>();

        // Promotion Items
        addDiningItem(promotionItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");
        addDiningItem(promotionItems1, R.drawable.mamarich, "Buffalo Sandwich", "Juicy.....");
        addDiningItem(promotionItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");
        addDiningItem(promotionItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");
        // Change the drawables, name, description

        // Creating Main Items
        addDiningItem(mainItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");

        // Creating Appetizer Items
        addDiningItem(appetizerItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");

        // Creating Dessert Items
        addDiningItem(dessertItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");

        // Creating Beverage Items
        addDiningItem(beverageItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");

        // Creating Snack Items
        addDiningItem(snackItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....");


        addRestaurant(1, promotionItems1, mainItems1, appetizerItems1, dessertItems1, beverageItems1, snackItems1);
    }

    private static void addDiningItem(ArrayList<DiningMainItem> diningMainItemList, int image, String name, String description){
        diningMainItemList.add(new DiningMainItem(image, name, description));
    }

    private static void addRestaurant(int restaurantId, ArrayList<DiningMainItem> promotionItems,
                                      ArrayList<DiningMainItem> mainItems, ArrayList<DiningMainItem> appetizerLitems,
                                      ArrayList<DiningMainItem> dessertItems, ArrayList<DiningMainItem> beverageItems,
                                      ArrayList<DiningMainItem> snacksItems) {
        DiningCategory promotionCategory = new DiningCategory('p', promotionItems);
        DiningCategory mainsCategory = new DiningCategory('m', mainItems);
        DiningCategory appetizerCategory = new DiningCategory('a', appetizerLitems);
        DiningCategory dessertCategory = new DiningCategory('d', dessertItems);
        DiningCategory beverageCategory = new DiningCategory('b', beverageItems);
        DiningCategory snacksCategory = new DiningCategory('s', snacksItems);

        ArrayList<DiningCategory> diningCategories = new ArrayList<>();

        diningCategories.add(promotionCategory);
        diningCategories.add(mainsCategory);
        diningCategories.add(appetizerCategory);
        diningCategories.add(dessertCategory);
        diningCategories.add(beverageCategory);
        diningCategories.add(snacksCategory);

        restaurantHashMap.put(restaurantId, diningCategories);
    }

    public static ArrayList<DiningCategory> getRestaurantDiningCategories(int restaurantId){
        return restaurantHashMap.get(restaurantId);
    }

    public static ArrayList<DiningMainItem> getDiningMainItems(int restaurantId, int category){
        //  Gets the 6 different dining categories
        //  promotion, mains, appetizer, desserts, beverages, snacks
        ArrayList<DiningCategory> diningCategories = getRestaurantDiningCategories(restaurantId);

        if (diningCategories == null){
            return new ArrayList<>();
        }

        //  Obtains dining main items from category stated
        return diningCategories.get(category - 1).getDiningMainItems();
    }
}
