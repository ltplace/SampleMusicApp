package edu.cmich.place1l.samplemusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SampleLoadingPage extends AppCompatActivity {

    private MediaPlayer mp1;
    private MediaPlayer mp2;
    private MediaPlayer mp3;
    private MediaPlayer mp4;
    private MediaPlayer mp5;
    private MediaPlayer mp6;
    private MediaPlayer mp7;
    private MediaPlayer mp8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_loading_page);

        Intent intent = getIntent();

        setUpDropDowns();

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
                mp2 = MediaPlayer.create(this, R.raw.kick909);
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
                mp3 = MediaPlayer.create(this, R.raw.oh909);
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
                mp4 = MediaPlayer.create(this, R.raw.ride909);
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
                mp5 = MediaPlayer.create(this, R.raw.snare909);
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
                mp6 = MediaPlayer.create(this, R.raw.tomhigh);
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
                mp8 = MediaPlayer.create(this, R.raw.tommid);
            } mp8.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUpDropDowns(){
        Spinner spinner1 = (Spinner)findViewById(R.id.padSelect_spinner1);
        Spinner spinner2 = (Spinner)findViewById(R.id.padSelect_spinner2);
        Spinner spinner3 = (Spinner)findViewById(R.id.padSelect_spinner3);
        Spinner spinner4 = (Spinner)findViewById(R.id.padSelect_spinner4);
        Spinner spinner5 = (Spinner)findViewById(R.id.padSelect_spinner5);
        Spinner spinner6 = (Spinner)findViewById(R.id.padSelect_spinner6);
        Spinner spinner7 = (Spinner)findViewById(R.id.padSelect_spinner7);
        Spinner spinner8 = (Spinner)findViewById(R.id.padSelect_spinner8);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pad_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);


    }


}
