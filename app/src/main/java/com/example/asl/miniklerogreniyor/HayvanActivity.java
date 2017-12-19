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

public class HayvanActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.at, R.raw.ayk, R.raw.balk, R.raw.esk, R.raw.klbk, R.raw.kpk, R.raw.kus, R.raw.maymun, R.raw.tavsan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvan);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Hayvan[] hayvanlar = new Hayvan[10];

        for (int i = 1; i <= 10; i++) {
            hayvanlar[i - 1] = new Hayvan(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 9;
                if (index < 0) {
                    index += 9;
                }
                Hayvan hayvan = hayvanlar[index];
                imageView.setImageResource(hayvan.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 9;
                Hayvan hayvan= hayvanlar[index];
                imageView.setImageResource(hayvan.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(HayvanActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

