package com.example.hanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view){
        Intent intent = new Intent(MainActivity.this, hkclss.class);
        startActivity(intent);
    }
    public void onSumClick (View view){
        Intent intent = new Intent(MainActivity.this, msammary.class);
        startActivity(intent);
    }
}
