package com.example.auser_024.demologin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddLandlordActivity extends AppCompatActivity {

    EditText et4,et5,et6,et7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_landlord);
    }

    public void btnRegister(View v) {

        et4 = (EditText)findViewById(R.id.editText2);
        et5 = (EditText)findViewById(R.id.editText7);
        et6 = (EditText)findViewById(R.id.editText5);
        et7 = (EditText)findViewById(R.id.editText6);
//        Editable Email = et1.getText();
//        Editable UserName = et2.getText();
//        Editable Password = et3.getText();
//        Editable Age = et4.getText();

        if (!et4.getText().toString().trim().equals("")
                && !et5.getText().toString().trim().equals("")
                && !et6.getText().toString().trim().equals("")
                && !et7.getText().toString().trim().equals("")) {


            if (et6.getText().toString().trim().equals(et7.getText().toString().trim())) {

                SharedPreferences settings = getSharedPreferences("create" , 0);

                settings.edit().putString("account" , et4.getText().toString()).commit();
                settings.edit().putString("email" , et5.getText().toString()).commit();
                settings.edit().putString("password" , et6.getText().toString()).commit();
                Toast.makeText(AddLandlordActivity.this, "申請成功", Toast.LENGTH_SHORT).show();
//            restorePrefs();
                Intent intent = new Intent();
                intent.setClass(AddLandlordActivity.this, HomePage.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", et5.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }else {
                Toast.makeText(AddLandlordActivity.this,"密碼不相符...",Toast.LENGTH_LONG).show();
            }

        }else {

            Toast.makeText(AddLandlordActivity.this,"欄位不可空白",Toast.LENGTH_LONG).show();
        }
    }

    public void cancel(View v) {
        finish();
    }
}
