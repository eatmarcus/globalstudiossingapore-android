package com.teampark.globalstudiossingapore.DAO;

import android.content.Context;

import com.teampark.globalstudiossingapore.Entity.Attraction;
import com.teampark.globalstudiossingapore.Entity.MapPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mong on 19/3/18.
 */

public class AttractionDAO {

    private static final int MAP_ACCURACY_DECIMAL_POINT = 2;
    private static HashMap<MapPoint, Attraction> attractionMapPositionList;
    private final Context context;

    public AttractionDAO(Context context){
        this.context = context;

        attractionMapPositionList = new HashMap<>();

        //
        //!!!!!!!!DARRYL WILL FILL THIS HASHMAP UP!!!!!!!!
        //


    }

    public static int getMapAccuracyDecimalPoint() {
        return MAP_ACCURACY_DECIMAL_POINT;
    }

    public static HashMap<MapPoint,Attraction> getAttractionMapPositionList() {
        return attractionMapPositionList;
    }
}
