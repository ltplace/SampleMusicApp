package edu.cmich.place1l.samplemusic;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

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
    public ArrayList<String> saveKitFiles = new ArrayList<String>();
    public HashMap<String, String> kitHash = new HashMap<>();
    //get path to sdcard as string
    protected String sdcardPath = Environment.getExternalStorageDirectory().toString();
    //get path to Music folder
    protected String fullPath = sdcardPath + "/Music/";
    //music folder as file object
    protected File musicFolder = new File(fullPath);
    File kitFilePath = new File(sdcardPath + "/Kits");
    File kitFile = new File(kitFilePath + "/kits");
    Properties properties = new Properties();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] s = musicFolder.list();
        kitFilePath.mkdir();
        for(int i = 0; i < s.length; i++){
//            files.add(s[i]);
            Log.d("s", s[i]);
            files.add(fullPath + s[i]);
            trueFiles.add(fullPath + s[i]);
            filenames.add(s[i]);
        }
        Log.d("file.0", files.get(0));
        //creates a mediaplayer for each pad
        //the sounds come from the files arraylist
        mp1 = MediaPlayer.create(this, Uri.parse(files.get(0)));
        mp2 = MediaPlayer.create(this, Uri.parse(files.get(1)));
        mp3 = MediaPlayer.create(this, Uri.parse(files.get(2)));
        mp4 = MediaPlayer.create(this, Uri.parse(files.get(3)));
        mp5 = MediaPlayer.create(this, Uri.parse(files.get(4)));
        mp6 = MediaPlayer.create(this, Uri.parse(files.get(5)));
        mp7 = MediaPlayer.create(this, Uri.parse(files.get(6)));
        mp8 = MediaPlayer.create(this, Uri.parse(files.get(7)));
//        Log.d("YEP",files.get(0));
//        Log.d("YEP",files.get(1));
//        Log.d("YEP",files.get(2));
//        Log.d("YEP",files.get(3));
//        Log.d("YEP",files.get(4));
//        Log.d("YEP",files.get(5));
//        Log.d("YEP",files.get(6));
//        Log.d("YEP",files.get(7));


        //this will display the order and name of each file in the files array (for debugging)
//        for (int i = 0; i < files.length; i++){
//            String s = "File " + String.valueOf(i);
//            Log.d(s, files[i]);
//        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //load the hash of kits from file (/storage/sdcard/Kits/kits
        try {
            properties.load(new FileInputStream(kitFile));
            for (String key : properties.stringPropertyNames()) {
                kitHash.put(key, properties.get(key).toString());
            }
        }catch(IOException c){}
    }
/*
These next 8 methods are button clicks for each pad
 */
    public void doBtnClick1(View view) {
        try {
            if (mp1.isPlaying()) {
                mp1.stop();
                mp1.release();
                mp1 = MediaPlayer.create(this, Uri.parse(files.get(0)));
            } mp1.start();
//            Log.d("PLAYED", "PLAYED");
//            Log.d("FILES0", files.get(0));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doBtnClick2(View view) {
        Log.d("files2", files.get(1));
        try {
            if (mp2.isPlaying()) {
                mp2.stop();
                mp2.release();
                mp2 = MediaPlayer.create(this, Uri.parse(files.get(1)));
            } mp2.start();
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
//            Log.d("PLAYED", "PLAYED");
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
//            Log.d("PLAYED", "PLAYED");
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
//            Log.d("PLAYED", "PLAYED");
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
//            Log.d("PLAYED", "PLAYED");
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
//            Log.d("PLAYED", "PLAYED");
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
//            Log.d("PLAYED", "PLAYED");
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

    /*
    This is the Sample Loading Page button. Sends context to the Sample Loading Page and moves to that activity
     */
    public void doSampleLoadingPage(View view){
        Intent intent = new Intent(this, SampleLoadingPage.class);
        intent.putStringArrayListExtra("files", files);
        intent.putStringArrayListExtra("filenames", filenames);
        intent.putStringArrayListExtra("trueFiles", trueFiles);
        intent.putExtra("Hashmap", kitHash);
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
            files.add(1, secondFiles.get(1));
            files.add(2, secondFiles.get(2));
            files.add(3, secondFiles.get(3));
            files.add(4, secondFiles.get(4));
            files.add(5, secondFiles.get(5));
            files.add(6, secondFiles.get(6));
            files.add(7, secondFiles.get(7));
            Log.d("files.0", files.get(0));
        }
        catch(Exception e){

        }
        //get the kit hashmap from the file on resume
        try {
            FileInputStream fileInputStream = new FileInputStream(kitFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            kitHash = (HashMap)objectInputStream.readObject();
            objectInputStream.close();
        }catch(ClassNotFoundException | IOException c){}
    }

    public void nameKit() {
        LayoutInflater li = LayoutInflater.from(this);
        final View dialogView = li.inflate(R.layout.dialog, null);
        AlertDialog.Builder db = new AlertDialog.Builder(this);
        db.setView(dialogView);
        db.setTitle("Name Kit");
        db.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                EditText text = dialogView.findViewById(R.id.name);
                String s = text.getText().toString();
//                Log.d("Kit is named", s);
                for(int i = 0; i < 8; i++){
//                    Log.d("SAMPLE " + String.valueOf(i), files.get(i));
                        saveKitFiles.add(i, files.get(i));
                        if(saveKitFiles.size() > 8){
                            saveKitFiles.subList(7, saveKitFiles.size()).clear();
                        }
                }
                kitHash.put(s, saveKitFiles.toString());
                Log.d("kitHash", kitHash.toString());
//                Log.d("KITFILE", kitFile.toString());
                try {
                    for (HashMap.Entry<String,String> entry : kitHash.entrySet()) {
                        properties.put(entry.getKey(), entry.getValue());
                    }
                    properties.store(new FileOutputStream(kitFile), null);

//                    Log.d("SAVED", "THIS WORKED");
                }catch(Exception e){ /*Log.d("NOT SAVED", "THIS DIDN'T WORK")*/;}
            }
        });
        db.show();
    }

    //the save kit button calls this function
    public void saveKitButton(View view){
        nameKit();
    }

    public void loadKit(View view){
        final String[] s = {""};
        LayoutInflater li = LayoutInflater.from(this);
        final View loadView = li.inflate(R.layout.loadkitdialog, null);
//        Log.d("truefiles", trueFiles.get(0).toString());
        //spinner with values that are keys of the hashmap (the kits)
        final Spinner loadspin = loadView.findViewById(R.id.dialogspin);
        List<String> keys = new ArrayList<>(kitHash.keySet());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, keys);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loadspin.setAdapter(adapter);
        AdapterView.OnItemSelectedListener listener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String string = loadspin.getSelectedItem().toString();
//                Log.d("STRING", string);
//                Log.d("kit at that value", kitHash.get(string));
                s[0] = string;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };

        loadspin.setOnItemSelectedListener(listener);
        AlertDialog.Builder db = new AlertDialog.Builder(this);
        db.setView(loadView);
        db.setTitle("Load Kit");
        db.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                try{
                    String[] list = kitHash.get(s[0]).split(",");
                    for(int k = 0; k < 8; k++){
                        list[k] = list[k].replaceAll("\\s+",".");
                        list[k] = list[k].replaceAll( "[\\[\\](){}]", "");
                        list[k] = list[k].trim();
                        Log.d(String.valueOf(k), list[k]);
                    }
                    files.add(0, list[0]);
                    files.add(1, list[1]);
                    files.add(2, list[2]);
                    files.add(3, list[3]);
                    files.add(4, list[4]);
                    files.add(5, list[5]);
                    files.add(6, list[6]);
                    files.add(7, list[7]);
                    //change the media players' data source
                    try {
                        mp1 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(0)));
                        mp2 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(1)));
                        mp3 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(2)));
                        mp4 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(3)));
                        mp5 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(4)));
                        mp6 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(5)));
                        mp7 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(6)));
                        mp8 = MediaPlayer.create(MainActivity.this, Uri.parse(files.get(7)));
                    }catch(Exception e){}
                }catch(Exception e){
                    files.add(0, trueFiles.get(0));
                    files.add(1, trueFiles.get(1));
                    files.add(2, trueFiles.get(2));
                    files.add(3, trueFiles.get(3));
                    files.add(4, trueFiles.get(4));
                    files.add(5, trueFiles.get(5));
                    files.add(6, trueFiles.get(6));
                    files.add(7, trueFiles.get(7));
                }
            }

        });
        db.show();
    }

    public void loadKitButton(View view){
        loadKit(view);
//        Log.d("YEP",files.get(0));
//        Log.d("YEP",files.get(1));
//        Log.d("YEP",files.get(2));
//        Log.d("YEP",files.get(3));
//        Log.d("YEP",files.get(4));
//        Log.d("YEP",files.get(5));
//        Log.d("YEP",files.get(6));
//        Log.d("YEP",files.get(7));
    }
}
