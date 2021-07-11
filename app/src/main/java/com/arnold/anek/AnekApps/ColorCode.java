package com.arnold.anek.AnekApps;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.arnold.anek.R;


public class ColorCode extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    View vColor;
    TextView tvCode,tvValue;
    SeekBar sRed,sGreen,sBlue;
    int red = 0, green = 0, blue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.color_code);

        vColor = findViewById(R.id.color);
        tvCode = findViewById(R.id.tv_code);
        tvValue = findViewById(R.id.tv_value);
        sRed = findViewById(R.id.sb_red);
        sGreen = findViewById(R.id.sb_green);
        sBlue = findViewById(R.id.sb_blue);

        sRed.setOnSeekBarChangeListener(this);
        sGreen.setOnSeekBarChangeListener(this);
        sBlue.setOnSeekBarChangeListener(this);

        tvCode.setOnClickListener(v -> {
            String toCopy = tvCode.getText().toString();
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("Hex Code", toCopy);
            clipboard.setPrimaryClip(clip);
            showToast("Hex Code Copied");
        });

        tvValue.setOnClickListener(v -> {
            String toCopy = tvValue.getText().toString();
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("RGB Value", toCopy);
            clipboard.setPrimaryClip(clip);
            showToast("RGB Value Copied");
        });
    }

    void showToast(String message) {
        Toast toast = new Toast(ColorCode.this);

        @SuppressLint("InflateParams") View view = LayoutInflater.from(ColorCode.this)
                .inflate(R.layout.toast_layout, null);

        TextView tvMessage = view.findViewById(R.id.tvMessage);
        tvMessage.setText(message);

        toast.setView(view);
        toast.show();
    }

    @SuppressLint({"NonConstantResourceId", "DefaultLocale"})
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
        switch (seekBar.getId()){
            case R.id.sb_red:
                red = i;
                break;
            case R.id.sb_green:
                green = i;
                break;
            case R.id.sb_blue:
                blue = i;
                break;
        }

        vColor.setBackgroundColor(Color.rgb(red,green,blue));

        String code = HexCode(red);
        String code1 = HexCode1(green);
        String code2 = HexCode2(blue);
        String codes = "#"+code+code1+code2;

        tvCode.setText(codes.toUpperCase());

        tvValue.setText(String.format("RGB (%d,%d,%d)",red,green,blue));
    }

    private String HexCode(int red) {
        String code;
        if(red < 16){
            code = "0" + Integer.toHexString(red);
        }
        else{
            code = Integer.toHexString(red);
        }

        return code;
    }
    private String HexCode1(int green) {
        String code;
        if(green < 16){
            code = "0" + Integer.toHexString(green);
        }
        else{
            code = Integer.toHexString(green);
        }

        return code;
    }
    private String HexCode2(int blue) {
        String code;
        if(blue < 16){
            code = "0" + Integer.toHexString(blue);
        }
        else{
            code = Integer.toHexString(blue);
        }

        return code;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}