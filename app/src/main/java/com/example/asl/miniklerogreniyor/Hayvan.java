package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 27.11.2017.
 */

public class Hayvan {
    int ResimId;

    public Hayvan(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }
    public Hayvan(Context context, int id) {

        if(id==1)
            ResimId = R.drawable.at;

        if (id == 2)
            ResimId = R.drawable.ayk;


        if (id == 3)
            ResimId = R.drawable.balk;

        if (id == 4)
            ResimId = R.drawable.esk;

        if (id == 5)
            ResimId = R.drawable.klbk;

        if (id == 6)
            ResimId = R.drawable.kpk;

        if (id == 7)
            ResimId = R.drawable.kus;

        if (id == 8)
            ResimId = R.drawable.maymun;

        if (id == 9)
            ResimId = R.drawable.tavsan;


    }
}

