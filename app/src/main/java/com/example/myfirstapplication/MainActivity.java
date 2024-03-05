package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtName;
    TextView txtinput;
    TextView txtDisplay;
    Button btnClickme;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtinput = findViewById(R.id.txtInput);
        txtDisplay = findViewById(R.id.txtDisplay);
        btnClickme = findViewById(R.id.btnClickme);
        btnClear = findViewById(R.id.btnClear);
        txtDisplay.setText("HELLO WORLD!");
        btnClickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtinput.getText().toString();
                txtDisplay.setText("HELLO "+name+"!");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText("HELLO WORLD!");
            }
        });
    }
}