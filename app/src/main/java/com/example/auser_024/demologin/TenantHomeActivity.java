package com.example.auser_024.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TenantHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant_home);
    }

    public void home (View v) {
        finish();
    }

    public void adduser(View v) {
        Intent intent = new Intent(TenantHomeActivity.this,AddTenantActivity.class);
        startActivity(intent);
    }
}
