package com.example.reboquiolearningtask32;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.example.reboquiolearningtask32.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.splashscreen);
        super.onCreate(savedInstanceState);
        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(SplashActivity.this,R.raw.app_intro);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                appIntro.stop();
                finish();
            }
        }, 5000);
    }
}