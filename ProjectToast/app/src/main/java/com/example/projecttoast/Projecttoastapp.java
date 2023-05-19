package com.example.projecttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Projecttoastapp extends AppCompatActivity {
    private button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projecttoastapp);
        toast=findViewById(R.id.toast_button2);

    }
}