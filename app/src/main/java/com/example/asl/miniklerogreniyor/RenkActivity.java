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

public class RenkActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.sarrrr, R.raw.mor, R.raw.pemb, R.raw.trnc,R.raw.krmz, R.raw.mav, R.raw.yessl};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renk);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Renk[] renkler = new Renk[8];

        for (int i = 1; i <= 8; i++) {
            renkler[i - 1] = new Renk(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 7;
                if (index < 0) {
                    index += 7;
                }
                Renk renk = renkler[index];
                imageView.setImageResource(renk.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 7;
                Renk renk= renkler[index];
                imageView.setImageResource(renk.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(RenkActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

