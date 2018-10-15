package com.example.mozeeb.insanpeduli;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;


public class profil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://insanpeduli.com/profil/");

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(ToolBarAtas2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}

