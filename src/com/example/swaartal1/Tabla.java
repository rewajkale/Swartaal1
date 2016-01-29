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
import android.widget.TabHost.TabSpec;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Tabla extends Activity {
	Spinner spinner1,spinner2,spinner3,spinner4;
	static List<String> list;
	  static String str1,str2;
	  ArrayAdapter<String> dataAdapter;
	  static int t,k,m,n;
	  Intent i,oldintent;
	  static StringBuilder sb;
	  static String str;
	  //TextView text1,text2,text3,text4;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tabla);
	sb= new StringBuilder();
	sb.delete(0, 4);
	//Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
	//oldintent=this.getIntent();
	spinner1=(Spinner) findViewById(R.id.spinner1);
	spinner2=(Spinner) findViewById(R.id.spinner2);
	spinner3=(Spinner) findViewById(R.id.spinner3);
	spinner4=(Spinner) findViewById(R.id.spinner4);
	/*text1=(TextView) findViewById(R.id.textView1);
	text2=(TextView) findViewById(R.id.textView2);
	text3=(TextView) findViewById(R.id.textView3);
	text4=(TextView) findViewById(R.id.textView4);
	text1.setText("Select Scale of your choice");
	text2.setText("Select your Taal");
	text3.setText("Select your Swaar");
	text4.setText("Select your Laya");
	spinner4.setVisibility(1);*/
	spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> spinner, View arg1, int pos,
				long arg3) {
			// TODO Auto-generated method stub
			/*Toast.makeText(spinner.getContext(), 
	    			"OnItemSelectedListener : " + spinner.getItemAtPosition(pos).toString(),
	    			Toast.LENGTH_SHORT).show();*/
	    		str1= spinner.getItemAtPosition(pos).toString();
	    		List<String> taal = null;
	    		ArrayAdapter<String> dataAdapter;
	    		//Toast.makeText(spinner.getContext(), str1, Toast.LENGTH_SHORT).show();
	    		list = new ArrayList<String>();
	    		long id=spinner.getItemIdAtPosition(pos);
	    		if((id==0)||(id==1)||(id==3)||(id==4)||(id==6)||(id==9))
				{
				/*list.add("Ada Choutal (अदा चौताल )");
				list.add("Ektal (एकताल) ");
				list.add("Sultal ( सुलताल ) ");
				list.add("Addha Tintal (अधा तिनताल)");
				list.add("Filmi Keherava (फ़िल्मी केहरवा)");
				list.add("Tevara (तेवरा)");
				list.add("Bhajani (भजनि)");
				list.add("Gandharvi Addha (गधर्वी अद्ध)");
				list.add("Tilwada (तिलवाडा)");
				list.add("Choutal(चौतल)");
				list.add("Keherava (केहरवा)");
				list.add("Trital (तिनताल)");
				list.add("Dadra (दादरा)");
				list.add("Keherava Khol Eeffect ( केहेरवा खोल ईफ़ेक्ट)");
				list.add("Zampa ( ज़म्पा)");
				list.add("Dhamar (धमार)");
				list.add("Khemata ( खेमटा)");
				list.add("Zaptal ( झपताल)");
				list.add("Dhumali (धुमली)");
				list.add("Punjabi Addha ( पंजाबी अध्धा)");
				list.add("Zumara (झुमरा)");
				list.add("Dipchandi (दिपचंदी)");
				list.add("Rupak (रुपक)");*/
	    			taal = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.taal1_arrays)));
	    			
	    			//dataAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.taal1_arrays, android.R.layout.simple_spinner_item);	
				//Toast.makeText(spinner.getContext(), "Hello India", Toast.LENGTH_SHORT).show();
				}
				else if(id==5)
				{
					/*list.add("Ada Choutal (अदा चौताल )");
					list.add("Ektal (एकताल) ");
					list.add("Sultal ( सुलताल ) ");
					list.add("Addha Tintal (अधा तिनताल)");
					list.add("Filmi Keherava (फ़िल्मी केहरवा)");
					list.add("Tevara (तेवरा)");
					list.add("Bhajani (भजनि)");
					list.add("Gandharvi Addha (गधर्वी अद्ध)");
					list.add("Tilwada (तिलवाडा)");
					list.add("Choutal(चौतल)");
					list.add("Keherava (केहरवा)");
					list.add("Trital (तिनताल)");
					list.add("Dadra (दादरा)");
					list.add("Khemata ( खेमटा)");
					list.add("Zampa ( ज़म्पा)");
					list.add("Dhamar (धमार)");
					list.add("Punjabi Addha ( पंजाबी अध्धा)");
					list.add("Zaptal ( झपताल)");
					list.add("Dhumali (धुमली)");
					list.add("Rupak (रुपक)");
					list.add("Zumara (झुमरा)");
					list.add("Dipchandi (दिपचंदी)");*/
					taal = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.taal2_arrays)));
					//dataAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.taal2_arrays, android.R.layout.simple_spinner_item);
					//Toast.makeText(spinner.getContext(), "Hello USA", Toast.LENGTH_SHORT).show();
				}
				else if(id==2)
				{
					/*list.add("Ada Choutal (अदा चौताल )");
					list.add("Dipchandi (दिपचंदी)");
					list.add("Tilwada (तिलवाडा)");
					list.add("Addha Tintal (अधा तिनताल)");
					list.add("Ektal (एकताल)");
					list.add("Trital (तिनताल)");
					list.add("Bhajani (भजनि)");
					list.add("Keherava (केहरवा)");
					list.add("Zaptal ( झपताल)");
					list.add("Dadra (दादरा)");
					list.add("Mattatal (मात)");
					list.add("Zumara (झुमरा)");
					list.add("Dhumali (धुमली)");
					list.add("Rupak (रुपक)");*/
					taal = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.taal3_arrays)));
					//dataAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.taal3_arrays, android.R.layout.simple_spinner_item);
				}
				else if((id==7)||(id==8))
				{
					/*list.add("Ada Choutal (अदा चौताल )");
					list.add("Dipchandi (दिपचंदी)");
					list.add("Sultal ( सुलताल )");
					list.add("Addha Tintal (अधा तिनताल)");
					list.add("Ektal (एकताल)");
					list.add("Tevara (तेवरा)");
					list.add("Bhajani (भजनि)");
					list.add("Keherava (केहरवा)");
					list.add("Tilwada (तिलवाडा)");
					list.add("Choutal(चौतल)");
					list.add("Mattatal (मात)");
					list.add("Trital (तिनताल)");
					list.add("Dadra (दादरा)");
					list.add("Pancham Sawari Type 1");
					list.add("Zaptal ( झपताल)");
					list.add("Dhamar (धमार)");
					list.add("Pancham Sawari Type 2");
					list.add("Zumara (झुमरा)");
					list.add("Dhumali (धुमली)");
					list.add("Rupak (रुपक)");*/
					taal = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.taal4_arrays)));
					//dataAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.taal4_arrays, android.R.layout.simple_spinner_item);
				}
				/*if(id==0)
					t=1;
				else if(id==1)
					t=2;
				else if(id==2)
					t=3;
				else if(id==3)
					t=4;
				else if(id==4)
					t=5;
				else if(id==5)
					t=6;
				else if(id==6)
					t=7;
				else if(id==7)
					t=8;
				else if(id==8)
					t=9;
				else if(id==9)
					t=10;*/
				t=(int) (id+1);
	    		//ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(spinner.getContext(),android.R.layout.simple_spinner_item, list);
				//ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dataAdapter);
				dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, taal);
				dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				    spinner2.setAdapter(dataAdapter);
				    spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> spinner, View arg1,
								int pos, long arg3) {
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
				    		k=(int) (id+1);
				    		if((t==1)&&((id==5)||(id==6)||(id==8)||(id==14)))
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");
				    			list.add("Pakhavaj");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar1_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar1_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==1)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==2)&&(id==6))
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");
				    			list.add("Pakhavaj");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar1_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar1_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if((t==2)&&(id==16))
				    		{
				    			//list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar3_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar3_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==2)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if(t==3)
				    		{
				    			//list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar3_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar3_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==5)&&((id==4)||(id==10)||(id==13)||(id==14)))
				    		{
				    			//list.add("Tabla High Pitch-तार_स्वर");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar4_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar4_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if((t==5)&&(id==18))
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");
				    			list.add("Pakhavaj");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar1_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar1_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==5)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==6)&&((id==4)||(id==6)||(id==12)||(id==16)))
				    		{
				    			/*list.add("Extras");
				    			list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar5_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar5_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==6)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==7)&&((id==1)||(id==6)||(id==10)||(id==18)))
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");
				    			list.add("Pakhavaj");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar1_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar1_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if((t==7)&&((id==2)||(id==5)||(id==9)||(id==15)))
				    		{
				    			//list.add("Pakhavaj");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar6_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar6_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==7)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==8)&&((id==1)||(id==6)||(id==10)||(id==18)))
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");
				    			list.add("Pakhavaj");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar1_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar1_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if((t==8)&&((id==2)||(id==5)||(id==9)||(id==15)))
				    		{
				    			//list.add("Pakhavaj");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar6_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar6_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if((t==8)&&((id==13)||(id==16)))
				    		{
				    			//list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar3_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar3_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		else if(t==8)
				    		{
				    			/*list.add("Tabla Low Pitch- Kharj Swar (खर्ज स्वर )");
				    			list.add("Tabla High Pitch-तार_स्वर");*/
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar2_arrays)));
				    			//dataAdapter=ArrayAdapter.createFromResource(getApplicationContext(), R.array.swaar2_arrays,android.R.layout.simple_spinner_dropdown_item);
				    		}
				    		if((t==9)||(t==4)||(t==10)){
				    			swaar = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.swaar_empty_arrays)));
				    			k=0;
				    		}
				    		
				    		
				    		dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, swaar);
				    		//dataAdapter = new ArrayAdapter<String>(spinner.getContext(),android.R.layout.simple_spinner_item, list);
							dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							    spinner3.setAdapter(dataAdapter);
							    spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(AdapterView<?> spinner, View view,
											int pos, long arg3) {
										// TODO Auto-generated method stub
										/*Toast.makeText(spinner.getContext(), 
						            			"OnItemSelectedListener : " + spinner.getItemAtPosition(pos).toString(),
						            			Toast.LENGTH_SHORT).show();*/
										str1= spinner.getItemAtPosition(pos).toString();
										List<String> laya = null;
										ArrayAdapter<String> dataAdapter;
							    		//Toast.makeText(spinner.getContext(), str1, Toast.LENGTH_SHORT).show();
							    		list = new ArrayList<String>();
							    		long id=spinner.getItemIdAtPosition(pos);
										if(((t==1)||(t==2))&&((k==1)||(k==2)||(k==12)||(k==18)||(k==23))&&((id==0)||(id==1)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										if((t==3)&&((k==1)||(k==4)||(k==5)||(k==8)||(k==13))&&((id==0)||(id==1)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										if((t==4)&&((k==1)||(k==2)||(k==12)||(k==18)||(k==23)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										if((t==5)&&((k==1)||(k==2)||(k==12)||(k==18)||(k==20))&&((id==0)||(id==1)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										if((t==6)&&((k==1)||(k==2)||(k==12)||(k==18)||(k==23))&&((id==0)||(id==1)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										if(((t==7)||(t==8))&&((k==1)||(k==4)||(k==12)||(k==15)||(k==20))&&((id==0)||(id==1)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										/*if((t==9)&&((k==1)||(k==2)||(k==12)||(k==15)||(k==20)))
										{
											/*list.add("Drut Laya");
											list.add("Madhya Laya");
											list.add("Vilambit Laya");*/
											//laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										//}
										if((t==10)||(t==9))
										{
											laya = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.laya_arrays)));
										}
										//ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(spinner.getContext(),android.R.layout.simple_spinner_item, list);
										m=(int)(id+1);
										dataAdapter = new ArrayAdapter<String>(spinner.getContext(), R.layout.spinner_item, laya);
										dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
										    spinner4.setAdapter(dataAdapter);
										    spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {
												@Override
												public void onItemSelected(AdapterView<?> spinner,
														View view,
														int pos, long arg3) {
													// TODO Auto-generated method stub
													long id=spinner.getItemIdAtPosition(pos);
													n=(int)(id+1);
													sb.delete(0, 4);
													sb.append(t);
													sb.append(k);
													sb.append(m);
													sb.append(n);
													str=sb.toString();
													//Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
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

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

						
					});;
}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	
});
}
public void onNext(View v)
{
    String g="back1";
	/*Home.tablaspec = Home.tabHost.newTabSpec("TablaSongs");
    Home.tablaspec.setIndicator("TablaSongs", getResources().getDrawable(R.drawable.ic_launcher));
    Intent tablaIntent = new Intent(this, TablaSongs.class);
    Home.tablaspec.setContent(tablaIntent);*/
    str=sb.toString();
    i=new Intent(getApplicationContext(), Home.class);
    i.putExtra("back", g);
    i.putExtra("song", str);
    this.startActivity(i);
    
    /*Home.tanpuraspec = Home.tabHost.newTabSpec("TanpuraSongs");
    // setting Title and Icon for the Tab
    Home.tanpuraspec.setIndicator("TanpuraSongs", getResources().getDrawable(R.drawable.ic_launcher));
    Intent songsIntent = new Intent(this, TanpuraSongs.class);
    Home.tanpuraspec.setContent(songsIntent);*/

    //Home.tabHost.addTab(Home.tablaspec); // Adding photos tab
    //Home.tabHost.addTab(Home.tanpuraspec); // Adding songs tab
	//i=new Intent(Tabla.this, TablaSongs.class);
	//this.startActivity(i);
}
}
