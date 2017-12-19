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

public class IcecekActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.cay, R.raw.kahve, R.raw.stt, R.raw.su, R.raw.port};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecek);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Icecek[] icecekler = new Icecek[6];

        for (int i = 1; i <= 6; i++) {
            icecekler[i - 1] = new Icecek(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 5;
                if (index < 0) {
                    index += 5;
                }
                Icecek icecek = icecekler[index];
                imageView.setImageResource(icecek.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 5;
                Icecek icecek = icecekler[index];
                imageView.setImageResource(icecek.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(IcecekActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

