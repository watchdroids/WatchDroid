package com.example.ahe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WifiHacking extends Activity {

	WebView webview;
	final String html = "<html><h3>Unable to connect to wifi pineapple. Check to make sure you are connected to it via wifi</h3></html>";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wifi_main);
		webview = (WebView) findViewById(R.id.wvPineapple);
		configureWebView();
	}

	private void configureWebView() {
		// TODO Auto-generated method stub
		webview.getSettings().setJavaScriptEnabled(true);
		webview.getSettings().setLoadWithOverviewMode(true);
		webview.getSettings().setUseWideViewPort(true);
		try {
			webview.loadUrl("http://172.16.42.1:1471");
		} catch (Exception e) {
			e.printStackTrace();
		}
		webview.setWebViewClient(new WebViewClient() {
			@Override
			public void onReceivedError(WebView view, int errorCode,
					String description, String failingUrl) {
				// do something
				webview.loadData(html, "text/html", null);
			}
		});
	}
}
