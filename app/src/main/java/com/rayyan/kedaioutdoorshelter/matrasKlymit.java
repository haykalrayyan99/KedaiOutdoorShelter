package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class matrasKlymit extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek2;
    private TextView harga2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matras_klymit);
        nameInput = findViewById(R.id.input_name);
        merek2 = findViewById(R.id.merek2);
        harga2 = findViewById(R.id.harga2);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk2);
        outputText2 = findViewById(R.id.hrg2);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek2.getText().toString();
        String z = harga2.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
