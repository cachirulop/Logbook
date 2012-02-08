/**
 * 
 */
package com.cachirulop.logbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author david
 *
 */
public class MapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView textview = new TextView(this);
        textview.setText("Map activity tab");
        setContentView(textview);
	}
}
