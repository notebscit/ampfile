package com.example.media;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import com.example.media.R;

public class MyService extends Service { MediaPlayer myPlayer;
@Override
public IBinder onBind(Intent intent)
{
    return null;
}

    @Override public void onCreate()
    {
        Toast.makeText(this, "Music Service Launched", Toast.LENGTH_LONG).show();
        myPlayer = MediaPlayer.create(this,R.raw.music);
        myPlayer.setLooping(false); // Set looping

    }

    @Override public void onStart(Intent intent, int startid)
    {
        Toast.makeText(this, "Music Service Started", Toast.LENGTH_LONG).show(); myPlayer.start();
    }

    @Override public void onDestroy() {
    Toast.makeText(this, "Music Service Stopped", Toast.LENGTH_LONG).show();
    myPlayer.stop();
}










}