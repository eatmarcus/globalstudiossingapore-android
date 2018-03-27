package com.teampark.globalstudiossingapore.utility;

import java.util.ArrayList;

import com.teampark.globalstudiossingapore.DAO.AttractionDAO;
import com.teampark.globalstudiossingapore.Entity.MapPoint;
import com.teampark.globalstudiossingapore.Entity.Attraction;

        import java.text.DecimalFormat;
        import java.util.ArrayList;
        import java.util.HashMap;

/**
 * Created by darrylong on 24/5/17.
 */

public class MapDisplayUtility {

    public static ArrayList<MapPoint> translateMapPointsWithSensitivity (MapPoint mapPoint, int decimalPoint, int sensitivityValue){
        ArrayList<MapPoint> toReturn = new ArrayList<>();

        Double xValue = mapPoint.getxCoordinate();
        Double yValue = mapPoint.getyCoordinate();

        //xValue = trimToDecimalPlaces(xValue, decimalPoint);
        //yValue = trimToDecimalPlaces(yValue, decimalPoint);

        System.out.println("Sensitivty value: "+sensitivityValue);
        double incrementValue = 1.0/(Math.pow(10, sensitivityValue));
        double minValue = -(incrementValue * sensitivityValue);
        double maxValue = incrementValue * sensitivityValue;
        System.out.println("IncrementVal: "+incrementValue);
        System.out.println("minVal: "+minValue);
        System.out.println("maxVal: "+maxValue);

        for (double d = minValue; d <= maxValue; d += incrementValue){
            double currentXValue = xValue + d;

            for (double e = minValue; e <=maxValue; e += incrementValue){
                double currentYValue = yValue + e;

                MapPoint currentMapPoint = new MapPoint(trimToDecimalPlaces(currentXValue,decimalPoint), trimToDecimalPlaces(currentYValue,decimalPoint));
                toReturn.add(currentMapPoint);
                System.out.println("Added: X-"+trimToDecimalPlaces(currentXValue,decimalPoint)+", Y-"+trimToDecimalPlaces(currentYValue, decimalPoint));

            }
        }

        return toReturn;
    }

    public static double trimToDecimalPlaces (double value, int decimalPlaces){
        String decimalFormatString = "#.";
        for (int i = 0; i < decimalPlaces; i++){
            decimalFormatString += "#";
        }
        DecimalFormat decimalFormat = new DecimalFormat(decimalFormatString);

        return Double.parseDouble(decimalFormat.format(value));
    }


    //Used to obtain and verify if map touched position exists on the station map
    //Returns null if no stations found
    public static Attraction getAttraction (double xValue, double yValue){
        int decimalPoint = AttractionDAO.getMapAccuracyDecimalPoint();

        double xSearchValue = trimToDecimalPlaces(xValue, decimalPoint);
        double ySearchValue = trimToDecimalPlaces(yValue, decimalPoint);

        HashMap<MapPoint, Attraction> mapPointAttractionHashMap = AttractionDAO.getAttractionMapPositionList();
        return mapPointAttractionHashMap.get(new MapPoint(xSearchValue, ySearchValue));
    }

}