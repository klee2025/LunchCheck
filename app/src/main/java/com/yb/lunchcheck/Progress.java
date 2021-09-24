package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Progress extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.progress);

        TextView tv = findViewById(R.id.textView3);
        TextView textView = findViewById(R.id.textView4);
        TextView textView1 = findViewById(R.id.editTextNumber6);
        Button btn = findViewById(R.id.button5);
        ProgressBar progressBar = findViewById(R.id.progressBar2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("check");
                Intent it = new Intent(Progress.this,Comparison.class);
                startActivity(it);
                finish();
            }
        });

    }

}
