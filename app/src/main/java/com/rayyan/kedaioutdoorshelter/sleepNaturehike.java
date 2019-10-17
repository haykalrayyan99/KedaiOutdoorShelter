package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sleepNaturehike extends AppCompatActivity {

    private EditText nameInput;
    private TextView outputText,outputText1,outputText2;
    private TextView merek11;
    private TextView harga11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_naturehike);
        nameInput = findViewById(R.id.input_name);
        merek11 = findViewById(R.id.merek11);
        harga11 = findViewById(R.id.harga11);
        outputText = findViewById(R.id.text_output);
        outputText1 = findViewById(R.id.mrk11);
        outputText2 = findViewById(R.id.hrg11);
    }


    public void healderBeli(View view) {

        String name = nameInput.getText().toString();
        String x = merek11.getText().toString();
        String z = harga11.getText().toString();

        outputText.setText("Nama Pembeli : "+ name);
        outputText1.setText("Merek : " + x);
        outputText2.setText("Harga : " + z);
    }
}
