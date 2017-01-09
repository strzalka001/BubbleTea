package com.example.milek.projektztp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        ///WebSettings webSettings = myWebView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.google.pl/maps");
    }
}
