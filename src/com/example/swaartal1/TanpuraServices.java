package com.example.swaartal1;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class TanpuraServices extends Service {
	MediaPlayer sing_csh_panch_slow,sing_csh_panch_med,sing_csh_panch_fast,sing_csh_madhya_slow,sing_csh_madhya_med,sing_csh_madhya_fast,sing_csh_nishad_slow,sing_csh_nishad_med,sing_csh_nishad_fast;
	static String h;
	static int t=0;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
    public void onCreate() {
    	// TODO Auto-generated method stub
    	super.onCreate();
    	sing_csh_panch_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_panch_slow);
    	sing_csh_panch_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_pancha_med);
    	sing_csh_panch_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_panch_fast);
    	sing_csh_madhya_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_slow);
    	sing_csh_madhya_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_med);
    	sing_csh_madhya_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_madhya_fast);
    	sing_csh_nishad_slow=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_slow);
    	sing_csh_nishad_med=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_med);
    	sing_csh_nishad_fast=MediaPlayer.create(getApplicationContext(), R.raw.sing_csh_nishad_fast);
    	
}
	@Override
	public int onStartCommand(Intent serviceintent, int flags, int startId) {
		// TODO Auto-generated method stub
		h=serviceintent.getStringExtra("key1");
		//Toast.makeText(getApplicationContext(), "h="+h, Toast.LENGTH_SHORT).show();
		if(h.equals("sing_csh_panch_slow"))
		{
			sing_csh_panch_slow.setLooping(true);
			sing_csh_panch_slow.start();
			t=1;
		}
		if(h.equals("sing_csh_panch_med"))
		{
			sing_csh_panch_med.setLooping(true);
			sing_csh_panch_med.start();
		}
		if(h.equals("sing_csh_panch_fast"))
		{
			sing_csh_panch_fast.setLooping(true);
			sing_csh_panch_fast.start();
		}
		if(h.equals("sing_csh_madhya_slow"))
		{
			sing_csh_madhya_slow.setLooping(true);
			sing_csh_madhya_slow.start();
			}
		if(h.equals("sing_csh_madhya_med"))
		{
			sing_csh_madhya_med.setLooping(true);
			sing_csh_madhya_med.start();
		}
		if(h.equals("sing_csh_madhya_fast"))
		{
			sing_csh_madhya_fast.setLooping(true);
			sing_csh_madhya_fast.start();
		}
		if(h.equals("sing_csh_nishad_slow"))
		{
			sing_csh_nishad_slow.setLooping(true);
			sing_csh_nishad_slow.start();
		}
		if(h.equals("sing_csh_nishad_med"))
		{
			sing_csh_nishad_med.setLooping(true);
			sing_csh_nishad_med.start();
		}
		if(h.equals("sing_csh_nishad_fast"))
		{
			sing_csh_nishad_fast.setLooping(true);
			sing_csh_nishad_fast.start();
		}
		return START_NOT_STICKY;
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "h="+h, Toast.LENGTH_SHORT).show();
		if(h.equals("sing_csh_panch_slow"))
    	{
			sing_csh_panch_slow.stop();
			sing_csh_panch_slow.release();
    	//Toast.makeText(getApplicationContext(), "sing_csh_panch_slow stopped", Toast.LENGTH_SHORT).show();
    	}
		if(h.equals("sing_csh_panch_med"))
		{
			sing_csh_panch_med.stop();
			sing_csh_panch_med.release();
		}
		if(h.equals("sing_csh_panch_fast"))
		{
			sing_csh_panch_fast.stop();
			sing_csh_panch_fast.release();
		}
		if(h.equals("sing_csh_madhya_slow"))
		{
			sing_csh_madhya_slow.stop();
			sing_csh_madhya_slow.release();
		}
		if(h.equals("sing_csh_madhya_med"))
		{
			sing_csh_madhya_med.stop();
			sing_csh_madhya_med.release();
		}
		if(h.equals("sing_csh_madhya_fast"))
		{
			sing_csh_madhya_fast.stop();
			sing_csh_madhya_fast.release();
		}
		if(h.equals("sing_csh_nishad_slow"))
		{
			sing_csh_nishad_slow.stop();
			sing_csh_nishad_slow.release();
		}
		if(h.equals("sing_csh_nishad_med"))
		{
			sing_csh_nishad_med.stop();
			sing_csh_nishad_med.release();
		}
		if(h.equals("sing_csh_nishad_fast"))
		{
			sing_csh_nishad_fast.stop();
			sing_csh_nishad_fast.release();
		}
		super.onDestroy();
		
	}

}
