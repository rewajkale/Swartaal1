package com.example.swaartal1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Tanpura extends Activity {
	Spinner spinner1,spinner2,spinner3,spinner4;
	static List<String> list;
	  static String str1,str2;
	  ArrayAdapter<String> dataAdapter;
	  static int t,k,m,n;
	  Intent i,oldintent;
	  static StringBuilder sb;
	  static String str;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tanpura);
		sb= new StringBuilder();
		sb.delete(0, 4);
		//Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
		//oldintent=this.getIntent();
		spinner1=(Spinner) findViewById(R.id.spinner1);
		spinner2=(Spinner) findViewById(R.id.spinner2);
		spinner3=(Spinner) findViewById(R.id.spinner3);
		spinner4=(Spinner) findViewById(R.id.spinner4);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> spinner, View view,
					int pos, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(spinner.getContext(), 
		    			//"OnItemSelectedListener : " + spinner.getItemAtPosition(pos).toString(),
		    			//Toast.LENGTH_SHORT).show();
		    		str1= spinner.getItemAtPosition(pos).toString();
		    		List<String> scale = null;
		    		ArrayAdapter<String> dataAdapter;
		    		//Toast.makeText(spinner.getContext(), str1, Toast.LENGTH_SHORT).show();
		    		list = new ArrayList<String>();
		    		long id=spinner.getItemIdAtPosition(pos);
		    		if(id==0)
		    		{
		    			scale = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.scale_arrays)));
		    		}
		    		else if(id==1)
		    		{
		    			scale = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.scale_arrays1)));
		    		}
		    		t=(int) (id+1);
		    		dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, scale);
					dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					    spinner2.setAdapter(dataAdapter);
					    spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

							@Override
							public void onItemSelected(AdapterView<?> spinner,
									View view, int pos, long arg3) {
								// TODO Auto-generated method stub
								/*Toast.makeText(spinner.getContext(), 
				            			"OnItemSelectedListener : " + spinner.getItemAtPosition(pos).toString(),
				            			Toast.LENGTH_SHORT).show();*/
								str1= spinner.getItemAtPosition(pos).toString();
								List<String> swaar = null;
								ArrayAdapter<String> dataAdapter;
					    		//Toast.makeText(spinner.getContext(), str1, Toast.LENGTH_SHORT).show();
					    		list = new ArrayList<String>();
					    		long id=spinner.getItemIdAtPosition(pos);
					    		if((t==1)&&(id==5))
					    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar7_arrays)));
					    		else if(t==1)
					    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar8_arrays)));
					    		if((t==2)&&(id==8))
					    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar9_arrays)));
					    		else if(t==2)
					    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar8_arrays)));
					    		k=(int) (id+1);
					    		dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, swaar);
					    		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							    spinner3.setAdapter(dataAdapter);
							    spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> spinner, View view,
											int pos, long arg3) {
										// TODO Auto-generated method stub
										/*Toast.makeText(spinner.getContext(), 
						            			"OnItemSelectedListener : " + spinner.getItemAtPosition(pos).toString(),
						            			Toast.LENGTH_SHORT).show();*/
										str1= spinner.getItemAtPosition(pos).toString();
										List<String> tempo_swaar = null;
										ArrayAdapter<String> dataAdapter;
							    		//Toast.makeText(spinner.getContext(), str1, Toast.LENGTH_SHORT).show();
							    		list = new ArrayList<String>();
							    		long id=spinner.getItemIdAtPosition(pos);
							    		if(((id==0)||(id==1)))
							    		     tempo_swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swar_tempo_arrays)));
							    		m=(int) (id+1);
							    		dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, tempo_swaar);
							    		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							    		spinner4.setAdapter(dataAdapter);
							    		spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {

											@Override
											public void onItemSelected(
													AdapterView<?> spinner,
													View view, int pos,
													long arg3) {
												// TODO Auto-generated method stub
												long id=spinner.getItemIdAtPosition(pos);
												n=(int)(id+1);
												sb.delete(0, 4);
												sb.append(t);
												sb.append(k);
												sb.append(m);
												sb.append(n);
												//Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
											}

											@Override
											public void onNothingSelected(
													AdapterView<?> parent) {
												// TODO Auto-generated method stub
												
											}
										});
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> parent) {
										// TODO Auto-generated method stub
										
									}
								});
							}

							@Override
							public void onNothingSelected(AdapterView<?> parent) {
								// TODO Auto-generated method stub
								
							}
						});
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void onNext(View v)
	{
		String g="back2";
		str=sb.toString();
		i=new Intent(getApplicationContext(), Home.class);
		i.putExtra("back", g);
		i.putExtra("song", str);
		this.startActivity(i);
	}
}
