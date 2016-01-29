package com.example.swaartal1;

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

public class TanpuraSongs extends Activity {
	Button play,back;
	String g=Home.s;
	static int i2=0;
	Intent oldintent,i;
	private SeekBar volumeSeekbar=null;
	private AudioManager audioManager = null; 
	static int progressChanged = 0;
	MediaPlayer sing_csh_panch_slow,sing_csh_panch_med,sing_csh_panch_fast,sing_csh_madhya_slow,sing_csh_madhya_med,sing_csh_madhya_fast,sing_csh_nishad_slow,sing_csh_nishad_med,sing_csh_nishad_fast;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tanpurasongs);
	sing_csh_panch_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_panch_slow);
	sing_csh_panch_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_pancha_med);
	sing_csh_panch_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_panch_fast);
	sing_csh_madhya_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_slow);
	sing_csh_madhya_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_med);
	sing_csh_madhya_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_fast);
	sing_csh_nishad_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_slow);
	sing_csh_nishad_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_med);
	sing_csh_nishad_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_fast);
	//setVolumeControlStream(AudioManager.STREAM_MUSIC);
	//oldintent=this.getIntent();
	volumeSeekbar = (SeekBar) findViewById(R.id.seekBar1);
	audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    volumeSeekbar.setMax(audioManager
            .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
    volumeSeekbar.setProgress(audioManager
            .getStreamVolume(AudioManager.STREAM_MUSIC)); 
	volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
		int progressChanged = 20;

		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
			progressChanged = progress;
			/*audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                    progress, AudioManager.FLAG_PLAY_SOUND);*/
			sing_csh_panch_slow.setVolume(progressChanged, progressChanged);
			sing_csh_panch_med.setVolume(progressChanged, progressChanged);
			sing_csh_panch_fast.setVolume(progressChanged, progressChanged);
			sing_csh_madhya_slow.setVolume(progressChanged, progressChanged);
			sing_csh_madhya_med.setVolume(progressChanged, progressChanged);
			sing_csh_madhya_fast.setVolume(progressChanged, progressChanged);
			sing_csh_nishad_slow.setVolume(progressChanged, progressChanged);
			sing_csh_nishad_med.setVolume(progressChanged, progressChanged);
			sing_csh_nishad_fast.setVolume(progressChanged, progressChanged);
		}

		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
		}

		public void onStopTrackingTouch(SeekBar seekBar) {
			Toast.makeText(getApplicationContext(),"seek bar progress:"+progressChanged, 
					Toast.LENGTH_SHORT).show();
		}
	});
	play=(Button) findViewById(R.id.button1);
	back=(Button) findViewById(R.id.button2);
}
public void onPlay(View v)
{
	//String s=null;
	if(g.equals("1111"))
	{
		sing_csh_panch_slow.setLooping(true);
		sing_csh_panch_slow.start();
	}
	if(g.equals("1112"))
	{
		sing_csh_panch_med.setLooping(true);
		sing_csh_panch_med.start();
	}
	if(g.equals("1113"))
	{
		sing_csh_panch_fast.setLooping(true);
		sing_csh_panch_fast.start();
	}
	if(g.equals("1121"))
	{
		sing_csh_madhya_slow.setLooping(true);
		sing_csh_madhya_slow.start();
	}
	if(g.equals("1122"))
	{
		sing_csh_madhya_med.setLooping(true);
		sing_csh_madhya_med.start();
	}
	if(g.equals("1123"))
	{
		sing_csh_madhya_fast.setLooping(true);
		sing_csh_madhya_fast.start();
	}
	if(g.equals("1131"))
	{
		sing_csh_nishad_slow.setLooping(true);
		sing_csh_nishad_slow.start();
	}
	if(g.equals("1132"))
	{
		sing_csh_nishad_med.setLooping(true);
		sing_csh_nishad_med.start();
	}
	if(g.equals("1133"))
	{
		sing_csh_nishad_fast.setLooping(true);
		sing_csh_nishad_fast.start();
	}
	/*Intent serviceintent= new Intent(TanpuraSongs.this,TanpuraServices.class);
	serviceintent.putExtra("key1",s);
	this.startService(serviceintent);*/
}
public void onBack(View v)
{
	String g1="bac2";
	i=new Intent(getApplicationContext(), Home.class);
	i.putExtra("back", g1);
	this.startActivity(i);
}
public void Stop(View v)
{
	if(g.equals("1111"))
		sing_csh_panch_slow.pause();
	if(g.equals("1112"))
		sing_csh_panch_med.pause();
	if(g.equals("1113"))
		sing_csh_panch_fast.pause();
	if(g.equals("1121"))
		sing_csh_madhya_slow.pause();
	if(g.equals("1122"))
		sing_csh_madhya_med.pause();
	if(g.equals("1123"))
		sing_csh_madhya_fast.pause();
	if(g.equals("1131"))
		sing_csh_nishad_slow.pause();
	if(g.equals("1132"))
		sing_csh_nishad_med.pause();
	if(g.equals("1133"))
		sing_csh_nishad_fast.pause();
	/*i2=1;
	Intent serviceintent= new Intent(TanpuraSongs.this,TanpuraServices.class);
	//serviceintent.putExtra("key1",g);
	this.stopService(serviceintent);*/
}
}
