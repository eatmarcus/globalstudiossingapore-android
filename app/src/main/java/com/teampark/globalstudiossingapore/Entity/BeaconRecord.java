package com.teampark.globalstudiossingapore.Entity;

/**
 * Created by Mong on 19/3/18.
 */

public class BeaconRecord {

    private String beaconId;
    private int count;

    public String getBeaconId() {
        return beaconId;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "BeaconRecord{" +
                "beaconId='" + beaconId + '\'' +
                ", count=" + count +
                '}';
    }
}
