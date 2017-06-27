package ch.mise.mise_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get web view
        WebView myWebView = (WebView) findViewById(R.id.web_view);

        // Adapt content to the width of the screen
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);

        // Load mise.ch homepage
        myWebView.loadUrl("http://ticino.swiss-mise.info/index/index/index/");

        // Enable javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Assure that links will be opened inside the app
        myWebView.setWebViewClient(new WebViewClient());
    }
}
