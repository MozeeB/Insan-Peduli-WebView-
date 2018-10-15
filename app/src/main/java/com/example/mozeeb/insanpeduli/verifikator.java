package com.example.mozeeb.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class verifikator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikator);

        WebView myWebView = (WebView) findViewById(R.id.webview4);
        myWebView.loadUrl("http://insanpeduli.com/verifikator-sip/");

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar4);
        setSupportActionBar(ToolBarAtas2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
