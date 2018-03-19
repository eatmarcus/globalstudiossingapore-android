package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by Mong on 19/3/18.
 */

public class Attraction {
    private String name;
    private MapPoint mapCoordinates;

    public Attraction(String name, MapPoint mapCoordinates) {
        this.name = name;
        this.mapCoordinates = mapCoordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MapPoint getMapCoordinates() {
        return mapCoordinates;
    }
}
