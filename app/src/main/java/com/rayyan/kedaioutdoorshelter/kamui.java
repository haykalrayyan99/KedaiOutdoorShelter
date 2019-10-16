package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kamui extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek3;
    private TextView harga3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamui);
        nameInput = findViewById(R.id.input_name);
        merek3 = findViewById(R.id.merek3);
        harga3 = findViewById(R.id.harga3);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk3);
        outputText2 = findViewById(R.id.hrg3);
    }

    public void healderBelili(View view) {
        String name = nameInput.getText().toString();
        String x = merek3.getText().toString();
        String z = harga3.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
