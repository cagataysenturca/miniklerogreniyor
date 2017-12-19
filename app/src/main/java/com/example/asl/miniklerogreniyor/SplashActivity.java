package com.example.asl.miniklerogreniyor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import java.io.IOException;

import static android.nfc.NdefRecord.createUri;


public class SplashActivity extends Activity {

    MediaPlayer giris;

    private static String TAG = SplashActivity.class.getName();
    private static long SLEEP_TIME = 5; // Bekletilecek saniye

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE); // Splash ekrandan basligi kaldirir
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); // Bilgi cubugunu kaldirir

        setContentView(R.layout.activity_splash);


        giris = MediaPlayer.create(SplashActivity.this, R.raw.giris);
        giris.start();
        giris.setLooping(true);






        IntentLauncher launcher = new IntentLauncher();
        launcher.start();
    }

    private class IntentLauncher extends Thread {
        @Override

        public void run() {
            try {
// Sleeping
                Thread.sleep(SLEEP_TIME * 1000);
            } catch (Exception e) {
                Log.e(TAG, e.getMessage());
            }

// Start main activity
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); //Bu activity kapanır

        }
    }


}