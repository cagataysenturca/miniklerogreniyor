package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 27.11.2017.
 */

public class Sekil {
    int ResimId;

    public Sekil(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }
    public  Sekil(Context context,int id){

        if(id==1)
            ResimId = R.drawable.ay;

        if (id == 2)
            ResimId = R.drawable.dk;


        if (id == 3)
            ResimId = R.drawable.kar;

        if (id == 4)
            ResimId = R.drawable.ucgen;

        if (id == 5)
            ResimId = R.drawable.yuvarlak;

        if (id == 6)
            ResimId = R.drawable.yildiz;
    }
}

