package com.sdsmdg.hareshkh.lectureassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<movie_items> mov=new ArrayList<>();
        mov.add(new movie_items("Resident Evil Final Chapter","Feb 3 2017",R.drawable.m1));
        mov.add(new movie_items("Assassin's Creed","Dec 30 2016",R.drawable.asscreed));
        mov.add(new movie_items("Bye Bye Man","Jan 20 2017",R.drawable.byebyeman));
        mov.add(new movie_items("Moana","Dec 2 2016",R.drawable.moana));
        mov.add(new movie_items("Passengers","Jan 6 2017",R.drawable.passengers));
        mov.add(new movie_items("The Great Wall","Feb 3 2017",R.drawable.thegreatwall));
        mov.add(new movie_items("XXX : The Return of Xander Cage","Jan 14 2017",R.drawable.xxxretofxandercage));
        mov.add(new movie_items("Arrival","Feb 3 2017",R.drawable.arrival));
        arrayadapter adapter=new arrayadapter(mov);
        RecyclerView recylView=(RecyclerView)findViewById(R.id.recyl);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recylView.setLayoutManager(horizontalLayoutManagaer);
        recylView.setAdapter(adapter);
    }
}
