package com.projectshoponline.app_new_tabhost;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

	private static int SPLASH_TIME_OUT = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		ActionBar actionBar = getSupportActionBar();
		actionBar.hide();



		new Handler().postDelayed(new Runnable() {

   /*
    * Showing splash screen with a timer. This will be useful when you
    * want to show case your app logo / company
    */

			@Override
			public void run() {


				Intent i = new Intent(SplashScreen.this, Page_Login.class);
				startActivity(i);


				finish();
			}
		}, SPLASH_TIME_OUT);
	}
	
}