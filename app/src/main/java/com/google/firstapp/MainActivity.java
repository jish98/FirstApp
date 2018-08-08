package com.google.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button bt;

        @Override
         protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);

             bt = (Button)findViewById(R.id.button);
             bt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View V) {
                 Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                  startActivity(myIntent);

                 Toast.makeText(getApplicationContext(),"Suryaaakaaanth hi daaaa", Toast.LENGTH_SHORT).show();


             }
         });
         }
}
