package edu.cmich.place1l.samplemusic;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    private MediaPlayer mp1;
    private MediaPlayer mp2;
    private MediaPlayer mp3;
    private MediaPlayer mp4;
    private MediaPlayer mp5;
    private MediaPlayer mp6;
    private MediaPlayer mp7;
    private MediaPlayer mp8;

    private int playbackPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("log", "created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp1 = MediaPlayer.create(this, R.raw.clap909);
        mp2 = MediaPlayer.create(this, R.raw.snare909);
        mp3 = MediaPlayer.create(this, R.raw.kick909);
        mp4 = MediaPlayer.create(this, R.raw.oh909);
        mp5 = MediaPlayer.create(this, R.raw.tomhigh);
        mp6 = MediaPlayer.create(this, R.raw.tommid);
        mp7 = MediaPlayer.create(this, R.raw.tomlow);
        mp8 = MediaPlayer.create(this, R.raw.ride909);
    }

    public void doBtnClick1(View view) {
        try {
            if (mp1.isPlaying()) {
                mp1.stop();
                mp1.release();
                mp1 = MediaPlayer.create(this, R.raw.clap909);
            } mp1.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick2(View view) {
        try {
            if (mp2.isPlaying()) {
                mp2.stop();
                mp2.release();
                mp2 = MediaPlayer.create(this, R.raw.snare909);
            } mp2.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick3(View view) {
        try {
            if (mp3.isPlaying()) {
                mp3.stop();
                mp3.release();
                mp3 = MediaPlayer.create(this, R.raw.kick909);
            } mp3.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick4(View view) {
        try {
            if (mp4.isPlaying()) {
                mp4.stop();
                mp4.release();
                mp4 = MediaPlayer.create(this, R.raw.oh909);
            } mp4.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick5(View view) {
        try {
            if (mp5.isPlaying()) {
                mp5.stop();
                mp5.release();
                mp5 = MediaPlayer.create(this, R.raw.tomhigh);
            } mp5.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick6(View view) {
        try {
            if (mp6.isPlaying()) {
                mp6.stop();
                mp6.release();
                mp6 = MediaPlayer.create(this, R.raw.tommid);
            } mp6.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick7(View view) {
        try {
            if (mp7.isPlaying()) {
                mp7.stop();
                mp7.release();
                mp7 = MediaPlayer.create(this, R.raw.tomlow);
            } mp7.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick8(View view) {
        try {
            if (mp8.isPlaying()) {
                mp8.stop();
                mp8.release();
                mp8 = MediaPlayer.create(this, R.raw.ride909);
            } mp8.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doSampleLoadingPage(View view){
        Intent intent = new Intent(this, SampleLoadingPage.class);
        startActivity(intent);
    }

}
