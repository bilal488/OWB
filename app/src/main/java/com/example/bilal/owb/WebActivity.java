package com.example.bilal.owb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    /////
    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        //
        wb = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = wb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wb.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setDomStorageEnabled(true);
        wb.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wb.loadUrl("https://opensourceeducation.net/");
        wb.setWebViewClient(new WebViewClient());

    }
}
