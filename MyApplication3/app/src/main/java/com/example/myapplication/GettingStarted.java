package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GettingStarted extends AppCompatActivity {

    private Button btnWhatIsJava, btnOOP, btnApplicationsOfJava, btnRequirements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstarted);

        btnOOP = findViewById(R.id.btnOOP);
        btnOOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GettingStarted.this, OOP.class));
            }
        });

       btnWhatIsJava = findViewById(R.id.btnWhatIsJava);
       btnWhatIsJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GettingStarted.this, WhatIsJava.class));
          }
       });

       btnApplicationsOfJava = findViewById(R.id.btnAplicationsOfJava);
       btnApplicationsOfJava.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(GettingStarted.this, ApplicationsOfJava.class));
           }
       });

       btnRequirements = findViewById(R.id.btnRequirements);
       btnRequirements.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(GettingStarted.this, Requirements.class));
           }
       });


    }


}

