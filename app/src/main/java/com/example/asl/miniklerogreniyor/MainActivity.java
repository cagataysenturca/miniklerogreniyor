package com.example.asl.miniklerogreniyor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    MediaPlayer giris,ses,ses2,ses3,ses4,ses5,ses6,ses7,ses8;
    Button sayibtn;
    Button sekilbtn;
    Button meyvebtn;
    Button hayvanbtn;
    Button nesnebtn;
    Button yiyecekbtn;
    Button renkbtn;
    Button icecekbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giris = MediaPlayer.create(MainActivity.this, R.raw.giris);

        giris.setLooping(true);


    

        sayibtn = (Button) findViewById(R.id.sayibtn);
        sekilbtn = (Button) findViewById(R.id.sekilbtn);
        meyvebtn = (Button) findViewById(R.id.meyvebtn);
        hayvanbtn = (Button) findViewById(R.id.hayvanbtn);
        nesnebtn = (Button) findViewById(R.id.nesnebtn);
        yiyecekbtn = (Button) findViewById(R.id.yiyecekbtn);
        renkbtn = (Button) findViewById(R.id.renkbtn);
        icecekbtn = (Button) findViewById(R.id.icecekbtn);


        final MediaPlayer ses = MediaPlayer.create(MainActivity.this, R.raw.sayilar);
        final MediaPlayer ses2 = MediaPlayer.create(MainActivity.this, R.raw.sekiller);
        final MediaPlayer ses3 = MediaPlayer.create(MainActivity.this, R.raw.meyveler);
        final MediaPlayer ses4 = MediaPlayer.create(MainActivity.this, R.raw.hayvan);
        final MediaPlayer ses5 = MediaPlayer.create(MainActivity.this, R.raw.nesneler);
        final MediaPlayer ses6 = MediaPlayer.create(MainActivity.this, R.raw.yyckler);
        final MediaPlayer ses7 = MediaPlayer.create(MainActivity.this, R.raw.renkk);
        final MediaPlayer ses8 = MediaPlayer.create(MainActivity.this, R.raw.cecek);


        sayibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses.start();

                Intent intent = new Intent(getApplicationContext(), SayilarActivity.class);
                startActivity(intent);

            }

        });

        meyvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses3.start();

                Intent intent = new Intent(getApplicationContext(), MeyveActivity.class);
                startActivity(intent);


            }
        });

        hayvanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses4.start();

                Intent intent = new Intent(getApplicationContext(), HayvanActivity.class);
                startActivity(intent);

            }
        });

        nesnebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses5.start();

                Intent intent = new Intent(getApplicationContext(), NesneActivity.class);
                startActivity(intent);


            }
        });

        yiyecekbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses6.start();


                Intent intent = new Intent(getApplicationContext(), YiyecekActivity.class);
                startActivity(intent);


            }
        });

        renkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses7.start();

                Intent intent = new Intent(getApplicationContext(), RenkActivity.class);
                startActivity(intent);


            }
        });
        icecekbtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                ses8.start();

                Intent intent = new Intent(getApplicationContext(), IcecekActivity.class);
                startActivity(intent);


            }
        });


        sekilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses2.start();


                Intent intent = new Intent(getApplicationContext(), SekilActivity.class);
                startActivity(intent);

            }

        });


    }
}
