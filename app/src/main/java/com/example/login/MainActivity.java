package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtemail,txtpassword;
Button angry_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        angry_btn = findViewById(R.id.angry_btn);
        angry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtemail.getText().toString().equalsIgnoreCase("Nazhat")||txtpassword.getText().toString().equalsIgnoreCase("nazhatimut")){
                    Intent in=new Intent(MainActivity.this,klakulator.class);
                    in.putExtra("Email",txtemail.getText().toString());
                    startActivity(in);
                }
            }
        });







    }
}



