package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;
    EditText E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.tvv);
        b = (Button) findViewById(R.id.hwb);
        E = (EditText) findViewById(R.id.pername);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = E.getText().toString();
                t.setText("Hello," + st);
            }
        });
    }}
