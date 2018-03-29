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
        addDiningItem(promotionItems1, R.drawable.res1promo1, "Cheesy Beef Burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems1, R.drawable.res1promo2, "Buttermilk Chicken Sandwich", "Marinating the chicken in buttermilk overnight makes it super succulent and juicy with fresh cucumber on top of the chicken","$12.9");
        addDiningItem(promotionItems1, R.drawable.res1promo3, "Tuna Salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper. Toss with cherry tomatoes and oil-packed tuna","$10.0");
        addDiningItem(promotionItems1, R.drawable.res1promo4, "Chicken Breast Salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$11.0");
        addDiningItem(promotionItems1, R.drawable.res1promo5, "Pulled Pork Burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$9.0");
        addDiningItem(promotionItems1, R.drawable.res1promo6, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$15.0");
        addDiningItem(promotionItems1, R.drawable.res1promo7, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$11.0");
        addDiningItem(promotionItems1, R.drawable.res1promo8, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$9.8");
        addDiningItem(promotionItems1, R.drawable.res1promo9, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$12.0");
        addDiningItem(promotionItems1, R.drawable.res1promo10, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");

        // Creating Main Items
        addDiningItem(mainItems1, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$15.0");
        addDiningItem(mainItems1, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt","$16.0" );
        addDiningItem(mainItems1, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest without being over powering.","$20.0");
        addDiningItem(mainItems1, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb encrusted gooey mac n cheese, is just the beginning of your palate pleasures!","$12.5");
        addDiningItem(mainItems1, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned flour, and fry them in hot oil until crisp!","$19.0");
        addDiningItem(mainItems1, R.drawable.res1main5, "Tuna Salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper. Toss with cherry tomatoes and oil-packed tuna","$10.0");
        addDiningItem(mainItems1, R.drawable.res1main1, "Chicken Breast Salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$9.0");
        addDiningItem(mainItems1, R.drawable.res1main2, "Pulled Pork Burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$14.0");
        addDiningItem(mainItems1, R.drawable.res1main3, "Tuna Salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper. Toss with cherry tomatoes and oil-packed tuna","$10.0");
        addDiningItem(mainItems1, R.drawable.res1main4, "Chicken Breast Salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$12.0");
        addDiningItem(mainItems1, R.drawable.res1main5, "Pulled Pork Burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$14.2");

        // Creating Appetizer Items
        addDiningItem(appetizerItems1, R.drawable.res1app1, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$13.4");
        addDiningItem(appetizerItems1, R.drawable.res1app2, "Chinese Pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$14.0");
        addDiningItem(appetizerItems1, R.drawable.res1app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$17.0");
        addDiningItem(appetizerItems1, R.drawable.res1app4, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling of chopped shrimp,  julienned carrots, grated fresh ginger, sesame oil","$12.4");
        addDiningItem(appetizerItems1, R.drawable.res1app5, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, green onions, ginger, and water chestnuts","$14.0");
        addDiningItem(appetizerItems1, R.drawable.res1app6, "French Macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline…….","$12.5");
        addDiningItem(appetizerItems1, R.drawable.res1app7, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems1, R.drawable.res1app8, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems1, R.drawable.res1app9, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$13.0");
        addDiningItem(appetizerItems1, R.drawable.res1app10, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$9.0");

        // Creating Dessert Items
        addDiningItem(dessertItems1, R.drawable.res1dess1, "Chocolate Pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$13.0");
        addDiningItem(dessertItems1, R.drawable.res1dess2, "Layered Lime Cheesecake", "Let this stunning layered, citrussy dessert melt in your mouth. It's a crowd-pleaser!","$10.0");
        addDiningItem(dessertItems1, R.drawable.res1dess3, "Ice Cream Cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems1, R.drawable.res1dess4, "Raspberry Cheesecake Cookies", "Wonderful combination of raspberry and white chocolate made the cookies light, crispy and addicting","$15.0");
        addDiningItem(dessertItems1, R.drawable.res1dess5, "French Macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline…….","$10.0");
        addDiningItem(dessertItems1, R.drawable.res1dess1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$10.0");
        addDiningItem(dessertItems1, R.drawable.res1dess4, "Green Bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems1, R.drawable.res1dess2, "Sweet Corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$12.0");
        addDiningItem(dessertItems1, R.drawable.res1dess5, "French Fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$7.0");
        addDiningItem(dessertItems1, R.drawable.res1dess3, "Mashed Potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

        // Creating Beverage Items
        addDiningItem(beverageItems1, R.drawable.res1bev1, "Soft Drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$8.9");
        addDiningItem(beverageItems1, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems1, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems1, R.drawable.res1bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$6.0");
        addDiningItem(beverageItems1, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems1, R.drawable.res1bev1, "Soft Drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$5.0");
        addDiningItem(beverageItems1, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems1, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems1, R.drawable.res1bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$2.0");
        addDiningItem(beverageItems1, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$5.0");

        // Creating Snack Items
        addDiningItem(snackItems1, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$4.0");
        addDiningItem(snackItems1, R.drawable.res1sides2, "Green Bean", "Fresh green beans are prepared pressure cooker","$8.0");
        addDiningItem(snackItems1, R.drawable.res1sides3, "Sweet Corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$12.0");
        addDiningItem(snackItems1, R.drawable.res1sides4, "French Fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides5, "Mashed Potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides2, "Green Bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides4, "Sweet Corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides3, "French Fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems1, R.drawable.res1sides5, "Mashed Potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

        //  Restaurant 2: Five Fingers
        ArrayList<DiningMainItem> promotionItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems2 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems2 = new ArrayList<>();

        // Promotion Items
        addDiningItem(promotionItems2, R.drawable.res2promo1, "Beef Curry Rice", "Home-made curry sauce with fresh beef, carrots, potatoes ","$13.0");
        addDiningItem(promotionItems2, R.drawable.res2promo2, "Udon", "Authentic Japanese Udon with soy sauce, mirin and negi","$10.0");
        addDiningItem(promotionItems2, R.drawable.res2promo3, "Gyudon", "Japanese rice with beef on the top seasoned with different ingredients and spices, it can be served in 5 minutes","$10.0");
        addDiningItem(promotionItems2, R.drawable.res2promo4, "Yakitori", "A mix of vegetables and meat cooked in a grill and dipped in teriaki sauce","$10.0");
        addDiningItem(promotionItems2, R.drawable.res2promo5, "Miso Soup", "A soup made from a miso paste and dashi with pieces of tofu, onion wakane seaweed","$9.0");
        addDiningItem(promotionItems2, R.drawable.res2promo1, "Beef Curry Rice", "Home-made curry sauce with fresh beef, carrots, potatoes ","$15.0");
        addDiningItem(promotionItems2, R.drawable.res2promo2, "Udon", "Authentic Japanese Udon with soy sauce, mirin and negi","$10.0");
        addDiningItem(promotionItems2, R.drawable.res2promo3, "Gyudon", "Japanese rice with beef on the top seasoned with different ingredients and spices, it can be served in 5 minutes","$10.0");
        addDiningItem(promotionItems2, R.drawable.res2promo4, "Yakitori", "A mix of vegetables and meat cooked in a grill and dipped in teriaki sauce","$13.0");
        addDiningItem(promotionItems2, R.drawable.res2promo5, "Miso Soup", "A soup made from a miso paste and dashi with pieces of tofu, onion wakane seaweed","$10.0");

        // Creating Main Items
        addDiningItem(mainItems2, R.drawable.res2main1, "Kagoshima Pork Katsu", "Japanese pork cutlet","$10.0");
        addDiningItem(mainItems2, R.drawable.res2main2, "Chicken Teriyaki", "Grilled Chicken with our special teriyaki sauce","$16.0");
        addDiningItem(mainItems2, R.drawable.res2main3, "Ten Don", "Deep-fried shrimp and vegetables on rice with tempura sauce","$10.0");
        addDiningItem(mainItems2, R.drawable.res2main4, "Kaki Age Udon", "Vegetable tempura udon","$10.0");
        addDiningItem(mainItems2, R.drawable.res2main1, "Tempura Soba", "Hot soba noodle soup with shrimp and vegetable tempura","$4.0");
        addDiningItem(mainItems2, R.drawable.res2main3, "Kagoshima Pork Katsu", "Japanese pork cutlet","$10.0");
        addDiningItem(mainItems2, R.drawable.res2main2, "Chicken Teriyaki", "Grilled Chicken with our special teriyaki sauce","$10.0");
        addDiningItem(mainItems2, R.drawable.res2main4, "Ten Don", "Deep-fried shrimp and vegetables on rice with tempura sauce","$11.3");
        addDiningItem(mainItems2, R.drawable.res2main1, "Kaki Age Udon", "Vegetable tempura udon","$13.0");
        addDiningItem(mainItems2, R.drawable.res2main3, "Tempura Soba", "Hot soba noodle soup with shrimp and vegetable tempura","$13.6");

        // Creating Appetizer Items
        addDiningItem(appetizerItems2, R.drawable.res2app1, "Edamame", "Lightly salted soybean pods steamed to perfection","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app2, "Pitan Tofu", "Softness from the tofu, creaminess from the century egg sauce and bursting crunchiness from the tobiko","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app3, "Onsen Tamago", "Half boiled hot spring egg","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app4, "Sashimi Starter", "6 pieces of assorted sashimi","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app5, "Tempura", "A soft battered, deep-fried dish. Served with tempura sauce.","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app3, "Edamame", "Lightly salted soybean pods steamed to perfection","$13.0");
        addDiningItem(appetizerItems2, R.drawable.res2app1, "Pitan Tofu", "Softness from the tofu, creaminess from the century egg sauce and bursting crunchiness from the tobiko","$10.0");
        addDiningItem(appetizerItems2, R.drawable.res2app4, "Onsen Tamago", "Half boiled hot spring egg","$12.0");
        addDiningItem(appetizerItems2, R.drawable.res2app2, "Sashimi Starter", "6 pieces of assorted sashimi","$13.0");
        addDiningItem(appetizerItems2, R.drawable.res2app5, "Tempura", "A soft battered, deep-fried dish. Served with tempura sauce.","$10.0");

        // Creating Dessert Items
        addDiningItem(dessertItems2, R.drawable.res2dess1, "Ice cream", "Matcha, Black sesame, Strawberry, vanilla","$15.0");
        addDiningItem(dessertItems2, R.drawable.res2dess2, "Sherbet", "Yuzu, grape, black sesame","$10.0");
        addDiningItem(dessertItems2, R.drawable.res2dess3, "Jelly", "Orange, strawberry, grape, peach","$6.3");
        addDiningItem(dessertItems2, R.drawable.res2dess4, "Ice Cream Wafer", "Chocolate wafer, Taiyaki ice cream","$13.0");
        addDiningItem(dessertItems2, R.drawable.res2dess5, "Cake", "Fluffy cheesecake, dark chocolate, Matcha swiss roll","$3.0");
        addDiningItem(dessertItems2, R.drawable.res2dess4, "Ice Cream", "Matcha, Black sesame, Strawberry, vanilla","$4.9");
        addDiningItem(dessertItems2, R.drawable.res2dess3, "Sherbet", "Yuzu, grape, black sesame","$10.0");
        addDiningItem(dessertItems2, R.drawable.res2dess1, "Jelly", "Orange, strawberry, grape, peach","$2.3");
        addDiningItem(dessertItems2, R.drawable.res2dess2, "Ice Cream Wafer", "Chocolate wafer, Taiyaki ice cream","$11.0");
        addDiningItem(dessertItems2, R.drawable.res2dess5, "Cake", "Fluffy cheesecake, dark chocolate, Matcha swiss roll","$11.9");

        // Creating Beverage Items
        addDiningItem(beverageItems2, R.drawable.res2bev1, "Soft Drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems2, R.drawable.res2bev2, "Japanese Green tea", "Hot and cold ","$12.0");
        addDiningItem(beverageItems2, R.drawable.res2bev3, "Fruit Juice", "Orange, watermelon, Passion mango, Lime","$10.0");
        addDiningItem(beverageItems2, R.drawable.res2bev4, "Sake", "Warm and cold","$7.0");
        addDiningItem(beverageItems2, R.drawable.res2bev5, "Beer", "Tiger, Sapporo, Asahi, Kirin","$13.0");
        addDiningItem(beverageItems2, R.drawable.res2bev2, "Soft Drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$4.9");
        addDiningItem(beverageItems2, R.drawable.res2bev4, "Japanese Green Tea", "Hot and cold ","$12.0");
        addDiningItem(beverageItems2, R.drawable.res2bev1, "Fruit Juice", "Orange, watermelon, Passion mango, Lime","$8.0");
        addDiningItem(beverageItems2, R.drawable.res2bev3, "Sake", "Warm and cold","$11.3");
        addDiningItem(beverageItems2, R.drawable.res2bev5, "Beer", "Tiger, Sapporo, Asahi, Kirin","$8.9");

        // Creating Snack Items
        addDiningItem(snackItems2, R.drawable.res2snack1, "Golden Mango Roll", "King prawn sushi roll top with mango","$5.0");
        addDiningItem(snackItems2, R.drawable.res2snack2, "Unagi Roll", "Ell, mango and cucumber roll","$3.0");
        addDiningItem(snackItems2, R.drawable.res2snack3, "Tamagoyaki", "Japanese rolled omelette","$7.0");
        addDiningItem(snackItems2, R.drawable.res2snack1, "Salmon Skin Roll", "Grilled salmon skin, avocado, cucumber, masago","$10.0");
        addDiningItem(snackItems2, R.drawable.res2snack2, "Soft Shell Crab Roll", "Soft shell, Avocado, Paprika, Masago","$10.0");
        addDiningItem(snackItems2, R.drawable.res2snack1, "Golden Mango Roll", "King prawn sushi roll top with mango","$4.0");
        addDiningItem(snackItems2, R.drawable.res2snack2, "Unagi Roll", "Ell, mango and cucumber roll","$10.6");
        addDiningItem(snackItems2, R.drawable.res2snack3, "Tamagoyaki", "Japanese rolled omelette","$9.3");
        addDiningItem(snackItems2, R.drawable.res2snack1, "Salmon Skin Roll", "Grilled salmon skin, avocado, cucumber, masago","$10.0");
        addDiningItem(snackItems2, R.drawable.res2snack2, "CrabStick roll", "Soft shell, Avocado, Paprika, Masago","$12.0");

        //  Restaurant 3: Bacon Box
        ArrayList<DiningMainItem> promotionItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems3 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems3 = new ArrayList<>();

        addDiningItem(promotionItems3, R.drawable.res3promo1, "Cheesy Beef Burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$12.0");
        addDiningItem(promotionItems3, R.drawable.res3promo2, "Buttermilk Chicken Sandwich", "Marinating the chicken in buttermilk overnight makes it super succulent chicken","$10.0");
        addDiningItem(promotionItems3, R.drawable.res3promo3, "Tuna Salad", "Mix cannellini beans, capers, pickled mushrooms, lemon juice, salt and pepper.","$10.0");
        addDiningItem(promotionItems3, R.drawable.res3promo4, "Chicken Breast Salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.2");
        addDiningItem(promotionItems3, R.drawable.res3promo5, "Pulled Pork Burger", "Whisk together the mayonnaise, cider vinegar added cabbage mixture","$10.0");
        addDiningItem(promotionItems3, R.drawable.res3promo2, "Crispy Honey Chicken", "Popular Choice! The crunchy skin with tender meat","$12.0");
        addDiningItem(promotionItems3, R.drawable.res3promo4, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper & salt.","$23.0");
        addDiningItem(promotionItems3, R.drawable.res3promo1, "Crispy Honey Chicken", "Krispy skin accompanied with white meat!","$15.0");
        addDiningItem(promotionItems3, R.drawable.res3promo3, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$14.0");
        addDiningItem(promotionItems3, R.drawable.res3promo5, "Glazed Honey Chicken", "The most tender meat accompanied with special house sauce.","$11.0");

        addDiningItem(mainItems3, R.drawable.res1main1, "Crispy Honey Chicken", "The skin is extremely crunchy, but the white meat is relatively soft.","$12.0");
        addDiningItem(mainItems3, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$11.0");
        addDiningItem(mainItems3, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest.","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb encrusted gooey mac n cheese!","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned flour!","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main5, "Tuna salad", "Mix cannellini beans, capers, lemon juice, salt and pepper tuna","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main1, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$15.0");
        addDiningItem(mainItems3, R.drawable.res1main2, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar mixture","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main4, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms.Tossed with cherry tomatoes & tuna","$10.0");
        addDiningItem(mainItems3, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$12.0");
        addDiningItem(mainItems3, R.drawable.res1main5, "Pulled pork burger", "Whisk together the mayonnaise, pepper in a medium bowl!","$10.0");

        addDiningItem(appetizerItems3, R.drawable.res3app1, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app2, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app2, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling sesame grilled eggs","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app1, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ginger, and water chestnuts","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app2, "French macarons", "Up to 25 flavours, lemon, lavender coconut, Salted Caramel Praline…….","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app3, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3promo1, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app1, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems3, R.drawable.res3app3, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems3, R.drawable.res1dess4, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess2, "Layered lime cheesecake", "Let this stunning layered, citrussy dessert melt in your mouth.","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess4, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and white chocolate!","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess2, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender.","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess3, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with mayonnaise","$10.0");
        addDiningItem(dessertItems3, R.drawable.res1dess2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems3, R.drawable.res1dess5, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess3, "French fries", "There is nothing better than a hot and fresh French fries! ","$10.0");
        addDiningItem(dessertItems3, R.drawable.res3dess4, "Mashed potato", "Classic smooth and creamy mashed potato with butter & pepper","$10.0");

        addDiningItem(beverageItems3, R.drawable.res1bev1, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev1, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems3, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems3, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage!","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries!","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with butter, salt and pepper","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded cabbage with mayonnaise","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides1, "French fries", "There is nothing better than a hot and fresh French fries! ","$10.0");
        addDiningItem(snackItems3, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato parmesan cheese!","$10.0");


        //  Restaurant 4: Agisen
        ArrayList<DiningMainItem> promotionItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems4 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems4 = new ArrayList<>();

        addDiningItem(promotionItems4, R.drawable.res1promo1, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo2, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk overnight!","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo3, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives.","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo4, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar mixture","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo4, "Crispy Honey Chicken", "The most popular main in the restaurant. Juicy White meat with in house sauce.","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo2, "Crispy Honey Chicken", "Popular Selection with tender juicy meat!","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo3, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems4, R.drawable.res1promo5, "Crispy Honey Chicken", "The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");

        addDiningItem(mainItems4, R.drawable.res1main1, "Crispy Honey Chicken", "The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce with the chicken!","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty mac n cheese, your palate pleasures!","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, chicken deep fried crisp!","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main1, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and tuna","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main5, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main1, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, cabbage mixture","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, oil-packed tuna","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems4, R.drawable.res1main4, "Pulled pork burger", "Whisk together with sugar, and some salt and pepper added to the cabbage mixture","$10.0");

        addDiningItem(appetizerItems4, R.drawable.res1app1, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app2, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app4, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling of chopped shrimp","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app5, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, water chestnuts","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app1, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, Salted Caramel Praline…….","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app1, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems4, R.drawable.res1app5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems4, R.drawable.res2dess1, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess2, "Layered lime cheesecake", "Let this stunning layered, citrussy dessert melt in your mouth!","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess4, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and white chocolate cookies.","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess5, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess1, "Coleslaw", "A condiment consisting primarily of finely-shredded cabbage topped with mayonnaise","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess2, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess5, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt! ","$10.0");
        addDiningItem(dessertItems4, R.drawable.res2dess4, "Mashed potato", "Classic smooth and creamy mashed potato with butter garlic, salt!","$10.0");

        addDiningItem(beverageItems4, R.drawable.res2bev1, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev3, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev2, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev1, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems4, R.drawable.res2bev4, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems4, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with vinaigrette dressing","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries!","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides3, "Mashed potato", "Classic smooth and creamy mashed potato with butter, and pepper","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded cabbage with a salad dressing!","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides5, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides3, "French fries", "There is nothing better than a hot and fresh Truffle French fries! ","$10.0");
        addDiningItem(snackItems4, R.drawable.res1sides4, "Mashed potato", "Classic smooth and creamy mashed potato with buttered pepper!","$10.0");


        //  Restaurant 5: Coastal Coffee
        ArrayList<DiningMainItem> promotionItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems5 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems5 = new ArrayList<>();

        addDiningItem(promotionItems5, R.drawable.res3promo1, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo2, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk juicy with fresh chicken","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo3, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery salt and pepper.","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo4, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, cabbage mixture","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo3, "Crispy Honey Chicken", "The most popular main in the restaurant white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo4, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo2, "Crispy Honey Chicken", "The most popular main in the restaurant.","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems5, R.drawable.res3promo3, "Crispy Honey Chicken", "The most popular main in the restaurant.","$10.0");

        addDiningItem(mainItems5, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant.","$10.0");
        addDiningItem(mainItems5, R.drawable.res2main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of paprika, and salt.","$10.0");
        addDiningItem(mainItems5, R.drawable.res2main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce with chicken.","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb gooey mac n cheese!","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned flour until crisp!","$10.0");
        addDiningItem(mainItems5, R.drawable.res2main1, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard toss tuna","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main4, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, added to the cabbage mixture","$10.0");
        addDiningItem(mainItems5, R.drawable.res2main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives, lemon juice, salt and pepper.","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main5, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems5, R.drawable.res1main3, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, added to the cabbage mixture","$10.0");

        addDiningItem(appetizerItems5, R.drawable.res1app8, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app1, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app2, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app3, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a ginger, sesame oil","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app4, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, and water chestnuts","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app5, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app6, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app7, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app9, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems5, R.drawable.res1app10, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems5, R.drawable.res2dess1, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess2, "Layered lime cheesecake", "Let this stunning layered, citrussy dessert melt in your mouth.","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess4, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and cookies light, crispy and addicting","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess5, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, coconut, Salted Caramel Praline…….","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess2, "Coleslaw", "A condiment consisting primarily of finely-shredded raw vinaigrette or mayonnaise","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess1, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(dessertItems5, R.drawable.res2dess2, "Mashed potato", "Classic smooth and creamy mashed potato with butter, cream cheese, garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems5, R.drawable.res1bev2, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev4, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev1, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev5, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems5, R.drawable.res1bev2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems5, R.drawable.res2snack1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw mayonnaise salad dressing","$10.0");
        addDiningItem(snackItems5, R.drawable.res2snack2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems5, R.drawable.res2snack3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems5, R.drawable.res2snack1, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems5, R.drawable.res2snack2, "Mashed potato", "Classic smooth and creamy mashed potato with butter, cream cheese, salt, and pepper","$10.0");
        addDiningItem(snackItems5, R.drawable.res2snack3, "Coleslaw", "A condiment consisting primarily of finely-shredded raw vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems5, R.drawable.res1sides1, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems5, R.drawable.res1sides2, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems5, R.drawable.res1sides3, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems5, R.drawable.res1sides4, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives & sscream cheese","$10.0");


        //  Restaurant 6: Food Paradise
        ArrayList<DiningMainItem> promotionItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems6 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems6 = new ArrayList<>();

        addDiningItem(promotionItems6, R.drawable.res1promo9, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems6, R.drawable.res1promo8, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk overnight makes it super juicy chicken","$13.0");
        addDiningItem(promotionItems6, R.drawable.res1promo7, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms. Toss with cherry tomatoes and oil-packed tuna","$16.3");
        addDiningItem(promotionItems6, R.drawable.res1promo6, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$14.0");
        addDiningItem(promotionItems6, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt cabbage mixture","$10.0");
        addDiningItem(promotionItems6, R.drawable.res1promo4, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, white meat soft.","$10.0");
        addDiningItem(promotionItems6, R.drawable.res1promo3, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$13.0");
        addDiningItem(promotionItems6, R.drawable.res1promo2, "Crispy Honey Chicken", "The most popular main in the restaurant. Extremely crunchy,  tender white meat!","$12.0");
        addDiningItem(promotionItems6, R.drawable.res1promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems6, R.drawable.res1promo10, "Crispy Honey Chicken", "The most popular main is crunchy, but relatively soft white meat .","$10.3");

        addDiningItem(mainItems6, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy!","$10.0");
        addDiningItem(mainItems6, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(mainItems6, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest!","$10.0");
        addDiningItem(mainItems6, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb encrusted pleasures!","$10.0");
        addDiningItem(mainItems6, R.drawable.res2main3, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned crisp!","$13.0");
        addDiningItem(mainItems6, R.drawable.res1main4, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, tuna","$11.0");
        addDiningItem(mainItems6, R.drawable.res1main2, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.7");
        addDiningItem(mainItems6, R.drawable.res1main1, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, pepper in a medium bowl cabbage mixture","$10.0");
        addDiningItem(mainItems6, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery packed tuna","$10.2");
        addDiningItem(mainItems6, R.drawable.res2main2, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$13.0");
        addDiningItem(mainItems6, R.drawable.res1main1, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, and then add to the cabbage mixture","$10.0");

        addDiningItem(appetizerItems6, R.drawable.res1app8, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app7, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app6, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app5, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling of chopped shrimp, sesame oil","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app4, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, and water chestnuts","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app3, "French macarons", "Up to 25 flavours, lavender coconut, Salted Caramel Praline…….","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app1, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems6, R.drawable.res1app3, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems6, R.drawable.res1dess1, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems6, R.drawable.res1dess2, "Layered lime cheesecake", "It's a crowd-pleaser that's part key lime pie, part cheesecake, part trifle","$3.0");
        addDiningItem(dessertItems6, R.drawable.res1dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$20.3");
        addDiningItem(dessertItems6, R.drawable.res1dess4, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and white chocolate.","$10.5");
        addDiningItem(dessertItems6, R.drawable.res1dess5, "French macarons", "Up to 25 flavours, including Strawberry coconut, Salted Caramel Praline.","$12.0");
        addDiningItem(dessertItems6, R.drawable.res1dess1, "Coleslaw", "A condiment consisting primarily of finely-shredded cabbage with salad dressing","$3.0");
        addDiningItem(dessertItems6, R.drawable.res1dess2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems6, R.drawable.res1dess4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$9.0");
        addDiningItem(dessertItems6, R.drawable.res1dess5, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(dessertItems6, R.drawable.res1dess1, "Mashed potato", "Classic smooth and creamy mashed potato with butter, garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems6, R.drawable.res1bev2, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$2.0");
        addDiningItem(beverageItems6, R.drawable.res1bev4, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$5.0");
        addDiningItem(beverageItems6, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev1, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$9.0");
        addDiningItem(beverageItems6, R.drawable.res1bev2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev3, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev4, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev5, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev1, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems6, R.drawable.res1bev2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems6, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw mayonnaise","$10.0");
        addDiningItem(snackItems6, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.5");
        addDiningItem(snackItems6, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$12.0");
        addDiningItem(snackItems6, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries!","$13.0");
        addDiningItem(snackItems6, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with butter, garlic, salt, and pepper","$10.0");
        addDiningItem(snackItems6, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems6, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$31.0");
        addDiningItem(snackItems6, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$20.0");
        addDiningItem(snackItems6, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries! ","$16.0");
        addDiningItem(snackItems6, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with butter, cream cheese!","$12.0");

        //  Restaurant 7: Hoshino Sushi
        ArrayList<DiningMainItem> promotionItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems7 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems7 = new ArrayList<>();

        addDiningItem(promotionItems7, R.drawable.res1promo9, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo8, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk overnight makes fresh chicken","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo7, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, mustard, lemon juice, salt and pepper.","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo6, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, cider cabbage mixture","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo4, "Crispy Honey Chicken", "The most popular main in the restaurant.White meat is relatively soft.","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo3, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo2, "Crispy Honey Chicken", "The most popular main in the restaurant.Meat is relatively soft.","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce contains cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems7, R.drawable.res1promo10, "Crispy Honey Chicken", "The most popular main extemely crunchy, but the white meat is relatively soft.","$10.0");

        addDiningItem(mainItems7, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. White meat is relatively soft.","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of paprika, and salt.","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce Beef.","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty encrusted gooey mac n cheese!","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned until crisp!","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, lemon juice, salt and pepper.","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main1, "Pulled pork burger", "Whisk together the mayonnaise, cider cabbage mixture","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, cherry tomatoes and oil-packed tuna","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems7, R.drawable.res1main4, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar cabbage mixture","$10.0");

        addDiningItem(appetizerItems7, R.drawable.res1app8, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app2, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app4, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped chopped shrimp, sesame oil","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app5, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground water chestnuts","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app6, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, Salted Caramel Praline…….","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app7, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app1, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems7, R.drawable.res1app3, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems7, R.drawable.res1dess5, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$3.6");
        addDiningItem(dessertItems7, R.drawable.res1dess2, "Layered lime cheesecake", "It's a crowd-pleaser that's part key lime pie, part cheesecake, part trifle","$10.0");
        addDiningItem(dessertItems7, R.drawable.res1dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$13.0");
        addDiningItem(dessertItems7, R.drawable.res1dess1, "Raspberry cheesecake cookies", "Wonderful combination of raspberry crispy and addicting","$7.0");
        addDiningItem(dessertItems7, R.drawable.res1dess2, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, Salted Caramel Praline…….","$10.0");
        addDiningItem(dessertItems7, R.drawable.res1dess3, "Coleslaw", "A condiment consisting primarily of finely-shredded raw vinaigrette or mayonnaise","$10.0");
        addDiningItem(dessertItems7, R.drawable.res1dess4, "Green bean", "Fresh green beans are prepared pressure cooker","$13.0");
        addDiningItem(dessertItems7, R.drawable.res1dess5, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$9.0");
        addDiningItem(dessertItems7, R.drawable.res1dess5, "French fries", "There is nothing better than a hot and fresh French fries! ","$7.4");
        addDiningItem(dessertItems7, R.drawable.res1dess1, "Mashed potato", "Classic smooth and creamy mashed potato cream cheese, garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems7, R.drawable.res1bev2, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$4.0");
        addDiningItem(beverageItems7, R.drawable.res1bev1, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems7, R.drawable.res1bev4, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$2.0");
        addDiningItem(beverageItems7, R.drawable.res1bev2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$2.0");
        addDiningItem(beverageItems7, R.drawable.res1bev3, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems7, R.drawable.res1bev4, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$7.3");
        addDiningItem(beverageItems7, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems7, R.drawable.res1bev1, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$9.0");
        addDiningItem(beverageItems7, R.drawable.res1bev3, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems7, R.drawable.res1bev5, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems7, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage","$14.0");
        addDiningItem(snackItems7, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$3.0");
        addDiningItem(snackItems7, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$11.0");
        addDiningItem(snackItems7, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides2, "Coleslaw", "A condiment consisting primarily of finely-shredded salad dressing!","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper!","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides5, "French fries", "There is nothing better than a hot and fresh French fries! ","$10.0");
        addDiningItem(snackItems7, R.drawable.res1sides1, "Mashed potato", "Classic smooth and creamy mashed potato chives, salt, and pepper","$10.0");


        //  Restaurant 8: Lady Bakery
        ArrayList<DiningMainItem> promotionItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems8 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems8 = new ArrayList<>();

        addDiningItem(promotionItems8, R.drawable.res1promo9, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo8, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk chicken","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo7, "Tuna salad", "Mix cannellini beans, capers, olives with mustard, lemon juice, salt and pepper.","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo6, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, cabbage mixture","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo4, "Crispy Honey Chicken", "Popular main! The white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo3, "Five Pieces Chicken", "Kid’s favorite. ","$10.0");
        addDiningItem(promotionItems8, R.drawable.res1promo2, "Crispy Honey Chicken", "The most popular main in the restaurant. White meat is relatively soft.","$14.0");
        addDiningItem(promotionItems8, R.drawable.res1promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$20.0");
        addDiningItem(promotionItems8, R.drawable.res1promo9, "Crispy Honey Chicken", "The most popular main in the restaurant. White meat is relatively soft.","$17.2");

        addDiningItem(mainItems8, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy white meat soft.","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(mainItems8, R.drawable.res2main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest.","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb gooey mac n cheese!","$10.0");
        addDiningItem(mainItems8, R.drawable.res2main3, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge in hot oil until crisp!","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main5, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms,tomatoes and oil-packed tuna","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main5, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems8, R.drawable.res2main2, "Pulled pork burger", "Whisk together add to the cabbage mixture","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main5, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper. Toss with cherry tomatoes and oil-packed tuna","$10.0");
        addDiningItem(mainItems8, R.drawable.res2main2, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems8, R.drawable.res1main5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$10.0");

        addDiningItem(appetizerItems8, R.drawable.res1app8, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app3, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app2, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app1, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling of chopped shrimp, grated fresh ginger, sesame oil","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app4, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, green onions, ginger, and water chestnuts","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app5, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline.","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app6, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app7, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems8, R.drawable.res1app10, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems8, R.drawable.res1dess5, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess2, "Layered lime cheesecake", "Let this stunning layered, cheesecake, part trifle","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess4, "Raspberry cheesecake cookies", "Wonderful combination of chocolate light, crispy and addicting","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess1, "French macarons", "Up to 25 flavours, including Strawberry Salted Caramel Praline.","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess2, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess3, "French fries", "There is nothing better than a hot and fresh French fries! ","$10.0");
        addDiningItem(dessertItems8, R.drawable.res1dess5, "Mashed potato", "Classic smooth and creamy mashed potato garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems8, R.drawable.res1bev4, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev1, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev3, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev4, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev5, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev3, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems8, R.drawable.res1bev1, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems8, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage mayonnaise","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with cream cheese, and pepper","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded mayonnaise","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat!","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries! ","$10.0");
        addDiningItem(snackItems8, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy parmesan cheese, garlic, salt, and pepper","$10.0");


        //  Restaurant 9: Mamma Rich
        ArrayList<DiningMainItem> promotionItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems9 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems9 = new ArrayList<>();

        addDiningItem(promotionItems9, R.drawable.res1promo9, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo2, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk cucumber on top of the chicken","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo3, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery cherry tomatoes tuna","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo4, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, pepper in a medium bowl, cabbage mixture","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo6, "Crispy Honey Chicken", "Extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo7, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo1, "Crispy Honey Chicken", "The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems9, R.drawable.res1promo3, "Crispy Honey Chicken", "The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");

        addDiningItem(mainItems9, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant.","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce zest without being over powering.","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty mac n cheese!","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces until crisp!","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main4, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, tossed with cherry tuna","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main2, "Pulled pork burger", "Whisk together the mayonnaise, and some salt and pepper in cabbage mixture","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main1, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives tuna","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main2, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems9, R.drawable.res1main3, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, and cabbage mixture","$10.0");

        addDiningItem(appetizerItems9, R.drawable.res1app1, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app2, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app4, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped julienned carrots, grated fresh ginger, sesame oil","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app1, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork and water chestnuts","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app5, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, Salted Caramel Praline.","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app6, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app7, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app10, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems9, R.drawable.res1app2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems9, R.drawable.res1dess5, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess4, "Layered lime cheesecake", "Let this stunning layered, citrussy dessert melt in your month.","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess2, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and white chocolate made the cookies light, crispy and addicting","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess1, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess3, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing mayonnaise","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess5, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(dessertItems9, R.drawable.res1dess2, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems9, R.drawable.res1bev4, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev1, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev2, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev3, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev4, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev5, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev1, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev2, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev3, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems9, R.drawable.res1bev4, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems9, R.drawable.res1sides1, "Coleslaw", "Consisting finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides1, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides2, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides5, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems9, R.drawable.res1sides3, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

        //  Restaurant 10: Tom & Jerry
        ArrayList<DiningMainItem> promotionItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> mainItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> appetizerItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> dessertItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> beverageItems10 = new ArrayList<>();
        ArrayList<DiningMainItem> snackItems10 = new ArrayList<>();

        addDiningItem(promotionItems10, R.drawable.res1promo9, "Cheesy beef burger", "Fresh and juicy beef patties with a layer of cheddar cheese on top of it","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo8, "Buttermilk chicken sandwich", "Marinating the chicken in buttermilk overnight makes it super succulent and juicy with fresh cucumber on top of the chicken","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo7, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper.","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo6, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo5, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo4, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo3, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo2, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo1, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(promotionItems10, R.drawable.res1promo10, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");

        addDiningItem(mainItems10, R.drawable.res1main1, "Crispy Honey Chicken", "The most popular main in the restaurant. The skin is extremely crunchy, but the white meat is relatively soft.","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main2, "Five Pieces Chicken", "Kid’s favorite. The sauce is made up of cayenne pepper, paprika, and salt.","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main3, "Szechuan Spicy Chicken", "The addition of cayenne and hot sauce give the chicken some zest without being over powering.","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main4, "Mac & Cheese Fried Chicken", "The crispy outer layer of that toasty breadcrumb encrusted gooey mac n cheese, is just the beginning of your palate pleasures!","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main5, "Buttermilk Fried Chicken", "After the buttermilk soak, dredge the chicken pieces in seasoned flour, and fry them in hot oil until crisp!","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper.","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main3, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main4, "Pulled pork burger", "Whisk together the mayonnaise, cider vinegar, sugar, and some salt and pepper in a medium bowl, and then add to the cabbage mixture","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main2, "Tuna salad", "Mix cannellini beans, capers, pickled mushrooms, celery and olives with mustard, lemon juice, salt and pepper.","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main1, "Chicken breast salad", "Grill chicken and veggies flavored with vinaigrette dressing ","$10.0");
        addDiningItem(mainItems10, R.drawable.res1main3, "Pulled pork burger", "Whisk together with mayonnaise, cider vinegar and pepper and then add to the cabbage mixture","$10.0");

        addDiningItem(appetizerItems10, R.drawable.res1app1, "Spiced Olives", "Olive oil, lemon zest, orange zest, red pepper flakes, garlic clove","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app2, "Chinese pancakes", "Pan-fried pancakes with our special sauces of sweet and sour or spicy","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app3, "Dumplings", "Consists of small pieces of dough wrapped around a filling of pork and vegetables","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app4, "Authentic Chinese Egg Rolls", "Light, crispy skin wrapped around a filling of chopped shrimp,  julienned carrots, sesame oil","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app5, "Fried Wonton", "Crispy skin wrapped around a filling of the shrimp, ground pork, green onions, ginger, and water chestnuts","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app6, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline.","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app7, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app2, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app8, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(appetizerItems10, R.drawable.res1app10, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(dessertItems10, R.drawable.res1dess5, "Chocolate pie", "Our new flavor! Chocolate crust with a molten chocolate filling","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess4, "Layered lime cheesecake", "Let this stunning layered, citrussy dessert melt in your month.","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess3, "Ice cream cone", "We have strawberry, chocolate, vanilla, green tea and pistachio flavours","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess2, "Raspberry cheesecake cookies", "Wonderful combination of raspberry and white chocolate made the cookies light, crispy and addicting","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess1, "French macarons", "Up to 25 flavours, including Strawberry Cheesecake, lemon, lavender coconut, Salted Caramel Praline.","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess2, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess5, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(dessertItems10, R.drawable.res1dess3, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

        addDiningItem(beverageItems10, R.drawable.res1bev4, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper…","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev2, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev1, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev2, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev3, "Soft drinks", "Pepsi, Sprite, Fanta, 7-Up, Dr Pepper","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev4, "Smoothie", "Blended fruits including Mango, Strawberry, pineaaple with ice ","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev3, "Milkshake", "Vanilla, chocolate, strawberry and mixture of them","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev2, "Coffee", "Latte, Caffé macchiato, Mocha, Cappuccino, Frappuccino, Espresso","$10.0");
        addDiningItem(beverageItems10, R.drawable.res1bev1, "Tea", "Chinese green tea, Oolong tea, Black tea, Jasmine green tea, Earl grey tea","$10.0");

        addDiningItem(snackItems10, R.drawable.res1sides1, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing.","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides2, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides3, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides4, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides5, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides2, "Coleslaw", "A condiment consisting primarily of finely-shredded raw cabbage with a salad dressing, commonly either vinaigrette or mayonnaise","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides3, "Green bean", "Fresh green beans are prepared pressure cooker","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides4, "Sweet corn", "Melt butter in a saucepan over medium heat and add pepper, you will be surprised how good it is","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides5, "French fries", "There is nothing better than a hot and fresh French fries sprinkle with salt to serve ","$10.0");
        addDiningItem(snackItems10, R.drawable.res1sides2, "Mashed potato", "Classic smooth and creamy mashed potato with butter, parmesan cheese, chives, cream cheese, garlic, salt, and pepper","$10.0");

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
