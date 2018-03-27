package com.teampark.globalstudiossingapore.DAO;

import android.content.Context;

import com.teampark.globalstudiossingapore.Entity.Attraction;
import com.teampark.globalstudiossingapore.Entity.MapPoint;
import com.teampark.globalstudiossingapore.utility.MapDisplayUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mong on 19/3/18.
 */

public class AttractionDAO {

    private static final int MAP_ACCURACY_DECIMAL_POINT = 1;
    private static final int MAP_SENSITIVITY_ACCEPTANCE_LIMITS = 1;
    private static HashMap<MapPoint, Attraction> attractionMapPositionList;
    private final Context context;

    static{
        attractionMapPositionList = new HashMap<>();

        //
        //!!!!!!!!DARRYL WILL FILL THIS HASHMAP UP!!!!!!!!
        //!!!!!! OK NEVERMIND LIM PEI DO!!!!!!!!!
        //
        MapPoint ragingRiverMP = new MapPoint(0.46396226, 0.35501555);
        ArrayList<MapPoint> mapPointWithOffsetsRR = MapDisplayUtility.translateMapPointsWithSensitivity(ragingRiverMP, MAP_ACCURACY_DECIMAL_POINT, MAP_SENSITIVITY_ACCEPTANCE_LIMITS);
        Attraction newAttraction = new Attraction("Raging River", "A family-style white-water river rafting adventure. Will you get dunked? Just hang on tight and don’t plan on staying dry!", ragingRiverMP);
        for(MapPoint mp: mapPointWithOffsetsRR){
            attractionMapPositionList.put(mp, newAttraction);
        }

        MapPoint supermanMP = new MapPoint(0.2110371, 0.3987882);
        ArrayList<MapPoint> mapPointWithOffsetsSM = MapDisplayUtility.translateMapPointsWithSensitivity(supermanMP, MAP_ACCURACY_DECIMAL_POINT, MAP_SENSITIVITY_ACCEPTANCE_LIMITS);
        newAttraction = new Attraction("Thomie's Mine Train", "Big fun for our littlest riders. They can steer big trucks on a wacky kid-sized highway!",  supermanMP);
        for(MapPoint mp: mapPointWithOffsetsSM){
            attractionMapPositionList.put(mp, newAttraction);
        }

        MapPoint sponglashMP = new MapPoint(0.17878105, 0.7542211);
        ArrayList<MapPoint> mapPointWithOffsetsS = MapDisplayUtility.translateMapPointsWithSensitivity(sponglashMP, MAP_ACCURACY_DECIMAL_POINT, MAP_SENSITIVITY_ACCEPTANCE_LIMITS);
        newAttraction = new Attraction("Sponglash Wave Pool", "This giant wave pool makes king-sized currents & ocean-sized fun.", sponglashMP);
        for(MapPoint mp: mapPointWithOffsetsS){
            attractionMapPositionList.put(mp, newAttraction);
        }

        MapPoint steaminDemonMP = new MapPoint(0.71214676, 0.42501387);
        ArrayList<MapPoint> mapPointWithOffsetsSD = MapDisplayUtility.translateMapPointsWithSensitivity(steaminDemonMP, MAP_ACCURACY_DECIMAL_POINT, MAP_SENSITIVITY_ACCEPTANCE_LIMITS);
        newAttraction = new Attraction("Steamin' Demon", "We're talking serious coasters here. Ride through history on this coaster, spanning 4,200-feet of track and over 90 years of thrills.", steaminDemonMP);
        for(MapPoint mp: mapPointWithOffsetsSD){
            attractionMapPositionList.put(mp, newAttraction);
        }

        MapPoint dareDevilMP = new MapPoint(0.72232956, 0.78550935);
        ArrayList<MapPoint> mapPointWithOffsetsDD = MapDisplayUtility.translateMapPointsWithSensitivity(dareDevilMP, MAP_ACCURACY_DECIMAL_POINT, MAP_SENSITIVITY_ACCEPTANCE_LIMITS);
        newAttraction = new Attraction("Dare Devil", "There's nothing quite like soaring through the air at high-speeds. Believe not! This is the fastest ride in the world!!!", dareDevilMP);
        for(MapPoint mp: mapPointWithOffsetsDD){
            attractionMapPositionList.put(mp, newAttraction);
        }
    }

    public AttractionDAO(Context context){
        this.context = context;



    }

    public static int getMapAccuracyDecimalPoint() {
        return MAP_ACCURACY_DECIMAL_POINT;
    }

    public static HashMap<MapPoint,Attraction> getAttractionMapPositionList() {
        return attractionMapPositionList;
    }


}
