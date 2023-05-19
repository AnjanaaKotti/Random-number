package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        tv=findViewById(R.id.tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r =new Random();
                int num = r.nextInt(100) + 1;
               String num1=String.valueOf(num);
                tv.setText(num1);

            }
        });
    }
}