package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calculation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calculation);

        TextView tv = findViewById(R.id.textView);
        TextView textView = findViewById(R.id.textView2);
        TextView textView1 = findViewById(R.id.editTextNumber4);
        TextView textView2 = findViewById(R.id.editTextNumber5);
        Button btn = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("click");
                Intent it = new Intent(Calculation.this,Progress.class);
                startActivity(it);
                finish();
            }
        });

    }
}
