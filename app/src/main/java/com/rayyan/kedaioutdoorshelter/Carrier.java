package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Carrier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrier);
    }

    public void healderDeuter(View view) {
        Intent intent = new Intent(this, CarrierDeuter.class);
        startActivity(intent);
    }

    public void healderOsprey(View view) {
        Intent intent = new Intent(this, carrierOsprey.class);
        startActivity(intent);
    }

    public void healderEiger(View view) {
        Intent intent = new Intent(this, carrierEiger.class);
        startActivity(intent);
    }
}
