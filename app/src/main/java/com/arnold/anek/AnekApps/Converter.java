package com.arnold.anek.AnekApps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.arnold.anek.HelperActivities.AreaConversion;
import com.arnold.anek.HelperActivities.Cooking;
import com.arnold.anek.HelperActivities.Speed;
import com.arnold.anek.HelperActivities.Temperature;
import com.arnold.anek.HelperActivities.Time;
import com.arnold.anek.R;

public class Converter extends AppCompatActivity {

    private LinearLayout area,cooking,currency,storage,energy,fuel,distance,weight,power,pressure,speed,temperature,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.converter);

        initView();

        ButtonClicks();
    }

    private void ButtonClicks() {
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(Converter.this, AreaConversion.class)
                );
            }
        });
        cooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(Converter.this, Cooking.class)
                );
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(Converter.this, Speed.class)
                );
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(Converter.this, Temperature.class)
                );
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(Converter.this, Time.class)
                );
            }
        });
    }

    private void initView() {

        area = findViewById(R.id.area);
        cooking = findViewById(R.id.cooking);
        currency = findViewById(R.id.currency);
        storage = findViewById(R.id.storage);
        energy = findViewById(R.id.energy);
        fuel = findViewById(R.id.fuel);
        distance = findViewById(R.id.distance);
        weight = findViewById(R.id.weight);
        power = findViewById(R.id.power);
        pressure = findViewById(R.id.pressure);
        speed = findViewById(R.id.speed);
        temperature = findViewById(R.id.temperature);
        time = findViewById(R.id.time);
    }
}