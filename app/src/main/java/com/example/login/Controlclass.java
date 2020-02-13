package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.security.PrivateKey;

public class Controlclass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        if (sharedPreferences.getString("userid","").isEmpty()){
            Intent in = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(in);
            finish();
        }else {
            Intent in = new Intent(getApplicationContext(),klakulator.class);
            startActivity(in);
            finish();
        }

    }
}
