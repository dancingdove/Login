package com.example.auser_024.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LandlordHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_home);
    }

    public void home(View v) {
        finish();
    }

    public void adduser(View v) {
        Intent intent = new Intent(LandlordHome.this,AddLandlordActivity.class);
        startActivity(intent);
    }
}
