package com.example.media;

import androidx.appcompat.app.AppCompatActivity; import android.content.Intent; import android.os.Bundle; import android.view.View;
public class MainActivity extends AppCompatActivity { @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); }
public void onStartMusic(View v) { startService(new Intent(this,MyService.class)); }
public void onStopMusic(View v) { stopService(new Intent(this,MyService.class)); } }