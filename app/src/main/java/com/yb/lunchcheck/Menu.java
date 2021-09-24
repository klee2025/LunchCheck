package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calculation);

        TextView tv = findViewById(R.id.textView13);
        Button btn = findViewById(R.id.button9);
        Button btn1 = findViewById(R.id.button10);
        Button btn2 = findViewById(R.id.button11);
        Button btn3 = findViewById(R.id.button12);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Menu");
                Intent it = new Intent(Menu.this,Plate.class);
                startActivity(it);
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Menu");
                Intent it = new Intent(Menu.this,Weight.class);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Menu");
                Intent it = new Intent(Menu.this,Progress.class);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Menu");
                Intent it = new Intent(Menu.this,Comparison.class);
            }
        });
    }

}
