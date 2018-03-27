package com.teampark.globalstudiossingapore.Entity;

import java.util.ArrayList;

/**
 * Created by Theresa Lee on 3/19/2018.
 */

public class DiningCategory {
    private char category;
    private ArrayList<DiningMainItem> diningMainItems;

    public DiningCategory(char category, ArrayList<DiningMainItem> diningMainItems) {
        this.category = category;
        this.diningMainItems = diningMainItems;
    }

    public char getCategory() {
        return category;
    }

    public ArrayList<DiningMainItem> getDiningMainItems() {
        return diningMainItems;
    }
}
