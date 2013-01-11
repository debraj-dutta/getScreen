package com.example.GetScreen;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void getScreen(View v) {
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);

		float density = dm.density;
		int densitydpi = dm.densityDpi;
		int height = dm.heightPixels;
		float scaleddensity = dm.scaledDensity;
		int width = dm.widthPixels;
		float xdpi = dm.xdpi;
		float ydpi = dm.ydpi;

		final TextView tv1 = (TextView) findViewById(R.id.tv1);
		final TextView tv2 = (TextView) findViewById(R.id.tv2);
		final TextView tv3 = (TextView) findViewById(R.id.tv3);
		final TextView tv4 = (TextView) findViewById(R.id.tv4);
		final TextView tv5 = (TextView) findViewById(R.id.tv5);
		final TextView tv6 = (TextView) findViewById(R.id.tv6);
		final TextView tv7 = (TextView) findViewById(R.id.tv7);

		tv1.setText("density: " + density);
		tv2.setText("densityDpi: " + densitydpi);
		tv3.setText("heightPixels: " + height);
		tv4.setText("scaledDensity: " + scaleddensity);
		tv5.setText("widthPixels: " + width);
		tv6.setText("xdpi: " + xdpi);
		tv7.setText("ydpi: " + ydpi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
