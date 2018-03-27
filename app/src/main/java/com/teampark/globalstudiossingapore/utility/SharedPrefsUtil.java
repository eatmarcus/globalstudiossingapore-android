package com.teampark.globalstudiossingapore.utility;

import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by darrylong on 19/6/17.
 */

public class SharedPrefsUtil {

    private static SharedPreferences sharedPreferences;

    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public static void setSharedPreferences(SharedPreferences sharedPreferences) {
        SharedPrefsUtil.sharedPreferences = sharedPreferences;
    }


    public static <T> void setList(String key, List<T> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);

        set(key, json);
    }

    public static <T> void setObject(String key, T object){
        Gson gson = new Gson();
        String json = gson.toJson(object);
        set(key, json);
    }

    private static void set(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void removeObject (String key){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        editor.commit();
    }

    public static <T> T getObject(String key, Class<T> c){

        if (sharedPreferences == null){
            return null;
        }

        Gson gson = new Gson();
        String json = sharedPreferences.getString(key, "");
        return gson.fromJson(json, c);

    }

}
