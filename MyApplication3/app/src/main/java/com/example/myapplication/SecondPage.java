package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondPage extends AppCompatActivity {
    private Handler mHandler = new Handler();

    private Button btnGettingStarted, btnJavaSyntax, btnProgramExamples, btnMoreTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        btnGettingStarted = findViewById(R.id.btnGettinStarted);
        btnGettingStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondPage.this, GettingStarted.class));
            }
        });

        btnJavaSyntax = findViewById(R.id.btnJavaSyntax);
        btnJavaSyntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondPage.this, JavaSyntax.class));
            }
        });

        btnProgramExamples = findViewById(R.id.btnProgramExamples);
        btnProgramExamples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondPage.this, ProgramExamples.class));
            }
        });

        btnMoreTips = findViewById(R.id.btnMoreTips);
        btnMoreTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondPage.this, MoreTips.class));
            }
        });


    }



}

