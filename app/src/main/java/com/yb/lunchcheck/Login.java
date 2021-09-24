package com.yb.lunchcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        TextView tv = findViewById(R.id.editTextTextPersonName6);
        TextView textView = findViewById(R.id.editTextTextPersonName7);
        TextView textView1 = findViewById(R.id.editTextTextPersonName8);
        TextView textView2 = findViewById(R.id.editTextTextPersonName9);
        Button btn = findViewById(R.id.button8);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("click");
                Intent it = new Intent(Login.this,Menu.class);
                startActivity(it);
                finish();
            }
        });

    }

}
