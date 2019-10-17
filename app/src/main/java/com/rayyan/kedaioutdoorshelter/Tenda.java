package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tenda extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenda);

    }

    public void healderEiger(View view) {
        Intent intent = new Intent(this, TendaEiger.class);
        startActivity(intent);
    }

    public void healderConsina(View view) {

        Intent intent = new Intent(this, tendaConsina.class);
        startActivity(intent);
    }

    public void healderRei(View view) {
        Intent intent = new Intent(this, tendaRei.class);
        startActivity(intent);
    }
}
