package com.example.telephone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
Button dialPhNumber = (Button) findViewById(R.id.dialPhNumber); dialPhNumber.setOnClickListener(new View.OnClickListener() { public void onClick(View view)
    { Toast.makeText(getApplicationContext(),"Mobile is Calling",Toast.LENGTH_SHORT).show(); try { EditText phNumber = (EditText) findViewById(R.id.phNumber);
        Intent implicit1 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phNumber.getText().toString())); startActivity(implicit1); Toast.makeText(getApplicationContext(),"Mobile is Calling",Toast.LENGTH_SHORT).show(); } catch (SecurityException e) {} } }); } }