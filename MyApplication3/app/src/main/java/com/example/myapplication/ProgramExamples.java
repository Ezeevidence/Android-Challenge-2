package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgramExamples extends AppCompatActivity {


    private Button btnBasicProblems, btnHarderProblems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_examples);

    btnBasicProblems = findViewById(R.id.btnBasicPrograms);
    btnBasicProblems.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ProgramExamples.this,  BasicProblems.class));
        }
    });

   btnHarderProblems = findViewById(R.id.btnHarderProblems);
   btnHarderProblems.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           startActivity(new Intent(ProgramExamples.this, HarderProblems.class ));
       }
   });

    }


}
