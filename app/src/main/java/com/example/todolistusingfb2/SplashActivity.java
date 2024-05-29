package com.example.todolistusingfb2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionbar=getSupportActionBar();
        actionbar.hide();;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // yaha par hum code likhenge jo splash screen ke just baad chalana hai
                Intent inext=new Intent(SplashActivity.this,MainActivity.class); // defining of intent
                startActivity(inext); // running and passing of intent
                finish(); // this line will make the splash activity finish from the back stack of activities.
                // so that when we are back pressing we dont see the splash screen as it is stored the activity stack
            }
        },4000);

    }
}