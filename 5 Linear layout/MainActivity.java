package com.example.activitytoactivitycom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3;
Button b1,b2,b3,b4;
RadioButton r1,r2;
CheckBox c1,c2;
ToggleButton t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r2=(RadioButton) findViewById(R.id.radioButton2);
        c1=(CheckBox) findViewById(R.id.checkBox);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        t1=(ToggleButton) findViewById(R.id.toggleButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "this is add button", Toast.LENGTH_LONG).show();
            }
        });
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(getApplicationContext(), "male selected", Toast.LENGTH_LONG).show();
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(getApplicationContext(), "Female selected", Toast.LENGTH_LONG).show();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "this is music checkbox", Toast.LENGTH_LONG).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "this is sports checkbox", Toast.LENGTH_LONG).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,a;
                n1=Integer.parseInt(e1.getText().toString());
                n2=Integer.parseInt(e2.getText().toString());
                a=n1+n2;
             e3.setText("sum="+a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,a;
                n1=Integer.parseInt(e1.getText().toString());
                n2=Integer.parseInt(e2.getText().toString());
                a=n1-n2;
                e3.setText("SUB="+a);
            }
        });
    }
}