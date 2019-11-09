package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class img_act extends AppCompatActivity {
    ListView lview;

    public void fade(View view){
//        ImageView pulwama=(ImageView) findViewById(R.id.pulwama);
//        ImageView uri=(ImageView) findViewById(R.id.uri);
//        pulwama.animate().alpha(0f).setDuration(2000);
//        uri.animate().alpha(1f).setDuration(2000);
    }
    void add_item(){
        lview=(ListView) findViewById(R.id.lview);
        ArrayList<String> al=new ArrayList<String>();
        al.add("bitcoin to inr");
        al.add("bitcoin to euro");
        al.add("bitcoin to dollar");
        al.add("bitcoin to dinar");

        ArrayAdapter ar_adapt = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,al);
        lview.setAdapter(ar_adapt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_act);

        add_item();

    }
}
