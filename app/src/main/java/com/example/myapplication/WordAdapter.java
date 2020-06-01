package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class WordAdapter extends ArrayAdapter<Word> {

    private Context mcontext;
    private ArrayList<Word> NumbersList = new ArrayList<>();

    public WordAdapter(Context mcontext, ArrayList<Word> NumbersList) {
        super(mcontext, 0, NumbersList);
        this.mcontext = mcontext;
        this.NumbersList = NumbersList;
    }

    //Word NumberList=new Word();


//    public WordAdapter(@NonNull Context context, ArrayList<Word> resource) {
    //    super(context, Integer.parseInt(String.valueOf(resource)));
    //  }

    //public WordAdapter(@NonNull Context context, int resource, @NonNull Word[] objects) {
    //  super(context, resource, objects);
    //}


    // @NonNull


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(mcontext).inflate(R.layout.listitem, parent, false);
        }

        Word CurrentWord = NumbersList.get(position);
        TextView currentText=listView.findViewById(R.id.english);
        currentText.setText(CurrentWord.getDefaultTranslation());
        TextView MiwokText=listView.findViewById(R.id.translation);
        MiwokText.setText(CurrentWord.getMiwokTranslation());
        ImageView imageN=(ImageView)listView.findViewById(R.id.images);
        imageN.setImageResource(CurrentWord.getmImage());
         return listView;
      //  return super.getView(position, convertView, parent);
    }
}
