package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Member Variables
    SoundPool mSoundPool;
    int mCSoundId;
    int mDSoundId;
    int mESoundId;
    int mFSoundId;
    int mGSoundId;
    int mASoundId;
    int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);

        //get the resourse id
        mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);

    }

  public void playc (View view){
      mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
  }
  public void playa (View view){
    mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,0,NO_LOOP,NORMAL_PLAY_RATE);
  }
    public void playb (View view){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playd (View view){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playf (View view){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playg (View view){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playe (View view){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
