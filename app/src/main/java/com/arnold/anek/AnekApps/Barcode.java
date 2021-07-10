package com.arnold.anek.AnekApps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arnold.anek.R;
import com.arnold.anek.ScannerView;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Barcode extends AppCompatActivity {

    public static TextView scannedText;
    ImageView scanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barcode);

        scannedText = findViewById(R.id.scannedText);
        scanner = findViewById(R.id.scanner);

        scanner.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), ScannerView.class)));
    }

}