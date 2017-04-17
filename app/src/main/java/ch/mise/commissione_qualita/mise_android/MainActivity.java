package ch.mise.commissione_qualita.mise_android;

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

        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);

        // Load mise.ch homepage
        myWebView.loadUrl("http://ticino.swiss-mise.info/index/index/index/");

        // Enable javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Assure that link will opened inside the app
        myWebView.setWebViewClient(new WebViewClient());
    }
}
