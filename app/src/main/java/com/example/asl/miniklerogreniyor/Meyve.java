package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 27.11.2017.
 */

public class Meyve {
    int ResimId;

    public Meyve(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }
    public Meyve(Context context, int id) {
        if(id==1)
            ResimId = R.drawable.muz;

        if (id == 2)
            ResimId = R.drawable.ana;


        if (id == 3)
            ResimId = R.drawable.clk;

        if (id == 4)
            ResimId = R.drawable.elma;

        if (id == 5)
            ResimId = R.drawable.krpz;

        if (id == 6)
            ResimId = R.drawable.pr;

        if (id == 7)
            ResimId = R.drawable.nar;

        if (id == 8)
            ResimId = R.drawable.uz;

        if (id == 9)
            ResimId = R.drawable.armut;


    }
}