package com.example.dell.karachi_thecityoflights;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView karachiTextView,captionTextView;
    private Animation fadeAnimation,blinkAnimation;
    private MediaPlayer mMediaPlayer;
    private Intent changeActivity;
    private Typeface mTypeFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        karachiTextView = (TextView) findViewById(R.id.main_text);
        captionTextView = (TextView) findViewById(R.id.caption_text);
        fadeAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein_anim);
        blinkAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
        mMediaPlayer = MediaPlayer.create(SplashActivity.this,R.raw.truck);
        mTypeFace = Typeface.createFromAsset(getAssets(),"fonts/giddyup.ttf");

        karachiTextView.setAnimation(fadeAnimation);
        captionTextView.setAnimation(blinkAnimation);
        captionTextView.setTypeface(mTypeFace);

        mMediaPlayer.start();
        changeActivity();
    }

    public void changeActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                releaseMediaPlayer();
                changeActivity  = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(changeActivity);
            }
        },4000);
    }

    public void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}