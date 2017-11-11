package edu.cmich.place1l.samplemusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.storage.FirebaseStorage;


// Ben testing commit through Android Studio.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseStorage storage = FirebaseStorage.getInstance();

    }
}
