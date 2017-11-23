package com.example.asl.miniklerogreniyor;


import android.content.Context;

public class Ses {
    int SesId;

    public Ses(int sesId) {
        SesId = sesId;
    }

    public int getSesId() {
        return SesId;
    }

    public void setSesId(int sesId) {
        SesId = sesId;
    }

    public Ses (Context context, int id) {


        if(id==1)
            SesId = R.raw.bir;

        if (id == 2)
            SesId = R.raw.iki;


        if (id == 3)
            SesId= R.raw.uc;

        if (id == 4)
            SesId = R.raw.dort;

        if (id == 5)
            SesId = R.raw.bes;

        if (id == 6)
            SesId = R.raw.alti;

        if (id == 7)
            SesId = R.raw.yedi;

        if (id == 8)
            SesId = R.raw.sekiz;

        if (id == 9)
            SesId= R.raw.dokuz;
    }
}





