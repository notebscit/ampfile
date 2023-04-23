package com.example.menucontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MenuInflater mi;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menus) {

        mi = getMenuInflater();
        mi.inflate(R.menu.mymenu,menus);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this,"Option Setting is selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Search:
                Toast.makeText(this,"Option Search is selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Feedback: Toast.makeText(this,"Option Feedback is selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.CEmail:
                Toast.makeText(this,"Option Compose Mail is selected",Toast.LENGTH_SHORT).show(); return true;
            default: Toast.makeText(this,"Default", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item); } } }
