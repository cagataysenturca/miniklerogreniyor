package com.example.asl.miniklerogreniyor;

import android.content.Context;

/**
 * Created by aslı on 27.11.2017.
 */

public class Yiyecek {
  int ResimId;

    public Yiyecek(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }

    public Yiyecek(Context context, int id) {

        if(id==1)
            ResimId = R.drawable.ball;

        if (id == 2)
            ResimId = R.drawable.ekm;


        if (id == 3)
            ResimId = R.drawable.ymt;

        if (id == 4)
            ResimId = R.drawable.zey;

        if (id == 5)
            ResimId = R.drawable.msr;

        if (id == 6)
            ResimId = R.drawable.tavuk;

        if (id == 7)
            ResimId = R.drawable.pzz;

        if (id == 8)
            ResimId = R.drawable.dondrma;

        if (id == 9)
            ResimId = R.drawable.peyn;


    }
}
