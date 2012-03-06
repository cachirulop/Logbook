package com.cachirulop.logbook;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.cachirulop.logbook.R;

public class MainTabWidget extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    Resources res;
	    TabHost tabHost;
	    TabHost.TabSpec spec;            // Reusable TabSpec for each tab
	    Intent intent;                   // Reusable Intent for each tab
	    Context ctx;
	    
	    res  = getResources();   // Resource object to get Drawables
	    tabHost = getTabHost();  // The activity TabHost
	    ctx = this.getApplicationContext();
	    

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    // Initialize a TabSpec for each tab and add it to the TabHost

	    // General info
	    intent = new Intent();
	    intent.setClass(this, LogbookActivity.class);
	    
	    spec = tabHost.newTabSpec("info");
	    spec.setIndicator(res.getString(R.string.tab_title_logbook), res.getDrawable(R.drawable.ic_tab_info));
	    spec.setContent(intent);
	    
	    tabHost.addTab(spec);

	    // Summary
	    intent = new Intent();
	    intent.setClass(this, SummaryActivity.class);
	    
	    spec = tabHost.newTabSpec("summary");
	    spec.setIndicator(res.getString(R.string.tab_title_summary), res.getDrawable(R.drawable.ic_tab_summary));
	    spec.setContent(intent);
	    
	    tabHost.addTab(spec);

	    // Map
	    intent = new Intent(ctx, LogbookMapActivity.class);
	    //intent.setClass(this, LogbookMapActivity.class);
	    
	    spec = tabHost.newTabSpec("map");
	    spec.setIndicator(res.getString(R.string.tab_title_map), res.getDrawable(R.drawable.ic_tab_map));
	    spec.setContent(intent);
	    
	    tabHost.addTab(spec);

	    // GPS info
	    intent = new Intent();
	    intent.setClass(this, GPSActivity.class);
	    
	    spec = tabHost.newTabSpec("satellite");
	    spec.setIndicator(res.getString(R.string.tab_title_gps), res.getDrawable(R.drawable.ic_tab_satellite));
	    spec.setContent(intent);
	    
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}
}
