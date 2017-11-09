package com.example.auser_024.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
    }

    public void LoginButton1(View v) {
        Intent intent = new Intent(LoginPage.this,LandlordHome.class);
        startActivity(intent);

    }

    public void LoginButton2(View v) {

    }
}
