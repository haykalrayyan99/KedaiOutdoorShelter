package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class carrierOsprey extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek6;
    private TextView harga6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier_osprey);
        nameInput = findViewById(R.id.input_name);
        merek6 = findViewById(R.id.merek6);
        harga6 = findViewById(R.id.harga6);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk6);
        outputText2 = findViewById(R.id.hrg6);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek6.getText().toString();
        String z = harga6.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
