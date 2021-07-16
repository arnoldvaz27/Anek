package com.arnold.anek;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.arnold.anek.AnekApps.Barcode;
import com.arnold.anek.AnekApps.BrowserSearch;
import com.arnold.anek.AnekApps.Calculator;
import com.arnold.anek.AnekApps.ColorCode;
import com.arnold.anek.AnekApps.Compass;
import com.arnold.anek.AnekApps.Converter;
import com.arnold.anek.AnekApps.Counter;
import com.arnold.anek.AnekApps.Diary;
import com.arnold.anek.AnekApps.DiceRoller;
import com.arnold.anek.AnekApps.LinkifyLinks;
import com.arnold.anek.AnekApps.Notebook;
import com.arnold.anek.AnekApps.Passwords;
import com.arnold.anek.AnekApps.PhotoGallery;
import com.arnold.anek.AnekApps.QrCode;
import com.arnold.anek.AnekApps.Recorder;

public class AnekScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.anek_screen);

        findViewById(R.id.linkify).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), LinkifyLinks.class));
        });
        findViewById(R.id.counter).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Counter.class));

        });
        findViewById(R.id.passwords).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Passwords.class));

        });
        findViewById(R.id.compass).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Compass.class));

        });
        findViewById(R.id.notebook).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Notebook.class));

        });
        findViewById(R.id.diary).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Diary.class));

        });
        findViewById(R.id.barcode).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Barcode.class));

        });
        findViewById(R.id.qrCode).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), QrCode.class));

        });
        findViewById(R.id.gallery).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), PhotoGallery.class));

        });
        findViewById(R.id.browser).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), BrowserSearch.class));

        });
        findViewById(R.id.colorCode).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), ColorCode.class));

        });
        findViewById(R.id.calculator).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Calculator.class));

        });
        findViewById(R.id.converter).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Converter.class));

        });
        findViewById(R.id.dices).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), DiceRoller.class));

        });
        findViewById(R.id.recorder).setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Recorder.class));

        });
    }

}