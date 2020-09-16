package com.example.lab1_mob202;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity {
    FrameLayout frm;
    int[][] arr = {
            {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7,
                    R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.cj, R.drawable.cq, R.drawable.ck},
            {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6, R.drawable.d7,
                    R.drawable.d8, R.drawable.d9, R.drawable.d10, R.drawable.dj, R.drawable.dq, R.drawable.dk},
            {R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4, R.drawable.h5, R.drawable.h6, R.drawable.h7,
                    R.drawable.h8, R.drawable.h9, R.drawable.h10, R.drawable.hj, R.drawable.hq, R.drawable.hk,},
            {R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7,
                    R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.sj, R.drawable.sq, R.drawable.sk}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        frm = findViewById(R.id.frame);

        int marginLeft = 80;
        for (int i = 0; i < arr.length; i++) {
            int marginTop = 0;
            for (int j = 0; j < arr[i].length; j++) {
                ImageView iv = new ImageView(Bai4.this);
                iv.setImageResource(arr[i][j]);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(200, 350);
                marginTop += 80;
                params.setMargins(marginLeft, marginTop, 0, 0);
                iv.setLayoutParams(params);
                frm.addView(iv);
            }
            marginLeft += 360;
        }
    }
}