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

        addDiningItem(promotionItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Main Items
        addDiningItem(mainItems1, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(mainItems1, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt","$10.0" );
        addDiningItem(mainItems1, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest without being over powering.","$10.0");
        addDiningItem(mainItems1, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb encrusted gooey mac n cheese, is just the beginning of your palate pleasures!","$10.0");
        addDiningItem(mainItems1, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned flour, and fry them in hot oil until crisp!","$10.0");

        // Creating Appetizer Items
        addDiningItem(appetizerItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Dessert Items
        addDiningItem(dessertItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Beverage Items
        addDiningItem(beverageItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Snack Items
        addDiningItem(snackItems1, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 2: Five Fingers
        ArrayList<DiningMainItem> promotionItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems2 = new ArrayList<>();

        // Promotion Items
        addDiningItem(promotionItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Main Items
        addDiningItem(mainItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Appetizer Items
        addDiningItem(appetizerItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Dessert Items
        addDiningItem(dessertItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Beverage Items
        addDiningItem(beverageItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        // Creating Snack Items
        addDiningItem(snackItems2, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 3: Bacon Box
        ArrayList<DiningMainItem> promotionItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems3 = new ArrayList<>();

        addDiningItem(promotionItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems3, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 4: Agisen
        ArrayList<DiningMainItem> promotionItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems4 = new ArrayList<>();

        addDiningItem(promotionItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems4, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 5: Coastal Coffee
        ArrayList<DiningMainItem> promotionItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems5 = new ArrayList<>();

        addDiningItem(promotionItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems5, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 6: Food Paradise
        ArrayList<DiningMainItem> promotionItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems6 = new ArrayList<>();

        addDiningItem(promotionItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems6, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 7: Hoshino Sushi
        ArrayList<DiningMainItem> promotionItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems7 = new ArrayList<>();

        addDiningItem(promotionItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems7, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 8: Lady Bakery
        ArrayList<DiningMainItem> promotionItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems8 = new ArrayList<>();

        addDiningItem(promotionItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems8, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 9: Mamma Rich
        ArrayList<DiningMainItem> promotionItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems9 = new ArrayList<>();

        addDiningItem(promotionItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems9, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");

        //  Restaurant 10: Tom & Jerry
        ArrayList<DiningMainItem> promotionItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems10 = new ArrayList<>();

        addDiningItem(promotionItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(mainItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(appetizerItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(dessertItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(beverageItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");
        addDiningItem(snackItems10, R.drawable.mamarich, "Buffalo Burger", "Juicy.....","$10.0");


        addRestaurant(1, promotionItems1, mainItems1, appetizerItems1, dessertItems1, beverageItems1, snackItems1);
        addRestaurant(2, promotionItems2, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(3, promotionItems3, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(4, promotionItems4, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(5, promotionItems5, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(6, promotionItems6, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(7, promotionItems7, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(8, promotionItems8, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(9, promotionItems9, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
        addRestaurant(10, promotionItems10, mainItems2, appetizerItems2, dessertItems2, beverageItems2, snackItems2);
    }

    private static void addDiningItem(ArrayList<DiningMainItem> diningMainItemList, int image, String name, String description, String price){
        diningMainItemList.add(new DiningMainItem(image, name, description, price));
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
