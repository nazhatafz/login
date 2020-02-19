package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    EditText txtemail,txtpassword;
    Button angry_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pref=getSharedPreferences("login",MODE_PRIVATE);
        setContentView(R.layout.activity_main);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        angry_btn = findViewById(R.id.angry_btn);
        angry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtemail.getText().toString().equalsIgnoreCase("Nazhat")||txtpassword.getText().toString().equalsIgnoreCase("nazhatimut")){
                    Toast.makeText(MainActivity.this, "login sukses", Toast.LENGTH_SHORT).show();
                    editor = pref.edit();
                    editor.putString("userid",txtemail.getText().toString());
                    editor.apply();
                    Intent in=new Intent(MainActivity.this,klakulator.class);
                    in.putExtra("Email",txtemail.getText().toString());
                    startActivity(in);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });







    }
}



