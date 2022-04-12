package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.menu);

        ImageView img = findViewById(R.id.MenuLogo);
        Button btn = findViewById(R.id.MenuLogin);
        Button btn1 = findViewById(R.id.MenuPlate);
        Button btn2 = findViewById(R.id.MenuWeight);
        Button btn3 = findViewById(R.id.MenuProgress);
        Button btn4 = findViewById(R.id.MenuComparison);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Login.class);
                startActivity(it);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Plate.class);
                startActivity(it);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Weight.class);
                startActivity(it);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Progress.class);
                startActivity(it);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Comparison.class);
                startActivity(it);
            }
        });
    }

}
