package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class klakulator extends AppCompatActivity implements View.OnClickListener{
    EditText txtpertama, txtkedua;
    Button btnplus, btnmin, btnkali, btnbagi;
    TextView tvhasil;
    Integer angka1, angka2;
    String aangka1, aangka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klakulator);
        txtpertama = findViewById(R.id.txtpertama);
        txtkedua = findViewById(R.id.txtkedua);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        tvhasil = findViewById(R.id.tvhasil);


       btnplus.setOnClickListener(this);
       btnmin.setOnClickListener(this);
       btnkali.setOnClickListener(this);
       btnbagi.setOnClickListener(this);


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

        }
    }
}

