package com.arnold.anek.HelperActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.arnold.anek.R;

public class Energy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.energy);
    }
}