package com.sinhvien.shopeefood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.sinhvien.shopeefood.UI.MainActivity;

public class ScreenLoading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ScreenLoading.this, MainActivity.class);
                startActivity(i);
                onStop();
            }
        },3000);
    }
}