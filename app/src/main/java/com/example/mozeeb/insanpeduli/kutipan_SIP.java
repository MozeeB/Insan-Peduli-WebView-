package com.example.mozeeb.insanpeduli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class kutipan_SIP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kutipan__sip);

        WebView myWebView = (WebView) findViewById(R.id.webview6);
        myWebView.loadUrl("http://insanpeduli.com/kutipan-sip/");

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar3);
        setSupportActionBar(ToolBarAtas2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
