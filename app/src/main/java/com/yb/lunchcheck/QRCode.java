package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class QRCode extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.qrcode);

        TextView tvasdfd = findViewById(R.id.textView5);

        tvasdfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvasdfd.setText("qr");
                Intent it = new Intent(QRCode.this,Plate.class);
                startActivity(it);
                finish();
            }
        });

    }
}
