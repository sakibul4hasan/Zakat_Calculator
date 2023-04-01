package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Web_View extends AppCompatActivity {


    WebView web_view;
    public static String videoURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        web_view = findViewById(R.id.web_view);


        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.loadUrl(videoURL);


    }
}