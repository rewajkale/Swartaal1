package com.example.swaartal1;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;
public class Home extends TabActivity {
	static TabHost tabHost;
	static TabSpec tablaspec,tanpuraspec;
	Intent oldintent;
	Intent tablaIntent,tanpuraIntent;
	static String g="here";
	static String s;
	static int t1,t2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		//Toast.makeText(getApplicationContext(), "g="+g, Toast.LENGTH_SHORT).show();
		oldintent=this.getIntent();
		t1=0;t2=0;
		g=oldintent.getStringExtra("back");
		s=oldintent.getStringExtra("song");
		//Toast.makeText(getApplicationContext(), "s="+s, Toast.LENGTH_SHORT).show();
		if(g==null)
		{
			g="here";
		}
		//Toast.makeText(getApplicationContext(), "g="+g, Toast.LENGTH_SHORT).show();
		//Toast.makeText(getApplicationContext(), "t1="+t1, Toast.LENGTH_SHORT).show();
		//Toast.makeText(getApplicationContext(), "t2="+t2, Toast.LENGTH_SHORT).show();
		if(g.equals("back1"))
		{
			t1=1;
			tabHost = getTabHost();
			
			 tablaspec = tabHost.newTabSpec("TablaSongs");
		     tablaspec.setIndicator("TablaSongs", getResources().getDrawable(R.drawable.tabla));
		     tablaIntent = new Intent(this, TablaSongs.class);
		     tablaspec.setContent(tablaIntent);
		     if(t2==0)
				{
		     tanpuraspec = tabHost.newTabSpec("Tanpura");
		     // setting Title and Icon for the Tab
		     tanpuraspec.setIndicator("Tanpura", getResources().getDrawable(R.drawable.single));
		     Intent tanpuraIntent = new Intent(this, Tanpura.class);
		     tanpuraspec.setContent(tanpuraIntent);
		    // Toast.makeText(getApplicationContext(), "t2=0", Toast.LENGTH_SHORT).show();
		     //t1=1;
			}
			if(t2==1)
			{
			     tanpuraspec = tabHost.newTabSpec("TanpuraSongs");
			     // setting Title and Icon for the Tab
			     tanpuraspec.setIndicator("TanpuraSongs", getResources().getDrawable(R.drawable.single));
			     tanpuraIntent = new Intent(this, TanpuraSongs.class);
			     tanpuraspec.setContent(tanpuraIntent);
			     Toast.makeText(getApplicationContext(), "t2=1", Toast.LENGTH_SHORT).show();
			     //t1=1;
			}
			tabHost.clearAllTabs();
		     tabHost.addTab(tablaspec); // Adding photos tab
		     tabHost.addTab(tanpuraspec); // Adding songs tab
		}
		else if(g.equals("back2"))
		{
			t2=1;
			tabHost = getTabHost();
			if(t1==1)
			{
			 tablaspec = tabHost.newTabSpec("TablaSongs");
		     tablaspec.setIndicator("TablaSongs", getResources().getDrawable(R.drawable.tabla));
		     tablaIntent = new Intent(this, TablaSongs.class);
		     //Toast.makeText(getApplicationContext(), "t1=1", Toast.LENGTH_SHORT).show();
		     //t2=1;
			}
			if(t1==0)
			{
				 tablaspec = tabHost.newTabSpec("Tabla");
			     tablaspec.setIndicator("Tabla", getResources().getDrawable(R.drawable.tabla));
			     tablaIntent = new Intent(this, Tabla.class);
			     tablaspec.setContent(tablaIntent);
			     //Toast.makeText(getApplicationContext(), "t1=0", Toast.LENGTH_SHORT).show();
			    // t2=1;
			}
			tanpuraspec = tabHost.newTabSpec("TanpuraSongs");
		     // setting Title and Icon for the Tab
		     tanpuraspec.setIndicator("TanpuraSongs", getResources().getDrawable(R.drawable.single));
		     Intent tanpuraIntent = new Intent(this, TanpuraSongs.class);
		     tablaspec.setContent(tablaIntent);
		     tanpuraspec.setContent(tanpuraIntent);
		     tabHost.clearAllTabs();
		     tabHost.addTab(tablaspec); // Adding photos tab
		     tabHost.addTab(tanpuraspec); // Adding songs tab
		}
		else if(g.equals("bac1"))
		{
			t1=0;
			tabHost = getTabHost();
			tablaspec = tabHost.newTabSpec("Tabla");
		     tablaspec.setIndicator("Tabla", getResources().getDrawable(R.drawable.tabla));
		     tablaIntent = new Intent(this, Tabla.class);
		     tablaspec.setContent(tablaIntent);
			if(t2==1)
			{
		     tanpuraspec = tabHost.newTabSpec("TanpuraSongs");
		     // setting Title and Icon for the Tab
		     tanpuraspec.setIndicator("TanpuraSongs", getResources().getDrawable(R.drawable.single));
		     tanpuraIntent = new Intent(this, TanpuraSongs.class);
		     tanpuraspec.setContent(tanpuraIntent);
		     //Toast.makeText(getApplicationContext(), "t2=1", Toast.LENGTH_SHORT).show();
		     t1=0;
			}
			if(t2==0)
			{
			     tanpuraspec = tabHost.newTabSpec("Tanpura");
			     // setting Title and Icon for the Tab
			     tanpuraspec.setIndicator("Tanpura", getResources().getDrawable(R.drawable.single));
			     tanpuraIntent = new Intent(this, Tanpura.class);
			     tanpuraspec.setContent(tanpuraIntent);
			    // Toast.makeText(getApplicationContext(), "t2=0", Toast.LENGTH_SHORT).show();
			     t1=0;
			}
			tabHost.clearAllTabs();
		     tabHost.addTab(tablaspec); // Adding photos tab
		     tabHost.addTab(tanpuraspec); // Adding songs tab
		}
		else if(g.equals("bac2"))
		{
			tabHost = getTabHost();
			t2=0;
			if(t1==1)
			{
			 tablaspec = tabHost.newTabSpec("TablaSongs");
		     tablaspec.setIndicator("TablaSongs", getResources().getDrawable(R.drawable.tabla));
		     tablaIntent = new Intent(this, TablaSongs.class);
		     tablaspec.setContent(tablaIntent);
		     t2=0;
		     //Toast.makeText(getApplicationContext(), "t1=1", Toast.LENGTH_SHORT).show();
			}
			if(t1==0)
			{
				tabHost = getTabHost();

				 tablaspec = tabHost.newTabSpec("Tabla");
			     tablaspec.setIndicator("Tabla", getResources().getDrawable(R.drawable.tabla));
			     tablaIntent = new Intent(this, Tabla.class);
			     tablaspec.setContent(tablaIntent);
			     t2=0;
			    // Toast.makeText(getApplicationContext(), "t1=0", Toast.LENGTH_SHORT).show();
			}
			tanpuraspec = tabHost.newTabSpec("Tanpura");
		     // setting Title and Icon for the Tab
		     tanpuraspec.setIndicator("Tanpura", getResources().getDrawable(R.drawable.single));
		     tanpuraIntent = new Intent(this, Tanpura.class);
		     tanpuraspec.setContent(tanpuraIntent);
		     tabHost.clearAllTabs();
		     tabHost.addTab(tablaspec); // Adding photos tab
		     tabHost.addTab(tanpuraspec); // Adding songs tab
		}
		else 
			{
			tabHost = getTabHost();

		 tablaspec = tabHost.newTabSpec("Tabla");
	     tablaspec.setIndicator("Tabla", getResources().getDrawable(R.drawable.tabla));
	     tablaIntent = new Intent(this, Tabla.class);
	     tablaspec.setContent(tablaIntent);
	     
	     tanpuraspec = tabHost.newTabSpec("Tanpura");
	     // setting Title and Icon for the Tab
	     tanpuraspec.setIndicator("Tanpura", getResources().getDrawable(R.drawable.single));
	     tanpuraIntent = new Intent(this, Tanpura.class);
	     tanpuraspec.setContent(tanpuraIntent);
	     tabHost.clearAllTabs();
	     tabHost.addTab(tablaspec); // Adding photos tab
	     tabHost.addTab(tanpuraspec); // Adding songs tab
			}

	}

}
