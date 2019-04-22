package com.example.colebykcoralreefproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button locationBtn = (Button) findViewById(R.id.locationBtn);
        locationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, locationActivity.class));

            }
        });

        Button lifeBtn = (Button) findViewById(R.id.lifeBtn);
        lifeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, lifeActivity.class));

            }
        });

        Button sizeBtn = (Button) findViewById(R.id.sizeBtn);
        sizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, sizeActivity.class));

            }
        });

        Button coralBtn = (Button) findViewById(R.id.coralBtn);
        coralBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, coralActivity.class));

            }
        });

        Button importanceBtn = (Button) findViewById(R.id.importanceBtn);
        importanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, importanceActivity.class));

            }
        });

    }





}
