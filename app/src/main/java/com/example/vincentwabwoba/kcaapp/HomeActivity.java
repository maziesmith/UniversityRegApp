package com.example.vincentwabwoba.kcaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1=findViewById(R.id.btnSPP);
        btn2=findViewById(R.id.btnSOB);
        btn3=findViewById(R.id.btnFOED);
        btn4=findViewById(R.id.btnFOCIM);
    }

    public void spp(View v)
    {
        Toast.makeText(getApplicationContext(), "Welcome to  SPP department ",Toast.LENGTH_LONG).show();
        Intent  spp= new Intent(getApplicationContext(), spp.class);
        startActivity(spp);
    }

    public void sob(View v)
    {
        Toast.makeText(getApplicationContext(), "Welcome to  SOB department ",Toast.LENGTH_LONG).show();
        Intent sob = new Intent(getApplicationContext(), sob.class);
                startActivity(sob);
    }
    public void foed(View v)
    {
        Toast.makeText(getApplicationContext(), "Welcome to  FOED department ",Toast.LENGTH_LONG).show();
        Intent foed = new Intent(getApplicationContext(), foed.class);
        startActivity(foed);
    }
    public void focim(View v)
    {
        Toast.makeText(getApplicationContext(), "Welcome to  FOCIM department ",Toast.LENGTH_LONG).show();
        Intent focim =  new Intent(getApplicationContext(), focim.class);
        startActivity(focim);
    }
}
