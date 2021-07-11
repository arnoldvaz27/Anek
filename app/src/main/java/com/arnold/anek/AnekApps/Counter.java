package com.arnold.anek.AnekApps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.arnold.anek.R;

public class Counter extends AppCompatActivity {

    EditText enterText;
    TextView characterText;
    int numberText;
    String[] words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter);

        enterText = findViewById(R.id.textEnter);
        characterText = findViewById(R.id.characterCounter);

        enterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void afterTextChanged(Editable s) {
                numberText = s.length();

                words = s.toString().split("\\s");

                characterText.setText("Character Count :  "+numberText+"\n\n\nWord Count :  "+words.length);
            }
        });

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if(type.startsWith("text/")){
                handleSendText(intent);
            }
        }
    }

    private void handleSendText(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            enterText.setText(sharedText);
        }
    }
}