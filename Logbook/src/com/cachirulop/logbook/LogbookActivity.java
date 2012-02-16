package com.cachirulop.logbook;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dmm.logbook.R;

public class LogbookActivity extends Activity {
	public static final int MENU_ADD = 1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        //setContentView(R.layout.main);
		TextView textview = new TextView(this);
        textview.setText("Logbook activity tab");
        setContentView(textview);        
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean result;
		MenuItem item;
		
		result = super.onCreateOptionsMenu(menu);
		
		item = menu.add(0, MENU_ADD, 0, R.string.menu_add);
		item.setIcon(R.drawable.ic_tab_add);
		
		return result;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case MENU_ADD:
            return true;
        }
        
        return super.onOptionsItemSelected(item);
    }
}