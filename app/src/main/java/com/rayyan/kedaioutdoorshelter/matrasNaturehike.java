package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class matrasNaturehike extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek8;
    private TextView harga8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matras_naturehike);
        nameInput = findViewById(R.id.input_name);
        merek8 = findViewById(R.id.merek8);
        harga8 = findViewById(R.id.harga8);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk8);
        outputText2 = findViewById(R.id.hrg8);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek8.getText().toString();
        String z = harga8.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
