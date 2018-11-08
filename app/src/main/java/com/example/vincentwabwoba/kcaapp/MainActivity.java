package com.example.vincentwabwoba.kcaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1, btnregistert ;
        btn1=(Button)findViewById(R.id.loginbutton);
        btnregistert=(Button)findViewById(R.id.registerbutton);

    }
        public void LoginActivity (View v){
            Toast.makeText(getApplicationContext(), "Loading Login Process...", Toast.LENGTH_LONG).show();
            Intent login =new Intent(getApplication(), LoginActivity.class);
            startActivity(login);
        }
        public void RegisterActivity (View v){
            Toast.makeText(getApplicationContext(), "Loading Registration  Process...", Toast.LENGTH_LONG).show();
            Intent register =new Intent(getApplication(), RegisterActivity.class);
            startActivity(register);
        }
    }
