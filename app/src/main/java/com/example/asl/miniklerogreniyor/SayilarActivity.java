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

public class SayilarActivity extends AppCompatActivity {


    Button geribtn, ileribtn;
    ImageView imageView;
    int index = 0;
    MediaPlayer mediaPlayer;

    int[] sesler = {R.raw.bir, R.raw.iki, R.raw.uc, R.raw.dort, R.raw.bes, R.raw.alti, R.raw.yedi, R.raw.sekiz, R.raw.dokuz};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar);


        geribtn = (Button) findViewById(R.id.geribtn);
        ileribtn = (Button) findViewById(R.id.ileribtn);
        imageView = (ImageView) findViewById(R.id.imageView);


        final Sayi[] sayilar = new Sayi[10];

        for (int i = 1; i <= 10; i++) {
            sayilar[i - 1] = new Sayi(this, i);


        }

        playSound(0);
        geribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index - 1) % 9;
                if (index < 0) {
                    index += 9;
                }
                Sayi sayi = sayilar[index];
                imageView.setImageResource(sayi.getResimId());
                playSound(index);

            }
        });
        ileribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index = (index + 1) % 9;
                Sayi sayi = sayilar[index];
                imageView.setImageResource(sayi.getResimId());
                playSound(index);

            }
        });

    }

    void playSound(int index) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(SayilarActivity.this, sesler[index]);
        mediaPlayer.start();
    }

}

