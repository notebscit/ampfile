package com.example.fragment_pract_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements fragment1.onMessageSendListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.fragmentcontainer)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            fragment1 f1=new fragment1();
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentcontainer,f1,null).commit();
        }
    }

    @Override
    public void onMessageSend(String msg) {
        fragment2 f2=new fragment2();
        Bundle b=new Bundle();
        b.putString("Message",msg);
        f2.setArguments(b);
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,f2);
        ft.addToBackStack(null);
        ft.commit();
    }
}