package com.example.fyp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Main_screen extends AppCompatActivity {

    ImageView World_Cup_record;
    ImageView Check_angle;
    ImageView Batsman;
    ImageView Bowlers;
    ImageView Record_book;
    ImageView About_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_screen);



        World_Cup_record = findViewById(R.id.world_cup_records);


        Check_angle = findViewById(R.id.check_angle);


        Batsman = findViewById(R.id.batsman);

        Bowlers = findViewById(R.id.bowlers);


        Record_book = findViewById(R.id.imageView5);
        About_us = findViewById(R.id.about_us);




        World_Cup_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), World_cups.class));
            }
        });

        Check_angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Check_Activity.class));
            }
        });


        Batsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BatsmanActivity.class));
            }
        });

        Bowlers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BowlersActivity.class));
            }
        });


        Record_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Record_book_Activity.class));
            }
        });

        About_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), About_us_Activity.class));
            }
        });




    }
}