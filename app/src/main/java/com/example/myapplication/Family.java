package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    private WordAdapter Family;
    private ListView listed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        listed=(ListView)findViewById(R.id.family);

        ArrayList<Word> familyMem=new ArrayList<Word>();
        familyMem.add(new Word("Mother","Maa",R.drawable.one));
        familyMem.add(new Word("Father","paa",R.drawable.two));
        familyMem.add(new Word("sister","didi",R.drawable.three));
        familyMem.add(new Word("brother","bhai",R.drawable.four));
        familyMem.add(new Word("Aunt","attya",R.drawable.five));
        familyMem.add(new Word("mama","Mamu",R.drawable.six));
        familyMem.add(new Word("Grandfather","dada",R.drawable.seven));
        familyMem.add(new Word("GrandMother","dadi",R.drawable.eight));
        familyMem.add(new Word("Myself","Apun khud",R.drawable.nine));

        Family=new WordAdapter(this,familyMem);
        listed.setAdapter(Family);
    }
}
