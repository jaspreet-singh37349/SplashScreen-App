package com.jaspreet.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Animation top,bottom,left;
    ImageView GS,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        GS = findViewById(R.id.imageView);
        text = findViewById(R.id.imageView2);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);
        left = AnimationUtils.loadAnimation(this,R.anim.left);

        GS.setAnimation(top);
        btn.setAnimation(bottom);
        text.setAnimation(left);
    }
}
