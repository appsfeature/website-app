package com.appsfeature.browser.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.appsfeature.browser.util.AppConstant;
import com.browser.BrowserClassUtil;
import com.browser.BrowserSdk;


public class MainActivity extends Activity {
	final Context context = this;
	
	// Splash screen timer
	private static final int SPLASH_TIME_OUT = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		startMainActivity();
	}

	private void startMainActivity() {
		new Handler(Looper.myLooper()).postDelayed(new Runnable() {
			@Override
			public void run() {
//				BrowserClassUtil.openProfileLink(MainActivity.this, "Live Tv", AppConstant.BASE_URL);
//				BrowserSdk.openVideoPlayer(MainActivity.this, "7PIji8OubXU", "Live Tv");
				startActivity(new Intent(MainActivity.this, BrowserCustomActivity.class));
				finish();
			}
		},SPLASH_TIME_OUT);
	}
}
