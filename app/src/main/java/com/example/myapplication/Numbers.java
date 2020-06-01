package com.example.myapplication;

// import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Numbers extends AppCompatActivity {

   public android.util.Log Log;
   // private Object Word;
   private ListView listed;
    private WordAdapter mArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
       listed=(ListView) findViewById(R.id.list);


        ArrayList<Word> numberArray = new ArrayList<Word>();

        numberArray.add(new Word("One","mOne",R.drawable.one));
        numberArray.add(new Word("Two","mTwo",R.drawable.two));
        numberArray.add(new Word("Three","mThree",R.drawable.three));
        numberArray.add(new Word("Four","mFour",R.drawable.four));
        numberArray.add(new Word("Five","mFive",R.drawable.five));
        numberArray.add(new Word("Six","mSix",R.drawable.six));
        numberArray.add(new Word("Seven","mSeven",R.drawable.seven));
        numberArray.add(new Word("Eight","mEight",R.drawable.eight));
        numberArray.add(new Word("Nine","mNine",R.drawable.nine));
        mArray =new WordAdapter(this,numberArray);
        listed.setAdapter(mArray);

        Log.v("Numbers", "Working Fine 3");
    }
}

//  LinearLayout rootview=(LinearLayout)findViewById(R.id.RootView);
//TextView wordA=new TextView(this);

//        for (int i = 0; i < 9; i++) {
//            TextView wordA=new TextView(this);
//
//            wordA.setText(numberArray.get(i));
//            rootview.addView(wordA);
//            //    Log.v("Numbers", "Element at Index " + i + " " + numberArray.get(i));
//        }