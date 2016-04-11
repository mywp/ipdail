package com.example.scorpio.ipdail;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_number;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number = (EditText) findViewById(R.id.et_number);
        sp = getSharedPreferences("config",MODE_PRIVATE);
    }
    
    public void save(View view){
        String ipnumber = et_number.getText().toString().trim();
        if (TextUtils.isEmpty(ipnumber)){
            Toast.makeText(this,"清除IP号码成功",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"设置IP号码成功",Toast.LENGTH_SHORT).show();
        }
        SharedPreferences.Editor editor =sp.edit();
        editor.putString("ipnumber",ipnumber);
        editor.commit();
    }
}
