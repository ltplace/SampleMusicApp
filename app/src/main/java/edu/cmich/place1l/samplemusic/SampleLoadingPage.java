package edu.cmich.place1l.samplemusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class SampleLoadingPage extends AppCompatActivity {
    private MediaPlayer mp1;
    private MediaPlayer mp2;
    private MediaPlayer mp3;
    private MediaPlayer mp4;
    private MediaPlayer mp5;
    private MediaPlayer mp6;
    private MediaPlayer mp7;
    private MediaPlayer mp8;

    private String pad1 = "";
    private String pad2 = "";
    private String pad3 = "";
    private String pad4 = "";
    private String pad5 = "";
    private String pad6 = "";
    private String pad7 = "";
    private String pad8 = "";

    //get path to sdcard as string
    protected String sdcardPath = Environment.getExternalStorageDirectory().toString();
    //get path to Music folder
    protected String fullPath = sdcardPath + "/Music/";
    //music folder as file object
    protected File musicFolder = new File(fullPath);
    public ArrayList<String> secondFiles = new ArrayList<String>();
    public ArrayList<String> filenames = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_loading_page);
        Intent intent = getIntent();
        filenames = intent.getStringArrayListExtra("filenames");
        Spinner spinner1 = findViewById(R.id.padSelect_spinner1);
        Spinner spinner2 = findViewById(R.id.padSelect_spinner2);
        Spinner spinner3 = findViewById(R.id.padSelect_spinner3);
        Spinner spinner4 = findViewById(R.id.padSelect_spinner4);
        Spinner spinner5 = findViewById(R.id.padSelect_spinner5);
        Spinner spinner6 = findViewById(R.id.padSelect_spinner6);
        Spinner spinner7 = findViewById(R.id.padSelect_spinner7);
        Spinner spinner8 = findViewById(R.id.padSelect_spinner8);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filenames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(listener);
        spinner2.setOnItemSelectedListener(listener);
        spinner3.setOnItemSelectedListener(listener);
        spinner4.setOnItemSelectedListener(listener);
        spinner5.setOnItemSelectedListener(listener);
        spinner6.setOnItemSelectedListener(listener);
        spinner7.setOnItemSelectedListener(listener);
        spinner8.setOnItemSelectedListener(listener);

        pad1 = fullPath + spinner1.getSelectedItem().toString();
        pad2 = fullPath + spinner2.getSelectedItem().toString();
        pad3 = fullPath + spinner3.getSelectedItem().toString();
        pad4 = fullPath + spinner4.getSelectedItem().toString();
        pad5 = fullPath + spinner5.getSelectedItem().toString();
        pad6 = fullPath + spinner6.getSelectedItem().toString();
        pad7 = fullPath + spinner7.getSelectedItem().toString();
        pad8 = fullPath + spinner8.getSelectedItem().toString();

//        mp1 = MediaPlayer.create(this, R.raw.clap909);
//        mp2 = MediaPlayer.create(this, R.raw.snare909);
//        mp3 = MediaPlayer.create(this, R.raw.kick909);
//        mp4 = MediaPlayer.create(this, R.raw.oh909);
//        mp5 = MediaPlayer.create(this, R.raw.tomhigh);
//        mp6 = MediaPlayer.create(this, R.raw.tommid);
//        mp7 = MediaPlayer.create(this, R.raw.tomlow);
//        mp8 = MediaPlayer.create(this, R.raw.ride909);
    }

    AdapterView.OnItemSelectedListener listener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            switch(adapterView.getId()){
                case R.id.padSelect_spinner1:
                    Spinner spinner1 = findViewById(R.id.padSelect_spinner1);
                    pad1 = fullPath + spinner1.getSelectedItem().toString();
                    Toast.makeText(SampleLoadingPage.this, "a", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.padSelect_spinner2:
                    Spinner spinner2 = findViewById(R.id.padSelect_spinner1);
                    pad2 = fullPath + spinner2.getSelectedItem().toString();
                    Toast.makeText(SampleLoadingPage.this, "b", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.padSelect_spinner3:
                    Spinner spinner3 = findViewById(R.id.padSelect_spinner3);
                    pad3 = fullPath + spinner3.getSelectedItem().toString();
                    Toast.makeText(SampleLoadingPage.this, "c", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.padSelect_spinner4:
                    Spinner spinner4 = findViewById(R.id.padSelect_spinner4);
                    pad4 = fullPath + spinner4.getSelectedItem().toString();
                    break;
                case R.id.padSelect_spinner5:
                    Spinner spinner5 = findViewById(R.id.padSelect_spinner5);
                    pad5 = fullPath + spinner5.getSelectedItem().toString();
                    break;
                case R.id.padSelect_spinner6:
                    Spinner spinner6 = findViewById(R.id.padSelect_spinner6);
                    pad6 = fullPath + spinner6.getSelectedItem().toString();
                    break;
                case R.id.padSelect_spinner7:
                    Spinner spinner7 = findViewById(R.id.padSelect_spinner7);
                    pad7 = fullPath + spinner7.getSelectedItem().toString();
                    break;
                case R.id.padSelect_spinner8:
                    Spinner spinner8 = findViewById(R.id.padSelect_spinner8);
                    pad8 = fullPath + spinner8.getSelectedItem().toString();
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        filenames = intent.getStringArrayListExtra("filenames");
        Spinner spinner1 = (Spinner)findViewById(R.id.padSelect_spinner1);
        Spinner spinner2 = (Spinner)findViewById(R.id.padSelect_spinner2);
        Spinner spinner3 = (Spinner)findViewById(R.id.padSelect_spinner3);
        Spinner spinner4 = (Spinner)findViewById(R.id.padSelect_spinner4);
        Spinner spinner5 = (Spinner)findViewById(R.id.padSelect_spinner5);
        Spinner spinner6 = (Spinner)findViewById(R.id.padSelect_spinner6);
        Spinner spinner7 = (Spinner)findViewById(R.id.padSelect_spinner7);
        Spinner spinner8 = (Spinner)findViewById(R.id.padSelect_spinner8);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filenames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        pad1 = fullPath + spinner1.getSelectedItem().toString();
        pad2 = fullPath + spinner2.getSelectedItem().toString();
        pad3 = fullPath + spinner3.getSelectedItem().toString();
        pad4 = fullPath + spinner4.getSelectedItem().toString();
        pad5 = fullPath + spinner5.getSelectedItem().toString();
        pad6 = fullPath + spinner6.getSelectedItem().toString();
        pad7 = fullPath + spinner7.getSelectedItem().toString();
        pad8 = fullPath + spinner8.getSelectedItem().toString();
    }

//    public void doBtnClick1(View view) {
//        try {
//            if (mp1.isPlaying()) {
//                mp1.stop();
//                mp1.release();
//                mp1 = MediaPlayer.create(this, R.raw.clap909);
//            } mp1.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick2(View view) {
//        try {
//            if (mp2.isPlaying()) {
//                mp2.stop();
//                mp2.release();
//                mp2 = MediaPlayer.create(this, R.raw.kick909);
//            } mp2.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick3(View view) {
//        try {
//            if (mp3.isPlaying()) {
//                mp3.stop();
//                mp3.release();
//                mp3 = MediaPlayer.create(this, R.raw.oh909);
//            } mp3.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick4(View view) {
//        try {
//            if (mp4.isPlaying()) {
//                mp4.stop();
//                mp4.release();
//                mp4 = MediaPlayer.create(this, R.raw.ride909);
//            } mp4.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick5(View view) {
//        try {
//            if (mp5.isPlaying()) {
//                mp5.stop();
//                mp5.release();
//                mp5 = MediaPlayer.create(this, R.raw.snare909);
//            } mp5.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick6(View view) {
//        try {
//            if (mp6.isPlaying()) {
//                mp6.stop();
//                mp6.release();
//                mp6 = MediaPlayer.create(this, R.raw.tomhigh);
//            } mp6.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick7(View view) {
//        try {
//            if (mp7.isPlaying()) {
//                mp7.stop();
//                mp7.release();
//                mp7 = MediaPlayer.create(this, R.raw.tomlow);
//            } mp7.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void doBtnClick8(View view) {
//        try {
//            if (mp8.isPlaying()) {
//                mp8.stop();
//                mp8.release();
//                mp8 = MediaPlayer.create(this, R.raw.tommid);
//            } mp8.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public void saveButton(View view) {
        secondFiles.add(0,pad1);
        secondFiles.add(1,pad2);
        secondFiles.add(2,pad3);
        secondFiles.add(3,pad4);
        secondFiles.add(4,pad5);
        secondFiles.add(5,pad6);
        secondFiles.add(6,pad7);
        secondFiles.add(7,pad8);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putStringArrayListExtra("secondFiles", secondFiles);
        startActivity(intent);
    }
}
