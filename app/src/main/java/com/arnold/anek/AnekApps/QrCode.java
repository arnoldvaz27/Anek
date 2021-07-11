package com.arnold.anek.AnekApps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.arnold.anek.R;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class QrCode extends AppCompatActivity {

    private EditText qrText;
    private ImageView qrCode;
    private File pdfFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.light_red));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        setContentView(R.layout.qr_code);

        qrText = findViewById(R.id.qrText);
        qrCode = findViewById(R.id.qrCode);



        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if(type.startsWith("text/")) {
                handleSendText(intent);
            }
        }

        qrCode.setOnClickListener(v -> {
            if(TextUtils.isEmpty(qrText.getText().toString())){
                Toast.makeText(this, "QR Code can not be generated if there is no written text", Toast.LENGTH_SHORT).show();
            }
            else{
                try {
                    createQRCode();
                } catch (Exception exception) {
                    Toast.makeText(this, exception.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void handleSendText(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        qrText.setText(sharedText);
    }

    private void createQRCode() throws Exception {
        File docsFolder = new File(Environment.getExternalStorageDirectory() + File.separator + "Anek" + File.separator + "QR Codes");
        boolean success = true;
        if (!docsFolder.exists()) {
         success = docsFolder.mkdirs();
        }
        if(success){
            String randCode = new SimpleDateFormat("dd MM yyyy HH:mm:ss a", Locale.getDefault()).format(new Date());
            randCode = randCode.replaceAll(":", "");
            randCode = randCode.replaceAll(" ", "");
            pdfFile = new File(docsFolder.getAbsolutePath(), randCode + ".pdf");
            OutputStream outputStream = new FileOutputStream(pdfFile);
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);

            document.open();
            PdfContentByte cb = writer.getDirectContent();

            BarcodeQRCode barcodeQRCode = new BarcodeQRCode(qrText.getText().toString(), 1000, 1000, null);
            Image codeQrImage = barcodeQRCode.getImage();
            codeQrImage.scaleAbsolute(350, 350);
            document.add(codeQrImage);
            document.newPage();

            document.close();
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }
}