package com.example.swaartal1;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class TablaService extends Service {
	MediaPlayer csh_ada_low_drut_1,csh_ada_low_drut_2,csh_ada_low_madhya,csh_ada_low_vilambit_1,csh_ada_low_vilambit_2,csh_ada_high_drut_1,csh_ada_high_drut_2,csh_ada_high_drut_3,csh_ada_high_drut_4,csh_ada_high_madhya_1,csh_ada_high_madhya_2,csh_ada_high_madhya_3,csh_ada_high_madhya_4,csh_ada_high_vilambit_1,csh_ada_high_vilambit_2,csh_ada_high_vilambit_3,csh_ada_high_vilambit_4;
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
        //csh_ada_low_drut_1.setAudioStreamType(AudioManager.STREAM_MUSIC);
}
@Override
public int onStartCommand(Intent serviceintent, int flags, int startId) {
	// TODO Auto-generated method stub
	h=serviceintent.getStringExtra("key1");
	//Toast.makeText(getApplicationContext(), "h="+h, Toast.LENGTH_SHORT).show();
	if(h.equals("csh_ada_low_drut_1"))
	{
		csh_ada_low_drut_1.setLooping(true);
		csh_ada_low_drut_1.start();
		t=1;
	}
	if(h.equals("csh_ada_low_drut_2"))
	{
		csh_ada_low_drut_2.setLooping(true);
		csh_ada_low_drut_2.start();
		t=1;
	}
	if(h.equals("csh_ada_low_madhya"))
	{
		csh_ada_low_madhya.setLooping(true);
		csh_ada_low_madhya.start();
	}
	if(h.equals("csh_ada_low_vilambit1"))
	{
		csh_ada_low_vilambit_1.setLooping(true);
		csh_ada_low_vilambit_1.start();
	}
	if(h.equals("csh_ada_low_vilambit2"))
	{
		csh_ada_low_vilambit_2.setLooping(true);
		csh_ada_low_vilambit_2.start();
	}
	if(h.equals("csh_ada_high_drut_1"))
	{
		csh_ada_high_drut_1.setLooping(true);
		csh_ada_high_drut_1.start();
		t=1;
	}
	if(h.equals("csh_ada_high_drut_2"))
	{
		csh_ada_high_drut_2.setLooping(true);
		csh_ada_high_drut_2.start();
		t=1;
	}
	if(h.equals("csh_ada_high_drut_3"))
	{
		csh_ada_high_drut_3.setLooping(true);
		csh_ada_high_drut_3.start();
		t=1;
	}
	if(h.equals("csh_ada_high_drut_4"))
	{
		csh_ada_high_drut_4.setLooping(true);
		csh_ada_high_drut_4.start();
		t=1;
	}
	if(h.equals("csh_ada_high_madhya_1"))
	{
		csh_ada_high_madhya_1.setLooping(true);
		csh_ada_high_madhya_1.start();
	}
	if(h.equals("csh_ada_high_madhya_2"))
	{
		csh_ada_high_madhya_2.setLooping(true);
		csh_ada_high_madhya_2.start();
	}
	if(h.equals("csh_ada_high_madhya_3"))
	{
		csh_ada_high_madhya_3.setLooping(true);
		csh_ada_high_madhya_3.start();
	}
	if(h.equals("csh_ada_high_madhya_4"))
	{
		csh_ada_high_madhya_4.setLooping(true);
		csh_ada_high_madhya_4.start();
	}
	if(h.equals("csh_ada_high_vilambit_1"))
	{
		csh_ada_high_vilambit_1.setLooping(true);
		csh_ada_high_vilambit_1.start();
	}
	if(h.equals("csh_ada_high_vilambit_2"))
	{
		csh_ada_high_vilambit_2.setLooping(true);
		csh_ada_high_vilambit_2.start();
	}
	if(h.equals("csh_ada_high_vilambit_3"))
	{
		csh_ada_high_vilambit_3.setLooping(true);
		csh_ada_high_vilambit_3.start();
	}
	if(h.equals("csh_ada_high_vilambit_4"))
	{
		csh_ada_high_vilambit_4.setLooping(true);
		csh_ada_high_vilambit_4.start();
	}
	return START_NOT_STICKY;
}
@Override
public void onDestroy() {
	// TODO Auto-generated method stub
	if(h.equals("csh_ada_low_drut_1"))
	{
	csh_ada_low_drut_1.stop();
	csh_ada_low_drut_1.release();
	//Toast.makeText(getApplicationContext(), "csh1 stopped", Toast.LENGTH_SHORT).show();
	}
	if(h.equals("csh_ada_low_drut_2"))
	{
	csh_ada_low_drut_2.stop();
	csh_ada_low_drut_2.release();
	//Toast.makeText(getApplicationContext(), "csh2 stopped", Toast.LENGTH_SHORT).show();
	}
	if(h.equals("csh_ada_low_madhya"))
	{
		csh_ada_low_madhya.stop();
		csh_ada_low_madhya.release();
	}
	if(h.equals("csh_ada_low_vilambit_1"))
	{
		csh_ada_low_vilambit_1.stop();
		csh_ada_low_vilambit_1.release();
	}
	if(h.equals("csh_ada_low_vilambit_2"))
	{
		csh_ada_low_vilambit_2.stop();
		csh_ada_low_vilambit_2.release();
	}
	if(h.equals("csh_ada_high_drut_1"))
	{
		csh_ada_high_drut_1.stop();
		csh_ada_high_drut_1.release();
	}
	if(h.equals("csh_ada_high_drut_2"))
	{
		csh_ada_high_drut_2.stop();
		csh_ada_high_drut_2.release();
	}
	if(h.equals("csh_ada_high_drut_3"))
	{
		csh_ada_high_drut_3.stop();
		csh_ada_high_drut_3.release();
	}
	if(h.equals("csh_ada_high_drut_4"))
	{
		csh_ada_high_drut_4.stop();
		csh_ada_high_drut_4.release();
	}
	if(h.equals("csh_ada_high_madhya_1"))
	{
		csh_ada_high_madhya_1.stop();
		csh_ada_high_madhya_1.release();
	}
	if(h.equals("csh_ada_high_madhya_2"))
	{
		csh_ada_high_madhya_2.stop();
		csh_ada_high_madhya_2.release();
	}
	if(h.equals("csh_ada_high_madhya_3"))
	{
		csh_ada_high_madhya_3.stop();
		csh_ada_high_madhya_3.release();
	}
	if(h.equals("csh_ada_high_madhya_4"))
	{
		csh_ada_high_madhya_4.stop();
		csh_ada_high_madhya_4.release();
	}
	if(h.equals("csh_ada_high_vilambit_1"))
	{
		csh_ada_high_vilambit_1.stop();
		csh_ada_high_vilambit_1.release();
	}
	if(h.equals("csh_ada_high_vilambit_2"))
	{
		csh_ada_high_vilambit_2.stop();
		csh_ada_high_vilambit_2.release();
	}
	if(h.equals("csh_ada_high_vilambit_3"))
	{
		csh_ada_high_vilambit_3.stop();
		csh_ada_high_vilambit_3.release();
	}
	if(h.equals("csh_ada_high_vilambit_4"))
	{
		csh_ada_high_vilambit_4.stop();
		csh_ada_high_vilambit_4.release();
	}
	super.onDestroy();
}

}
