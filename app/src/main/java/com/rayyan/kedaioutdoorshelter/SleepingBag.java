package com.rayyan.kedaioutdoorshelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SleepingBag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleeping_bag);
    }

    public void healderKamui(View view) {
        Intent intent = new Intent(this, kamui.class);
        startActivity(intent);
    }
}
