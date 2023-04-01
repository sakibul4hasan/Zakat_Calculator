package com.example.zakatcalculator;

import static com.example.zakatcalculator.R.id.v1;
import static com.example.zakatcalculator.R.id.video1;
import static com.example.zakatcalculator.R.id.zCalcu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    LinearLayout zCalcu, video1, video2, video3, video4;
    ImageView v1, v2, v3, v4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zCalcu = findViewById(R.id.zCalcu);

        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);
        v4 = findViewById(R.id.v4);
        video1 = findViewById(R.id.video1);
        video2 = findViewById(R.id.video2);
        video3 = findViewById(R.id.video3);
        video4 = findViewById(R.id.video4);


        zCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ZakatCalcu.class);
                startActivity(intent);
            }
        });





        //.........................Video Section.............................

        Picasso.get()
                .load("https://img.youtube.com/vi/H5UfaVT9YTs/0.jpg")
                .error(R.drawable.no_internet)
                .into(v1);

        Picasso.get()
                .load("https://img.youtube.com/vi/cBoBjlbXYHo/0.jpg")
                .error(R.drawable.no_internet)
                .into(v2);

        Picasso.get()
                .load("https://img.youtube.com/vi/TCBixQ8p7nU/0.jpg")
                .error(R.drawable.no_internet)
                .into(v3);

        Picasso.get()
                .load("https://img.youtube.com/vi/yhNO9Dvk700/0.jpg")
                .error(R.drawable.no_internet)
                .into(v4);

        //.............
        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Web_View.class);
                startActivity(intent);
                Web_View.videoURL ="https://www.youtube.com/embed/H5UfaVT9YTs";
            }
        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Web_View.class);
                startActivity(intent);
                Web_View.videoURL ="https://www.youtube.com/embed/cBoBjlbXYHo";
            }
        });
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Web_View.class);
                startActivity(intent);
                Web_View.videoURL ="https://www.youtube.com/embed/TCBixQ8p7nU";
            }
        });
        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Web_View.class);
                startActivity(intent);
                Web_View.videoURL ="https://www.youtube.com/embed/yhNO9Dvk700";
            }
        });









    } //.....onCreate Bundle end........






    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


}