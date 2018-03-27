package com.teampark.globalstudiossingapore.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.NumberPicker;

/**
 * Created by darrylong on 25/6/17.
 */

public class DialogBuilder {

    public static void showDialog(String title, String message, Context context){
        showDialog(title, message, context, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //OK has been clicked!
            }
        });

    }

    public static void showDialog(String title, String message, Context context,
                                  String positiveButton, DialogInterface.OnClickListener positiveListener){

        if (context == null){
            System.out.println("Unable to show dialog, view changed.");
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        //Set title
        builder.setTitle(title);

        //Set message
        builder.setMessage(message);

        //Adds OK button
        builder.setPositiveButton(positiveButton, positiveListener);

        //Create dialog and show
        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.show();
    }

    public static void showDialog(String title, String message, Context context,
                                  String positiveButton, DialogInterface.OnClickListener positiveListener,
                                  String negativeButton, DialogInterface.OnClickListener negativeListener){
        if (context == null){
            System.out.println("Unable to show dialog, view changed.");
            return;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        //Set title
        builder.setTitle(title);

        //Set message
        builder.setMessage(message);

        //Adds OK button
        builder.setPositiveButton(positiveButton, positiveListener);
        builder.setNegativeButton(negativeButton, negativeListener);

        //Create dialog and show
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public static NumberPicker showDialogWithNumberPicker(String title, String message, Context context,
                                                          String positiveButton, DialogInterface.OnClickListener positiveListener,
                                                          String negativeButton, DialogInterface.OnClickListener negativeListener,
                                                          NumberPicker numberPicker,
                                                          int minValue, int maxValue){
        if (context == null){
            System.out.println("Unable to show dialog, view changed.");
            return null;
        }

        numberPicker.setMinValue(minValue);
        numberPicker.setMaxValue(maxValue);

        final FrameLayout layout = new FrameLayout(context);
        layout.addView(numberPicker, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER));

        new AlertDialog.Builder(context)
                .setView(layout)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(positiveButton, positiveListener)
                .setNegativeButton(negativeButton, negativeListener)
                .show();

        return numberPicker;

    }

}
