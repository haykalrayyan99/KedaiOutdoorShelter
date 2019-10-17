package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class matrasConsina extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek9;
    private TextView harga9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matras_consina);
        nameInput = findViewById(R.id.input_name);
        merek9 = findViewById(R.id.merek9);
        harga9 = findViewById(R.id.harga9);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk9);
        outputText2 = findViewById(R.id.hrg9);
    }

    public void healderBeli(View view) {

        String name = nameInput.getText().toString();
        String x = merek9.getText().toString();
        String z = harga9.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
