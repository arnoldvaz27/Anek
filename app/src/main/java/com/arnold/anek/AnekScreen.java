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
    Intent intent;

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
            intent = new Intent(AnekScreen.this, LinkifyLinks.class);
            startActivity(intent);
        });
        counter.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Counter.class);
            startActivity(intent);

        });
        passwords.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Passwords.class);
            startActivity(intent);

        });
        notebook.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Notebook.class);
            startActivity(intent);

        });
        barcode.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Barcode.class);
            startActivity(intent);

        });
        gallery.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, PhotoGallery.class);
            startActivity(intent);

        });
        browser.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, BrowserSearch.class);
            startActivity(intent);

        });
        colorCode.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, ColorCode.class);
            startActivity(intent);

        });
        calculator.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Calculator.class);
            startActivity(intent);

        });
        converter.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Converter.class);
            startActivity(intent);

        });
        diceRoller.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, DiceRoller.class);
            startActivity(intent);

        });
        recorder.setOnClickListener(v -> {
            intent = new Intent(AnekScreen.this, Recorder.class);
            startActivity(intent);

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