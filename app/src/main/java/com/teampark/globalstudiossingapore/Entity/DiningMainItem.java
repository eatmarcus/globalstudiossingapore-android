package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by Theresa Lee on 3/19/2018.
 */

public class DiningMainItem {

    private int image;
    private String name;
    private String description;

    public DiningMainItem(int image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
