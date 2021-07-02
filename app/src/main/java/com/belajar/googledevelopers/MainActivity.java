package com.belajar.googledevelopers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;

    //ini metode Listener
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        //ini perintah klik button dalam class java MainActivity
        button.setOnClickListener(this);

    }

    //ini adalah Metode Handler
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        textView.setText("Berhasil !!");

    }

    @SuppressLint("SetTextI18n")
    public void button_reset(View view) {

        textView.setText("Silakan Klik Ulang");

    }



}

