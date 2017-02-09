package com.bernardino.animacao;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    ImageView iv;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        iv = (ImageView) findViewById(R.id.ivRyuFodaId);

//        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.drawable.hadouken);

        iv.setBackgroundResource(R.drawable.hadouken);
        AnimationDrawable frameAnimation = (AnimationDrawable) iv.getBackground();
        frameAnimation.start();
    }
}
