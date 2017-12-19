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

public class YiyecekActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.bal, R.raw.ekm, R.raw.yum, R.raw.zeytn, R.raw.msr, R.raw.tavk, R.raw.pzz, R.raw.dond, R.raw.peyn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecek);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Yiyecek[] yiyecekler = new Yiyecek[10];

        for (int i = 1; i <= 10; i++) {
           yiyecekler[i - 1] = new Yiyecek(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 9;
                if (index < 0) {
                    index += 9;
                }
                Yiyecek yiyecek = yiyecekler[index];
                imageView.setImageResource(yiyecek.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 9;
                Yiyecek yiyecek= yiyecekler[index];
                imageView.setImageResource(yiyecek.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(YiyecekActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

