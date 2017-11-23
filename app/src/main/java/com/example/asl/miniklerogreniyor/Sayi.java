package com.example.asl.miniklerogreniyor;


import android.content.Context;

public class Sayi {

    int ResimId;

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }

    public Sayi(Context context,int id) {





            if(id==1)
            ResimId = R.drawable.bir;

            if (id == 2)
                ResimId = R.drawable.iki;


            if (id == 3)
                ResimId = R.drawable.uc;

            if (id == 4)
                ResimId = R.drawable.dort;

            if (id == 5)
                ResimId = R.drawable.bes;

            if (id == 6)
                ResimId = R.drawable.alti;

            if (id == 7)
                ResimId = R.drawable.yedi;

            if (id == 8)
                ResimId = R.drawable.sekiz;

            if (id == 9)
                ResimId = R.drawable.dokuz;

        }
    }

