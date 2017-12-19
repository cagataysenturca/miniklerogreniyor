package com.example.asl.miniklerogreniyor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MeyveActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.muzz, R.raw.ananas, R.raw.clk, R.raw.elma, R.raw.krpz, R.raw.prtkl, R.raw.nar, R.raw.uzm, R.raw.armut};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meyve);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Meyve[] meyveler = new Meyve[10];

        for (int i = 1; i <= 10; i++) {
            meyveler[i - 1] = new Meyve(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 9;
                if (index < 0) {
                    index += 9;
                }
                Meyve meyve = meyveler[index];
                imageView.setImageResource(meyve.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 9;
                Meyve meyve = meyveler[index];
                imageView.setImageResource(meyve.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(MeyveActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

