package com.chippy.letsandroid.tour_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Resources res;
    ArrayAdapter<String> ad;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);lv = (ListView) findViewById(R.id.listView1);
        res = getResources();
        String[] mainArray = res.getStringArray(R.array.Main);
        ad =new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,mainArray);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?
                    > parent, View view, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch (position)
                {
                    case 0:
                        k=1;
                        Intent i=new Intent(MainActivity.this,Display.class);
                        i.putExtra("key", k);
                        startActivity(i);
                        break;
                    case 1:
                        k=2;
                        Intent b=new Intent(MainActivity.this,Display.class);
                        b.putExtra("key", k);
                        startActivity(b);
                        break;
                    case 2:
                        k=3;
                        Intent c=new Intent(MainActivity.this,Display.class);
                        c.putExtra("key", k);
                        startActivity(c);;
                        break;
                    case 3:
                        k=4;
                        Intent d=new Intent(MainActivity.this,Display.class);
                        d.putExtra("key", k);
                        startActivity(d);;
                        break;
                }}}
        );

    }
}

