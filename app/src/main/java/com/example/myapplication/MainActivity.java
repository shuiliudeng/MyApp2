package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d("ning","onCreate");
        TextView tv = findViewById(R.id.textview);
        tv.setText(R.string.app_name);
        tv.setTextColor(0xf0f00f0f);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"laalaldema",Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            //intent.setData()
            intent.setClass(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        });

    }
}