package com.teampark.globalstudiossingapore.Entity;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MapPoint {

    private double xCoordinate;
    private double yCoordinate;

    public MapPoint(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null){
            return false;
        }

        if (!(obj instanceof MapPoint)){
            return false;
        }

        MapPoint another = (MapPoint) obj;

        return (xCoordinate == another.xCoordinate) && (yCoordinate == another.yCoordinate);
    }

    @Override
    public int hashCode(){
        return new HashCodeBuilder().append(xCoordinate)
                .append(yCoordinate)
                .toHashCode();
    }
}