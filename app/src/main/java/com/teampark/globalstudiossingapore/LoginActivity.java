package com.teampark.globalstudiossingapore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.teampark.globalstudiossingapore.utility.DialogBuilder;
import com.teampark.globalstudiossingapore.utility.SharedPrefsUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    private final int SCAN_QR = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupSharedPref();
        checkLoginStatus();
    }

    public void loginClicked(View view) {

        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setOrientationLocked(false);
        integrator.setPrompt("Scan the QR code on your ticket to login!");
        integrator.setCameraId(0);  // Use a specific camera of the device
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
        integrator.initiateScan();
    }

    public void callClicked(View view) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        if (requestCode == SCAN_QR && resultCode == RESULT_OK){
//
//            String value = data.getStringExtra("value");
//
//
//        }

        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (scanResult != null) {
            // handle scan result
            if(scanResult.getContents() == null) {
                //Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Scanned: " + scanResult.getContents(), Toast.LENGTH_LONG).show();

                String resultValue = scanResult.getContents();

                String dateValue = "";
                String id = null;

                if (resultValue.contains("-")){
                    dateValue = resultValue.substring(0, resultValue.indexOf('-'));
                    id = resultValue.substring(resultValue.indexOf('-') + 1);
                }


                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                try {
                    cal.setTime(sdf.parse(dateValue));// all done
                } catch (ParseException e) {
                    e.printStackTrace();
                    cal = null;
                }



                if (cal != null){

                    Calendar c1 = Calendar.getInstance(); // today

                    if (c1.get(Calendar.YEAR) == cal.get(Calendar.YEAR)
                            && c1.get(Calendar.DAY_OF_YEAR) == cal.get(Calendar.DAY_OF_YEAR)) {
                        SharedPrefsUtil.setObject("user", id);
                        SharedPrefsUtil.setObject("date", cal);

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);

                        LoginActivity.this.finish();

                    } else {
                        DialogBuilder.showDialog("Invalid QR Code", "This is a ticket for another date. Please scan a valid GSS QR Code.", this);
                    }



                } else if (resultValue.equals("BOSSMODE")){
                    SharedPrefsUtil.setObject("user", "BOSSMODE");

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                    LoginActivity.this.finish();

                } else {
                    DialogBuilder.showDialog("Invalid QR Code", "Please scan a valid GSS QR Code.", this);
                }



            }

        }

    }

    private void checkLoginStatus(){
        String id = SharedPrefsUtil.getObject("user", String.class);
        Calendar cal = SharedPrefsUtil.getObject("date", Calendar.class);

        if (id == null) {
            return;
        }

        if (id.equals("BOSSMODE")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            LoginActivity.this.finish();
            return;
        }


        if (cal == null){
            return;
        }

        Calendar c1 = Calendar.getInstance(); // today

        if (c1.get(Calendar.YEAR) == cal.get(Calendar.YEAR)
                && c1.get(Calendar.DAY_OF_YEAR) == cal.get(Calendar.DAY_OF_YEAR)) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            LoginActivity.this.finish();

        } else {
            DialogBuilder.showDialog("Session Expired", "Your ticket has expired. Thank you for coming to Global Studios Singapore!", this);
            SharedPrefsUtil.setObject("user", null);
            SharedPrefsUtil.setObject("date", null);
        }



    }

    private void setupSharedPref(){
        SharedPrefsUtil.setSharedPreferences(getApplicationContext().getSharedPreferences("Preferences", Context.MODE_PRIVATE));
    }
}
