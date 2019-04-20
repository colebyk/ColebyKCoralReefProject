package com.example.colebykcoralreefproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class locationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        WebView locationWebView = (WebView) findViewById(R.id.locationWebView);
        locationWebView.getSettings().setSupportZoom(true);
        locationWebView.getSettings().setBuiltInZoomControls(true);
        locationWebView.loadUrl("file:///android_asset/lyra_reef_map_2.png");




    }
}
