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
public class SummaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView textview = new TextView(this);
        textview.setText("Summary activity tab");
        setContentView(textview);
	}
}
