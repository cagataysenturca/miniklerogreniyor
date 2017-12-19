package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 27.11.2017.
 */

public class Nesne {
    int ResimId;

    public Nesne(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }

    public Nesne(Context context, int id) {

        if(id==1)
            ResimId = R.drawable.sl;

        if (id == 2)
            ResimId = R.drawable.blln;


        if (id == 3)
            ResimId = R.drawable.df;

        if (id == 4)
            ResimId = R.drawable.ftop;

        if (id == 5)
            ResimId = R.drawable.kl;

        if (id == 6)
            ResimId = R.drawable.mas;

        if (id == 7)
            ResimId = R.drawable.uct;

        if (id == 8)
            ResimId = R.drawable.ypbz;
    }
    }

