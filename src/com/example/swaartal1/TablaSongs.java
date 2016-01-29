package com.example.swaartal1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class TablaSongs extends Activity {
	Intent oldintent,i;
	static String g=Home.s;
	static int i2=0;
	static int but;
	Button btn1,btn2,btn3,btn4;
	private SeekBar volumeSeekbar=null;
	private AudioManager audioManager = null; 
	static int progressChanged = 20;
	MediaPlayer csh_ada_low_drut_1,csh_ada_low_drut_2,csh_ada_low_madhya,csh_ada_low_vilambit_1,csh_ada_low_vilambit_2,csh_ada_high_drut_1,csh_ada_high_drut_2,csh_ada_high_drut_3,csh_ada_high_drut_4,csh_ada_high_madhya_1,csh_ada_high_madhya_2,csh_ada_high_madhya_3,csh_ada_high_madhya_4,csh_ada_high_vilambit_1,csh_ada_high_vilambit_2,csh_ada_high_vilambit_3,csh_ada_high_vilambit_4;
@SuppressLint("NewApi")
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tablasongs);
	csh_ada_low_drut_1=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_low_drut_1);
    csh_ada_low_drut_2=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_low_drut_2);
    csh_ada_low_madhya=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_low_madhya);
    csh_ada_low_vilambit_1=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_low_vilambit_1);
    csh_ada_low_vilambit_2=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_low_vilambit_2);
    csh_ada_high_drut_1=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_drut_1);
    csh_ada_high_drut_2=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_drut_2);
    csh_ada_high_drut_3=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_drut_3);
    csh_ada_high_drut_4=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_drut_4);
    csh_ada_high_madhya_1=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_madhya_1);
    csh_ada_high_madhya_2=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_madhya_2);
    csh_ada_high_madhya_3=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_madhya_3);
    csh_ada_high_madhya_4=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_madhya_4);
    csh_ada_high_vilambit_1=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_vilambit_1);
    csh_ada_high_vilambit_2=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_vilambit_2);
    csh_ada_high_vilambit_3=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_vilambit_3);
    csh_ada_high_vilambit_4=MediaPlayer.create(getApplicationContext(), R.raw.csh_ada_high_vilambit_4);
	//setVolumeControlStream(AudioManager.STREAM_MUSIC);
	volumeSeekbar = (SeekBar) findViewById(R.id.seekBar1);
	audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    volumeSeekbar.setMax(audioManager
            .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
    volumeSeekbar.setProgress(audioManager
            .getStreamVolume(AudioManager.STREAM_MUSIC));  
	volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
		//int progressChanged = 0;

		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
			progressChanged = progress;
			/*audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                    progress, AudioManager.FLAG_PLAY_SOUND);*/
			csh_ada_low_drut_1.setVolume(progressChanged, progressChanged);
			csh_ada_low_drut_2.setVolume(progressChanged, progressChanged);
			csh_ada_low_madhya.setVolume(progressChanged, progressChanged);
			csh_ada_low_vilambit_1.setVolume(progressChanged, progressChanged);
			csh_ada_low_vilambit_2.setVolume(progressChanged, progressChanged);
			csh_ada_high_drut_1.setVolume(progressChanged, progressChanged);
			csh_ada_high_drut_2.setVolume(progressChanged, progressChanged);
			csh_ada_high_drut_3.setVolume(progressChanged, progressChanged);
			csh_ada_high_drut_4.setVolume(progressChanged, progressChanged);
			csh_ada_high_madhya_1.setVolume(progressChanged, progressChanged);
			csh_ada_high_madhya_2.setVolume(progressChanged, progressChanged);
			csh_ada_high_madhya_3.setVolume(progressChanged, progressChanged);
			csh_ada_high_madhya_4.setVolume(progressChanged, progressChanged);
			csh_ada_high_vilambit_1.setVolume(progressChanged, progressChanged);
			csh_ada_high_vilambit_2.setVolume(progressChanged, progressChanged);
			csh_ada_high_vilambit_3.setVolume(progressChanged, progressChanged);
			csh_ada_high_vilambit_4.setVolume(progressChanged, progressChanged);
		}

		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
		}

		public void onStopTrackingTouch(SeekBar seekBar) {
			Toast.makeText(getApplicationContext(),"seek bar progress:"+progressChanged, 
					Toast.LENGTH_SHORT).show();
		}
	});
	btn1=(Button) findViewById(R.id.button1);
	btn2=(Button) findViewById(R.id.button2);
	btn3=(Button) findViewById(R.id.button3);
	btn4=(Button) findViewById(R.id.button4);
	//oldintent=this.getIntent();
	//Toast.makeText(getApplicationContext(), "g="+g, Toast.LENGTH_SHORT).show();
	if((g.equals("1111")||(g.equals("1113")))){
		but=2;
		btn2.setVisibility(1);
		btn2.setClickable(true);
		}
	if(g.equals("1112"))
	{
		//Toast.makeText(getApplicationContext(), "I am here", Toast.LENGTH_SHORT).show();
		//btn2.setVisibility(0);
		//btn2.setClickable(false);
	}
	if((g.equals("1121"))||(g.equals("1122"))||(g.equals("1123"))||(g.equals("1124")))
	{
	    btn2.setVisibility(1);
	    btn3.setVisibility(1);
	    btn4.setVisibility(1);
	    btn2.setClickable(true);
	    btn3.setClickable(true);
	    btn4.setClickable(true);
	}
	/*Button myButton = new Button(this);
    myButton.setText("  2  ");

    RelativeLayout ll = (RelativeLayout)findViewById(R.id.tablasongs);
    LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    ll.addView(myButton, lp);
    myButton.setClickable(true);*/
}
public void onBack(View v)
{
	String g1="bac1";
	i=new Intent(TablaSongs.this, Home.class);
	i.putExtra("back", g1);
	this.startActivity(i);
}
public void on1(View v)
{
	//Toast.makeText(getApplicationContext(), progressChanged, Toast.LENGTH_SHORT).show();
	String s=null;
	//float progressChanged=(float) progressChanged;
	if(g.equals("1111"))
	{
		csh_ada_low_drut_1.setLooping(true);
	csh_ada_low_drut_1.start();
	}
	i2=0;
	if(g.equals("1112")){
		csh_ada_low_madhya.setLooping(true);
		csh_ada_low_madhya.start();
		}
	if(g.equals("1113")){
		csh_ada_low_vilambit_1.setLooping(true);
		csh_ada_low_vilambit_1.start();
		}
	if(g.equals("1121")){
		csh_ada_high_drut_1.setLooping(true);
		csh_ada_high_drut_1.start();
		}
	if(g.equals("1122")){
		csh_ada_high_madhya_1.setLooping(true);
	csh_ada_high_madhya_1.start();
	}
	if(g.equals("1123")){
		csh_ada_high_vilambit_1.setLooping(true);
		csh_ada_high_vilambit_1.start();
		}
	Toast.makeText(getApplicationContext(), "Song1 started", Toast.LENGTH_SHORT).show();
	//Toast.makeText(getApplicationContext(), "s="+s, Toast.LENGTH_SHORT).show();
	
	//g="csh_ada_low_drut_1";
	/*Intent serviceintent= new Intent(TablaSongs.this,TablaService.class);
	serviceintent.putExtra("key1",s);
	this.startService(serviceintent);*/
}
public void on2(View v)
{
	//btn2.setClickable(false);
	if(g.equals("1111")){
		csh_ada_low_drut_2.setLooping(true);
		csh_ada_low_drut_2.start();
		}
	if(g.equals("1113")){
		csh_ada_low_vilambit_2.setLooping(true);
		csh_ada_low_vilambit_2.start();
		}
	if(g.equals("1121")){
		csh_ada_high_drut_2.setLooping(true);
		csh_ada_high_drut_2.start();
		}
	if(g.equals("1122")){
		csh_ada_high_madhya_2.setLooping(true);
	csh_ada_high_madhya_2.start();
	}
	if(g.equals("1123")){
		csh_ada_high_vilambit_2.setLooping(true);
		csh_ada_high_vilambit_2.start();
		}
	Toast.makeText(getApplicationContext(), "Song2 started", Toast.LENGTH_SHORT).show();
	//Toast.makeText(getApplicationContext(), "s="+s, Toast.LENGTH_SHORT).show();
	
	//g="csh_ada_low_drut_1";
	/*Intent serviceintent= new Intent(TablaSongs.this,TablaService.class);
	//serviceintent.putExtra("key1",s);
	this.startService(serviceintent);*/
}
public void on3(View v)
{
	//btn3.setClickable(false);
	String s=null;
	//btn3.setPressed(true);
	if(g.equals("1121")){
		csh_ada_high_drut_3.setLooping(true);
	csh_ada_high_drut_3.start();
	}
	if(g.equals("1122")){
		csh_ada_high_madhya_3.setLooping(true);
	csh_ada_high_madhya_3.start();
	}
	if(g.equals("1123")){
		csh_ada_high_vilambit_3.setLooping(true);
	csh_ada_high_vilambit_3.start();
	}
	Toast.makeText(getApplicationContext(), "Song3 started", Toast.LENGTH_SHORT).show();
	//Toast.makeText(getApplicationContext(), "s="+s, Toast.LENGTH_SHORT).show();
	
	//g="csh_ada_low_drut_1";
	/*Intent serviceintent= new Intent(TablaSongs.this,TablaService.class);
	serviceintent.putExtra("key1",s);
	this.startService(serviceintent);*/
}
public void on4(View v)
{
	//btn4.setClickable(false);
	String s=null;
	//btn3.setPressed(true);
	if(g.equals("1121")){
		csh_ada_high_drut_4.setLooping(true);
	csh_ada_high_drut_4.start();
	}
	if(g.equals("1122")){
		csh_ada_high_madhya_4.setLooping(true);
		csh_ada_high_madhya_4.start();
		}
	if(g.equals("1123")){
		csh_ada_high_vilambit_4.setLooping(true);
	csh_ada_high_vilambit_4.start();
	}
	Toast.makeText(getApplicationContext(), "Song4 started", Toast.LENGTH_SHORT).show();
	//Toast.makeText(getApplicationContext(), "s="+s, Toast.LENGTH_SHORT).show();
	
	//g="csh_ada_low_drut_1";
	/*Intent serviceintent= new Intent(TablaSongs.this,TablaService.class);
	serviceintent.putExtra("key1",s);
	this.startService(serviceintent);*/
}
public void Stop(View v)
{
		if(g.equals("1111")){
			if(csh_ada_low_drut_1.isPlaying())
		csh_ada_low_drut_1.pause();
			if(csh_ada_low_drut_2.isPlaying())
				csh_ada_low_drut_2.pause();
		}
		if(g.equals("1112")){
			if(csh_ada_low_madhya.isPlaying())
			csh_ada_low_madhya.pause();}
		if(g.equals("1113")){
			if(csh_ada_low_vilambit_1.isPlaying())
			csh_ada_low_vilambit_1.pause();
			if(csh_ada_low_vilambit_2.isPlaying())
				csh_ada_low_vilambit_2.pause();}
		if(g.equals("1121"))
		{   if(csh_ada_high_drut_1.isPlaying())
			csh_ada_high_drut_1.pause();
		if(csh_ada_high_drut_2.isPlaying())
			csh_ada_high_drut_2.pause();
		if(csh_ada_high_drut_3.isPlaying())
			csh_ada_high_drut_3.pause();
		if(csh_ada_high_drut_4.isPlaying())
			csh_ada_high_drut_4.pause();}
		if(g.equals("1122")){
			if(csh_ada_high_madhya_1.isPlaying())
			csh_ada_high_madhya_1.pause();
			if(csh_ada_high_madhya_2.isPlaying())
				csh_ada_high_madhya_2.pause();
			if(csh_ada_high_madhya_3.isPlaying())
				csh_ada_high_madhya_3.pause();
			if(csh_ada_high_madhya_4.isPlaying())
				csh_ada_high_madhya_4.pause();
		if(g.equals("1123")){
			if(csh_ada_high_vilambit_1.isPlaying())
			csh_ada_high_vilambit_1.pause();
			if(csh_ada_high_vilambit_2.isPlaying())
				csh_ada_high_vilambit_2.pause();
			if(csh_ada_high_vilambit_3.isPlaying())
				csh_ada_high_vilambit_3.pause();
			if(csh_ada_high_vilambit_4.isPlaying())
				csh_ada_high_vilambit_4.pause();
			}
	/*Intent serviceintent= new Intent(TablaSongs.this,TablaService.class);
	//serviceintent.putExtra("key1",g);
	this.stopService(serviceintent);*/
		}
}
}
