package com.example.mozeeb.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar7);
        setSupportActionBar(ToolBarAtas2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
