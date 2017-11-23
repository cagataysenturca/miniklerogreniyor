package com.example.asl.miniklerogreniyor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sayibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sayibtn=(Button)findViewById(R.id.sayibtn);

        final MediaPlayer ses= MediaPlayer.create(this,R.raw.sayilar);

        sayibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ses.start();

                Intent intent = new Intent(getApplicationContext(), SayilarActivity.class);
                startActivity(intent);


            }
        });
    }
}