package com.example.projectfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView tv;
    private EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        tv=findViewById(R.id.tv_text);
        et=findViewById(R.id.et_text);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String name=et.getText().toString();
                if (name.length()>0)
                {
                  tv.setText("Hello "  +name+  " Welcome!");
                }else{
                    Toast toast=Toast.makeText(MainActivity.this, "Fill the name!", Toast.LENGTH_SHORT);
                    toast.show();


                }


            }
        });
    }
}