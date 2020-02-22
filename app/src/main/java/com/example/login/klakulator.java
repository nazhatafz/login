package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class klakulator extends AppCompatActivity implements View.OnClickListener {
    EditText txtpertama, txtkedua;
    Button btnplus, btnmin, btnkali, btnbagi, btnlogout;
    TextView tvhasil;
    Integer angka1, angka2;
    String aangka1, aangka2;
    static SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klakulator);
        txtpertama = findViewById(R.id.txtpertama);
        txtkedua = findViewById(R.id.txtkedua);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnkali = findViewById(R.id.btnkali);
        btnlogout = findViewById(R.id.btnlogout);
        btnbagi = findViewById(R.id.btnbagi);
        tvhasil = findViewById(R.id.tvhasil);


        btnplus.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnkali.setOnClickListener(this);
        btnbagi.setOnClickListener(this);
        btnlogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnplus:
                aangka1 = txtpertama.getText().toString();
                aangka2 = txtkedua.getText().toString();
                angka1 = Integer.parseInt(aangka1);
                angka2 = Integer.parseInt(aangka2);
                tvhasil.setText("hasil=" + (angka1 + angka2));
                break;
            case R.id.btnmin:
                aangka1 = txtpertama.getText().toString();
                aangka2 = txtkedua.getText().toString();
                angka1 = Integer.parseInt(aangka1);
                angka2 = Integer.parseInt(aangka2);
                tvhasil.setText("hasil=" + (angka1 - angka2));
                break;
            case R.id.btnkali:
                aangka1 = txtpertama.getText().toString();
                aangka2 = txtkedua.getText().toString();
                angka1 = Integer.parseInt(aangka1);
                angka2 = Integer.parseInt(aangka2);
                tvhasil.setText("hasil=" + (angka1 * angka2));

                break;
            case R.id.btnbagi:
                aangka1 = txtpertama.getText().toString();
                aangka2 = txtkedua.getText().toString();
                angka1 = Integer.parseInt(aangka1);
                angka2 = Integer.parseInt(aangka2);
                tvhasil.setText("hasil=" + (angka1 / angka2));
                break;
            case R.id.btnlogout:
                sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
                sharedPreferences.edit().clear().commit();
                Intent in = new Intent(klakulator.this, MainActivity.class);
                finish();
                startActivity(in);
                break;
        }
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("login");
        builder.setCancelable(false);
        builder.setMessage("Mau Tinggalin Aku?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}


