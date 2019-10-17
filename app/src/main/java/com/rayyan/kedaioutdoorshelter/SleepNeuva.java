package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SleepNeuva extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek10;
    private TextView harga10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_neuva);
        nameInput = findViewById(R.id.input_name);
        merek10 = findViewById(R.id.merek10);
        harga10 = findViewById(R.id.harga10);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk10);
        outputText2 = findViewById(R.id.hrg10);
    }

    public void healderBeli(View view) {
        String name = nameInput.getText().toString();
        String x = merek10.getText().toString();
        String z = harga10.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
