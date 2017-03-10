package com.example.pulkit.spinthebottle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView stb;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stb = (ImageView) findViewById(R.id.stb);

        random = new Random();


        stb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RotateAnimation rotateAnimation = new RotateAnimation(0,random.nextInt(36000)+360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);

                rotateAnimation.setFillAfter(true);
                rotateAnimation.setDuration(1000);
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

                stb.startAnimation(rotateAnimation);
            }
        });


    }
}
