package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Comparison extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.comparison);

        TextView tv = findViewById(R.id.textView11);
        TextView textView = findViewById(R.id.textView12);
        TextView textView1 = findViewById(R.id.editTextNumber7);
        Button btn = findViewById(R.id.button7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("click");
                Intent it = new Intent(Comparison.this,Weight.class);
                startActivity(it);
                finish();
            }
        });

    }

}
