package com.arnold.anek;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.arnold.anek.AnekApps.Barcode;
import com.arnold.anek.AnekApps.BrowserSearch;
import com.arnold.anek.AnekApps.Calculator;
import com.arnold.anek.AnekApps.ColorCode;
import com.arnold.anek.AnekApps.Converter;
import com.arnold.anek.AnekApps.Counter;
import com.arnold.anek.AnekApps.DiceRoller;
import com.arnold.anek.AnekApps.LinkifyLinks;
import com.arnold.anek.AnekApps.Notebook;
import com.arnold.anek.AnekApps.Passwords;
import com.arnold.anek.AnekApps.PhotoGallery;
import com.arnold.anek.AnekApps.Recorder;

public class AnekScreen extends AppCompatActivity {

    private LinearLayout linkify, counter, passwords, notebook, barcode, gallery,
            browser, colorCode, calculator, converter, diceRoller, recorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.anek_screen);

        initView();

        appClicks();
    }

    private void appClicks() {

        linkify.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), LinkifyLinks.class));
        });
        counter.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Counter.class));

        });
        passwords.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Passwords.class));

        });
        notebook.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Notebook.class));

        });
        barcode.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Barcode.class));

        });
        gallery.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), PhotoGallery.class));

        });
        browser.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), BrowserSearch.class));

        });
        colorCode.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), ColorCode.class));

        });
        calculator.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Calculator.class));

        });
        converter.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Converter.class));

        });
        diceRoller.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), DiceRoller.class));

        });
        recorder.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Recorder.class));

        });
    }

    private void initView() {
        linkify = findViewById(R.id.linkify);
        counter = findViewById(R.id.counter);
        passwords = findViewById(R.id.passwords);
        notebook = findViewById(R.id.notebook);
        barcode = findViewById(R.id.barcode);
        gallery = findViewById(R.id.gallery);
        browser = findViewById(R.id.browser);
        colorCode = findViewById(R.id.colorCode);
        calculator = findViewById(R.id.calculator);
        converter = findViewById(R.id.converter);
        diceRoller = findViewById(R.id.dices);
        recorder = findViewById(R.id.recorder);
    }
}