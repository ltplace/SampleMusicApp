package edu.cmich.place1l.samplemusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


// Ben testing commit through Android Studio.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating the reference to Firebase Storage.
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();

        //Within Firebase storage there is a head folder called audio. audioRef now is a reference to that.
        StorageReference audioRef = storageRef.child("audio");

        // Within the Audio folder there is (there will exist more in the future) a kit1 folder. T
        // this is a reference to it through the audioRef reference.
        // Maybe add this later on.
        // StorageReference kit1 = audioRef.child("kit1");
    }


    protected void onBtn1Click(View v) {

        

    }
}