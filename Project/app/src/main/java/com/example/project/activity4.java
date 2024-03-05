package com.example.skywings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void onClick(View v){
        Intent ini = new Intent(this, MainActivity.class);
        startActivity(ini);
    }
}