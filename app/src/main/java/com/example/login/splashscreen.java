package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(2*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),Controlclass.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();
    }
}
