package com.example.travelmantics;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    private EditText etName, etEmail, etPhone, etPass, etConfirm;
    private Button btnSignUp, btnSignIn;

    private String name, email, phone, password, comfirm;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
//        AndroidNetworking.initialize(getApplicationContext());

        progressDialog = new ProgressDialog(Registration.this);
        mAuth = FirebaseAuth.getInstance();
        btnSignIn = findViewById(R.id.btnSignIn);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etPass = (EditText) findViewById(R.id.etPass);
        etConfirm = findViewById(R.id.etConfirm);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration.this, SignIn.class));
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });


    }


    private void validate() {
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Loading");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        email = etEmail.getText().toString().trim();
        password = etPass.getText().toString().trim();
        comfirm = etConfirm.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            etEmail.setError("pls input email");
            return;
        }
        if (TextUtils.isEmpty(password) || !password.matches(comfirm)) {
            etPass.setError("invalid passsword");
        } else {

            if (isNetworkAvailable()) {

                registerOnFirebase();
//                registerUser();

            } else {

                Toast.makeText(this, "Check Internet Connection", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void registerOnFirebase() {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Registration.this, SignIn.class));
                    progressDialog.dismiss();
                } else {
                    progressDialog.dismiss();
                    String m = task.getException().toString();
                    Toast.makeText(Registration.this, m, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

//    private void registerUser(){
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("firstname", name);
//            jsonObject.put("phone", phone);
//            jsonObject.put("email", email);
//            jsonObject.put("password", password
//            );
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        AndroidNetworking.post("https://fierce-cove-29863.herokuapp.com/createUser")
//                .addJSONObjectBody(jsonObject) // posting json
//                .setTag("test")
//                .setPriority(Priority.MEDIUM)
//                .build()
//                .getAsJSONArray(new JSONArrayRequestListener() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        // do anything with response
//                    }
//                    @Override
//                    public void onError(ANError error) {
//                        // handle error
//                    }
//                });
//

    }
