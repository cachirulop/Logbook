package com.cachirulop.logbook;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.dmm.logbook.R;

public class MainTabWidget extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Resources res = getResources();  // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;            // Resusable TabSpec for each tab
	    Intent intent;                   // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    // Initialize a TabSpec for each tab and add it to the TabHost

	    // General info
	    intent = new Intent().setClass(this, LogbookActivity.class);
	    spec = tabHost.newTabSpec("info").setIndicator(res.getString(R.string.tab_title_logbook),
	                      res.getDrawable(R.drawable.ic_tab_info))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // Summary
	    intent = new Intent().setClass(this, SummaryActivity.class);
	    spec = tabHost.newTabSpec("summary").setIndicator(res.getString(R.string.tab_title_summary),
	                      res.getDrawable(R.drawable.ic_tab_summary))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // Map
	    intent = new Intent().setClass(this, MapActivity.class);
	    spec = tabHost.newTabSpec("map").setIndicator(res.getString(R.string.tab_title_map),
	                      res.getDrawable(R.drawable.ic_tab_map))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // GPS info
	    intent = new Intent().setClass(this, GPSActivity.class);
	    spec = tabHost.newTabSpec("satellite").setIndicator(res.getString(R.string.tab_title_gps),
	                      res.getDrawable(R.drawable.ic_tab_satellite))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}
}
