package edu.cmich.place1l.samplemusic;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.ArrayList;

public class MainActivity extends Activity {

    private MediaPlayer mp1;
    private MediaPlayer mp2;
    private MediaPlayer mp3;
    private MediaPlayer mp4;
    private MediaPlayer mp5;
    private MediaPlayer mp6;
    private MediaPlayer mp7;
    private MediaPlayer mp8;
    private File file;
    public ArrayList<String> files = new ArrayList<String>();
    public ArrayList<String> trueFiles = new ArrayList<String>();
    public ArrayList<String> filenames = new ArrayList<String>();
    //get path to sdcard as string
    protected String sdcardPath = Environment.getExternalStorageDirectory().toString();
    //get path to Music folder
    protected String fullPath = sdcardPath + "/Music/";
    //music folder as file object
    protected File musicFolder = new File(fullPath);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] s = musicFolder.list();

        for(int i = 0; i < s.length; i++){
//            files.add(s[i]);
            Log.d("s", s[i]);
            files.add(fullPath + s[i]);
            trueFiles.add(fullPath + s[i]);
            filenames.add(s[i]);
        }
        mp1 = MediaPlayer.create(this, Uri.parse(files.get(0)));
        mp2 = MediaPlayer.create(this, Uri.parse(files.get(1)));
        mp3 = MediaPlayer.create(this, Uri.parse(files.get(2)));
        mp4 = MediaPlayer.create(this, Uri.parse(files.get(3)));
        mp5 = MediaPlayer.create(this, Uri.parse(files.get(4)));
        mp6 = MediaPlayer.create(this, Uri.parse(files.get(5)));
        mp7 = MediaPlayer.create(this, Uri.parse(files.get(6)));
        mp8 = MediaPlayer.create(this, Uri.parse(files.get(7)));
        Log.d("YEP",files.get(0));


        //this will display the order and name of each file in the files array (for debugging)
//        for (int i = 0; i < files.length; i++){
//            String s = "File " + String.valueOf(i);
//            Log.d(s, files[i]);
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doBtnClick1(View view) {
        try {
            if (mp1.isPlaying()) {
                mp1.stop();
                mp1.release();
                mp1 = MediaPlayer.create(this, Uri.parse(files.get(0)));
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
                mp2 = MediaPlayer.create(this, Uri.parse(files.get(1)));
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
                mp3 = MediaPlayer.create(this, Uri.parse(files.get(2)));
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
                mp4 = MediaPlayer.create(this, Uri.parse(files.get(3)));
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
                mp5 = MediaPlayer.create(this, Uri.parse(files.get(4)));
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
                mp6 = MediaPlayer.create(this, Uri.parse(files.get(5)));
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
                mp7 = MediaPlayer.create(this, Uri.parse(files.get(6)));
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
                mp8 = MediaPlayer.create(this, Uri.parse(files.get(7)));
            } mp8.start();
            Log.d("PLAYED", "PLAYED");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void buttonClick(View view, MediaPlayer mp, File file){
//        try {
//            if (mp.isPlaying()) {
//                mp.stop();
//                mp.release();
//                mp = MediaPlayer.create();
//            } mp.start();
//            Log.d("PLAYED", "PLAYED");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void doSampleLoadingPage(View view){
        Intent intent = new Intent(this, SampleLoadingPage.class);
        intent.putStringArrayListExtra("files", files);
        intent.putStringArrayListExtra("filenames", filenames);
        intent.putStringArrayListExtra("trueFiles", trueFiles);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayList<String> secondFiles = getIntent().getStringArrayListExtra("secondFiles");
        try {
            mp1 = MediaPlayer.create(this, Uri.parse(secondFiles.get(0)));
            mp2 = MediaPlayer.create(this, Uri.parse(secondFiles.get(1)));
            mp3 = MediaPlayer.create(this, Uri.parse(secondFiles.get(2)));
            mp4 = MediaPlayer.create(this, Uri.parse(secondFiles.get(3)));
            mp5 = MediaPlayer.create(this, Uri.parse(secondFiles.get(4)));
            mp6 = MediaPlayer.create(this, Uri.parse(secondFiles.get(5)));
            mp7 = MediaPlayer.create(this, Uri.parse(secondFiles.get(6)));
            mp8 = MediaPlayer.create(this, Uri.parse(secondFiles.get(7)));


            files.add(0, secondFiles.get(0));
            Log.d("SECONDFILES 0", secondFiles.get(0));
            files.add(1, secondFiles.get(1));
            files.add(2, secondFiles.get(2));
            files.add(3, secondFiles.get(3));
            files.add(4, secondFiles.get(4));
            files.add(5, secondFiles.get(5));
            files.add(6, secondFiles.get(6));
            files.add(7, secondFiles.get(7));
            files.add(8, secondFiles.get(8));
        }
        catch(Exception e){

        }
    }
}
