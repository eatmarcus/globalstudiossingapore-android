package com.teampark.globalstudiossingapore.utility;

import android.content.Context;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by darrylong on 5/1/17.
 */

public class ConverterUtility {

    // Converts from dp to pixels.
    // Returns pixels in float.
    public static float dpToPx (Context context, int dpValue){
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, displayMetrics);
    }

    public static float pxToDp (Context context, int pixelValue){
        return 0.0f;
    }

}
