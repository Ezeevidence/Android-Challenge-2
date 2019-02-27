package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicProblems extends AppCompatActivity {

    private Button btnHelloWorld, btnSumOfTwoNumbers, btnAreaOfCircle, btnOddOrEvenNumbers, btnFibonacciSeries;
    private Button btnQuadraticEquation, btnMaximumBetweenTwoNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_problems);

        btnHelloWorld = findViewById(R.id.btnHelloWorld);
        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, HelloWordProgram.class));
            }
        });
        btnSumOfTwoNumbers = findViewById(R.id.btnSumOfTwoNumbers);
        btnSumOfTwoNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, SumOfTwoNumbers.class));

            }
        });
        btnAreaOfCircle = findViewById(R.id.btnAreaOfCircle);
        btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, AreaOfCircle.class));

            }
        });

        btnOddOrEvenNumbers = findViewById(R.id.btnOddOrEvenNumber);
        btnOddOrEvenNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, OddOrEvenNumber.class));
            }
        });

        btnFibonacciSeries = findViewById(R.id.btnFibonacciSeries);
        btnFibonacciSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnQuadraticEquation = findViewById(R.id.btnQuadraticEquation);
        btnQuadraticEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, QuadraticEquation.class));
            }
        });

        btnMaximumBetweenTwoNumbers = findViewById(R.id.btnMaximumBetweenTwoNumbers);
        btnMaximumBetweenTwoNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BasicProblems.this, MaximumBetweenTwoNumbers.class));
            }
        });
    }


}
