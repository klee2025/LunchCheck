package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.weight);

        TextView tv = findViewById(R.id.FoodInfo);
        EditText editText = findViewById(R.id.BeforeInput);
        EditText editText1 = findViewById(R.id.AfterInput);
        Button btn = findViewById(R.id.nextPage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("click");
                Intent it = new Intent(Weight.this,Calculation.class);
                startActivity(it);
                finish();
            }
        });

    }
}
