/**
 * 
 */
package com.cachirulop.logbook;

import com.google.android.maps.MapActivity;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * @author david
 *
 */
public class LogbookMapActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.maptabview);
/*
		TextView textview = new TextView(this);
        textview.setText("Map activity tab");
        setContentView(textview);
*/
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}
