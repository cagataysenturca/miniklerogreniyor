package com.example.asl.miniklerogreniyor;


import android.content.Context;

public class Renk {
    int ResimId;

    public Renk(int resimId) {
        ResimId = resimId;
    }

    public int getResimId() {
        return ResimId;
    }

    public void setResimId(int resimId) {
        ResimId = resimId;
    }

    public Renk(Context context, int id) {

        if(id==1)
            ResimId = R.drawable.sarrr;

        if (id == 2)
            ResimId = R.drawable.mor;


        if (id == 3)
            ResimId = R.drawable.pembe;

        if (id == 4)
            ResimId = R.drawable.trnc;

        if (id == 5)
            ResimId = R.drawable.krmz;

        if (id == 6)
            ResimId = R.drawable.mav;

        if (id == 7)
            ResimId = R.drawable.yessl;

        ;
    }
}


