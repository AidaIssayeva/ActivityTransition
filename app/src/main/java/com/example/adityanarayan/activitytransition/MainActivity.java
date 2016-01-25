package com.example.adityanarayan.activitytransition;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView lv;
    Context context;

    public static int [] images={R.drawable.one,R.drawable.two,R.drawable.three};
    public static String [] names={"Number 1","Number 2","Number 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        lv=(RecyclerView) findViewById(R.id.lv);
        lv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
                lv.setAdapter(new customListAdapter(this, names, images));


    }



}
