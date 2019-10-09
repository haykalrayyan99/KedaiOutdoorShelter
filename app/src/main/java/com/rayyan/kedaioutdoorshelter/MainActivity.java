package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void healderSewaTenda(View view) {
        Intent intent = new Intent(this, Tenda.class);
        startActivity(intent);
    }

    public void healderSewaCarrier(View view) {
        Intent intent = new Intent(this, Carrier.class);
        startActivity(intent);
    }

    public void healderMatras(View view) {
        Intent intent = new Intent(this, Matras.class);
        startActivity(intent);
    }

    public void healderSleepingBag(View view) {
        Intent intent = new Intent(this, SleepingBag.class);
        startActivity(intent);
    }

    public void healderExit(View view) {
        finish();
    }
}
