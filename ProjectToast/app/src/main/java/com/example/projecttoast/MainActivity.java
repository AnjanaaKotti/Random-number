package com.example.projecttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toast;
    private Button intent_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast_button);
        intent_btn = findViewById(R.id.toast_button2);
        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Projecttoastapp.class);
                startActivity(intent);

            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Welcome!!!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}