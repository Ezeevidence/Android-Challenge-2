package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HarderProblems extends AppCompatActivity {

    private Button btnConvertCharArrayToString, btnCalculateAndDisplayStudentsGrade, btnGetASCIIValueOfCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harder_problems);

        btnConvertCharArrayToString = findViewById(R.id.btnConverChartArrayToSTring);
        btnConvertCharArrayToString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, ConvertCharArrayToString.class));
            }
        });
        btnCalculateAndDisplayStudentsGrade = findViewById(R.id.btnCalculateAndDisplayStudentsGrade);
        btnCalculateAndDisplayStudentsGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, CalculateAndDisplayStudentsGrades.class));
            }
        });

        btnGetASCIIValueOfCharacter = findViewById(R.id.btnGetASCIIValueOfCharacter);
        btnGetASCIIValueOfCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, GetASCIIValueOfCharacter.class));
            }
        });

    }
}
