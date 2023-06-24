package com.example.individual_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int image1 = R.drawable.ic_android_black_100dp;
    int image2 = R.drawable.ic_android_blue_100dp;
    int image3 = R.drawable.ic_android_white_100dp;
    int image4 = R.drawable.ic_android_red_100dp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageButton secondActivityButton = findViewById(R.id.secondActivityButton);
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(image1);
            }
        });

        ImageButton secondActivityButton2 = findViewById(R.id.secondActivityButton2);
        secondActivityButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(image2);
            }
        });

        ImageButton secondActivityButton3 = findViewById(R.id.secondActivityButton3);
        secondActivityButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(image3);
            }
        });

        ImageButton secondActivityButton4 = findViewById(R.id.secondActivityButton4);
        secondActivityButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity(image4);
            }
        });

        Button closeButton = findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    // Agregar parametro de imagen a la funcion
    private void goToSecondActivity(int imageId) {
        Intent explicitIntent = new Intent(MainActivity.this, SecondActivity.class);
        explicitIntent.putExtra("key", imageId);
        startActivity(explicitIntent);
    }
}
