package be.app.project; //JOUW PACKAGE NAAM


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // WebView initialiseren
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);  // JavaScript inschakelen voor WebView
        webView.setWebViewClient(new WebViewClient());     // Zorg ervoor dat de WebView in de app blijft

        // Laad de URL
        webView.loadUrl("https://www.campustoverfluit.be");
    }
}


