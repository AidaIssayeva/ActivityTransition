package com.example.adityanarayan.activitytransition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.widget.ImageView;
import android.widget.TextView;


public class Second extends AppCompatActivity {


    TextView myText;
    ImageView myImage;

    int  image;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myText = (TextView) findViewById(R.id.text1);
        myImage = (ImageView) findViewById(R.id.image1);
        Intent intent=getIntent();
        image=intent.getIntExtra("image",0);
        myImage.setImageResource(image);

        getWindow().getEnterTransition().addListener(new Transition.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {
                myText.setAlpha(.1f);
            }

            @Override
            public void onTransitionEnd(Transition transition) {

            }

            @Override
            public void onTransitionCancel(Transition transition) {

            }

            @Override
            public void onTransitionPause(Transition transition) {

            }

            @Override
            public void onTransitionResume(Transition transition) {

            }
        });

     //   Animation mLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in);
     //   mLoadAnimation.setDuration(5000);
     //   myImage.startAnimation(mLoadAnimation);



    }







}
