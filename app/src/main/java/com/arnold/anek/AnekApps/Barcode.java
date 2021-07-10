package com.arnold.anek.AnekApps;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.arnold.anek.CaptureAct;
import com.arnold.anek.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Barcode extends AppCompatActivity {

    public static TextView scannedText;
    ImageView scanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.barcode);

        scannedText = findViewById(R.id.scannedText);
        scanner = findViewById(R.id.scanner);

        scanner.setOnClickListener(v ->
                scanCode());
    }

    private void scanCode() {
        IntentIntegrator intentIntegrator = new IntentIntegrator(this);
        intentIntegrator.setCaptureActivity(CaptureAct.class);
        intentIntegrator.setOrientationLocked(false);
        intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        intentIntegrator.setPrompt("Scanning Code");
        intentIntegrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable  Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result != null){
            if(result.getContents() != null){
                scannedText.setText(result.getContents());
            }
            else{
                Toast.makeText(this, "No Result", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            super.onActivityResult(requestCode,resultCode,data);
        }
    }
}