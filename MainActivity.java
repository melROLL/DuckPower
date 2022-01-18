package com.example.duckpower;

import android.graphics.Color;
//import android.support.v7.app.AppCompatActivity; // ça marche pas
import androidx.appcompat.app.AppCompatActivity; // ça marche
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mbutton;
        Button mbutton2;
        Button mbutton3;
        Button mbutton4;
        Button mbutton5;
        final EditText mET;
        final TextView mTV;

        mbutton=  findViewById(R.id.button); // donkey
        mbutton2=  findViewById(R.id.button2); // horse
        mbutton3= findViewById(R.id.button3); // squirel
        mbutton4=  findViewById(R.id.button4); // duck
        mbutton5=  findViewById(R.id.button5); // elephant
        mET=(EditText) findViewById(R.id.editText);
        mTV=(TextView) findViewById(R.id.textView);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/250));               //c'est ici que l'on met la formulle
            }
        });
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/735.499));               //c'est ici que l'on met la formulle
            }
        });
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/0.5511));               //c'est ici que l'on met la formulle
            }
        });
        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/17.5));               //c'est ici que l'on met la formulle
            }
        });
        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/60164));               //c'est ici que l'on met la formulle
            }
        });
    }
}
// 1 cheval = 735,499 wat = 42.016806722689076 canard = 1334.677 ecureiles = entre 50 et 125 chat
// 1 ane = 250 wat
// 1 elephant = 81.8 cheval