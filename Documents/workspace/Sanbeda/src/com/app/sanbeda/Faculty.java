package com.app.sanbeda;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Faculty extends Activity {
    private WebView webView;
    WebView ourBrow;
 
 
    @SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.faculty);
 
        webView = (WebView) findViewById(R.id.webView1);
       
        WebView webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setGeolocationEnabled(true);
		webView.getSettings().setJavaScriptEnabled(true);
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.setWebViewClient(new WebViewClient());
        
		ourBrow = (WebView) findViewById(R.id.webView1);
		ourBrow.loadUrl("http://mateo.sanbeda.edu.ph/aims/faculty/");
        webView.setWebViewClient(new WebViewClient() {
 
            /*
             * (non-Javadoc)
             *
             * @see
             * android.webkit.WebViewClient#onReceivedError(android.webkit.WebView
             * , int, java.lang.String, java.lang.String)
             */
            @Override
            public void onReceivedError(WebView view, int errorCode,
                    String description, String failingUrl) {
                // TODO Auto-generated method stub
                super.onReceivedError(view, errorCode, description, failingUrl);
                loadError();
            }
        });
 
        webView.loadUrl("http://mateo.sanbeda.edu.ph/aims/faculty/");
    }
 
    @SuppressLint("NewApi")
	private void loadError() {
    	  setContentView(R.layout.faculty2);
       
    }
  
        
       
public boolean isNetworkAvailable() {
ConnectivityManager cm = (ConnectivityManager)
getSystemService(Context.CONNECTIVITY_SERVICE);
NetworkInfo networkInfo = cm.getActiveNetworkInfo();
// if no network is available networkInfo will be null
// otherwise check if we are connected
if (networkInfo != null && networkInfo.isConnected()) {
    return true;
}
return false;
}
}