package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class carrierEiger extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek7;
    private TextView harga7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier_eiger);
        nameInput = findViewById(R.id.input_name);
        merek7 = findViewById(R.id.merek7);
        harga7 = findViewById(R.id.harga7);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk7);
        outputText2 = findViewById(R.id.hrg7);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek7.getText().toString();
        String z = harga7.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
