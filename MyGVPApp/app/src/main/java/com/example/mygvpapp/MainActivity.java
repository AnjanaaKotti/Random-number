package com.example.mygvpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView tv1;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        et1=findViewById(R.id.et1);
        tv1=findViewById(R.id.tv1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= et1.getText().toString();
                if(name.length()>0){


                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this, "Fill the name!", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });
    }
}