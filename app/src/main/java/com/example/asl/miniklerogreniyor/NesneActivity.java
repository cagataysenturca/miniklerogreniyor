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

public class NesneActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.slg, R.raw.balon, R.raw.dftr, R.raw.ft, R.raw.klm, R.raw.masa, R.raw.uctm, R.raw.yapboz};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nesne);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Nesne[] nesneler = new Nesne[9];

        for (int i = 1; i <= 9; i++) {
            nesneler[i - 1] = new Nesne(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 8;
                if (index < 0) {
                    index += 8;
                }
                Nesne nesne = nesneler[index];
                imageView.setImageResource(nesne.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 8;
                Nesne nesne= nesneler[index];
                imageView.setImageResource(nesne.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(NesneActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

