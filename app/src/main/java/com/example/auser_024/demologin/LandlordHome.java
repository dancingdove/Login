package com.example.auser_024.demologin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LandlordHome extends AppCompatActivity {

    EditText et1,et2,et3;
    public static final String PREF = "Login_PREF";
    public static final String PREF_UserName = "PREF_USERNAME";
    public static final String PREF_Password = "PREF_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_home);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et3);
        et3 = (EditText)findViewById(R.id.et4);
    }

    public void signIn(View v) {
        String lorduser =  et2.getText().toString();
        String lordmail = et1.getText().toString();
        String lordpassword = et3.getText().toString();
        SharedPreferences settings = getSharedPreferences("create" , 0);
        String account = settings.getString("account", "");
        String email = settings.getString("email", "");
        String password = settings.getString("password", "");
        if (et1.getText().toString().trim().equals("")
                || et2.getText().toString().trim().equals("")
                || et3.getText().toString().trim().equals("")) {
            Toast.makeText(LandlordHome.this,"欄位不可空白",Toast.LENGTH_SHORT).show();
        }else if ((lorduser.equals(account)) && (lordmail.equals(email)) && (lordpassword.equals(password))) {
            Toast.makeText(LandlordHome.this,"帳號驗證成功",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setClass(LandlordHome.this,HomePage.class);
//            Bundle bundle = new Bundle();
//            bundle.putString("account",et2.getText().toString());
//            intent.putExtras(bundle);
            startActivity(intent);
        }else {
            Toast.makeText(LandlordHome.this,"帳號驗證失敗",Toast.LENGTH_SHORT).show();
        }
    }

    public void home(View v) {
        finish();
    }

    public void adduser(View v) {
        Intent intent = new Intent(LandlordHome.this,AddLandlordActivity.class);
        startActivity(intent);
    }
}
