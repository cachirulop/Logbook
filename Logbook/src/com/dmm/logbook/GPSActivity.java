/**
 * 
 */
package com.dmm.logbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author david
 *
 */
public class GPSActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView textview = new TextView(this);
        textview.setText("GPS activity tab");
        setContentView(textview);
	}
}
