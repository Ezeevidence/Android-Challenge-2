package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JavaSyntax extends AppCompatActivity {

    private Button btnDataTypes, btnReservedKeywords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_syntax);


        btnDataTypes = findViewById(R.id.btnDataTypes);
        btnDataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btnReservedKeywords = findViewById(R.id.btnLexicalElements);
        btnReservedKeywords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JavaSyntax.this, LexicalElements.class));
            }
        });




    }
}
