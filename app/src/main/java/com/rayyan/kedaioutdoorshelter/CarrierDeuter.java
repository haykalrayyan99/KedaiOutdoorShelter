package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CarrierDeuter extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek1;
    private TextView harga1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier_deuter);
        nameInput = findViewById(R.id.input_name);
        merek1 = findViewById(R.id.merek1);
        harga1 = findViewById(R.id.harga1);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk1);
        outputText2 = findViewById(R.id.hrg1);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek1.getText().toString();
        String z = harga1.getText().toString();
        if (!name.equals("")) {
            outputText.setText("Nama Pembeli : "+ name);
            outputText1.setText("Merek : " + x);
            outputText2.setText("Harga : " + z);
        } else {
            Toast.makeText(this, "Masukkan Nama Anda!", Toast.LENGTH_SHORT).show();
        }

        
    }
}

