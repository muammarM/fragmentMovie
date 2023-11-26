package com.example.lauchersplash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    CardView hello;
    CardView count;
    CardView Sianida;
    CardView twoactivity;
    CardView setalarm;
    CardView maps;
    Uri geoLocation;
    CardView Shopping;
    CardView btn_fragment;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hello = (CardView)findViewById(R.id.to_hello);
        count = (CardView)findViewById(R.id.to_count);
        Sianida = (CardView)findViewById(R.id.to_sianida);
        twoactivity = (CardView)findViewById(R.id.to_twoactivity);
        setalarm = (CardView)findViewById(R.id.to_alarm);
        maps = (CardView) findViewById(R.id.to_maps);
        Shopping = (CardView) findViewById(R.id.to_shopping) ;
        btn_fragment = (CardView) findViewById(R.id.to_fragment2);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, helloactivity.class);
                startActivity(Buka);
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, countactivity.class);
                startActivity(Buka);
            }
        });
        Sianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, sianidaactivity.class);
                startActivity(Buka);
            }
        });
        twoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, twoactivity.class);
                startActivity(Buka);
            }
        });
        setalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, setalarmactivity.class);
                startActivity(Buka);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });

        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity2.this, fragment2.class);
                startActivity(Buka);
            }
        });
        }
}