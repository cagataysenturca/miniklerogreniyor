package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 28.11.2017.
 */

public class Icecek {
    int ResimId;

    public Icecek(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }
    public Icecek(Context context, int id) {

        if(id==1)
            ResimId = R.drawable.cay;

        if (id == 2)
            ResimId = R.drawable.kahve;


        if (id == 3)
            ResimId = R.drawable.sut;

        if (id == 4)
            ResimId = R.drawable.su;

        if (id == 5)
            ResimId = R.drawable.prtsu;
    }
}
