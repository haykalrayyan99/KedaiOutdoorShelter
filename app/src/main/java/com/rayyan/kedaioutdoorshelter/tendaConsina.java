package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tendaConsina extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek4;
    private TextView harga4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda_consina);
        nameInput = findViewById(R.id.input_name);
        merek4 = findViewById(R.id.merek4);
        harga4 = findViewById(R.id.harga4);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk4);
        outputText2 = findViewById(R.id.hrg4);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek4.getText().toString();
        String z = harga4.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
