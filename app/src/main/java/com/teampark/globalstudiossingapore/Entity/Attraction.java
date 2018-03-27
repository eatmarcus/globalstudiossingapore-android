package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by Mong on 19/3/18.
 */

public class Attraction {
    private String name;
    private String description;
    private String waitingTime;
    private MapPoint mapCoordinates;

    public Attraction(String name, String description, MapPoint mapCoordinates) {
        this.name = name;
        this.description = description;
        this.waitingTime = "< 5mins";
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

    public String getDescription() {
        return description;
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime){ this.waitingTime = waitingTime; }

}
