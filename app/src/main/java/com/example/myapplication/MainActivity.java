package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NumberPage(View view) {
        Intent intent=new Intent(this,Numbers.class);
        startActivity(intent);
    }

    public void FamilyPage(View view) {
        Intent intent=new Intent(this,Family.class);
        startActivity(intent);
    }
}
