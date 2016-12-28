package com.chippy.letsandroid.tour_guide;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.ListView;
public class Display extends AppCompatActivity {
    int value;
    Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = getResources();
        Intent j = getIntent();
        value = j.getIntExtra("key", 0);
        ArrayList<Tour> tourList = new ArrayList<Tour>();
        if(value==1){
            String[] mainArray = res.getStringArray(R.array.Places);
            tourList.add(new Tour(mainArray[0], mainArray[1],mainArray[2], R.drawable.i1));
            tourList.add(new Tour(mainArray[3], mainArray[4],mainArray[5], R.drawable.i2));
            tourList.add(new Tour(mainArray[6], mainArray[7],mainArray[8], R.drawable.i3));
            tourList.add(new Tour(mainArray[9], mainArray[10],mainArray[11], R.drawable.i4));
            tourList.add(new Tour(mainArray[12], mainArray[13],mainArray[14], R.drawable.i5));
        }
        if(value==2){
            String[] mainArray = res.getStringArray(R.array.Hotels);
            tourList.add(new Tour(mainArray[0], mainArray[1],mainArray[2], R.drawable.i6));
            tourList.add(new Tour(mainArray[3], mainArray[4],mainArray[5], R.drawable.i7));
            tourList.add(new Tour(mainArray[6], mainArray[7],mainArray[8], R.drawable.i8));
            tourList.add(new Tour(mainArray[9], mainArray[10],mainArray[11], R.drawable.i9));
        }
        if(value==3){
            String[] mainArray = res.getStringArray(R.array.Malls);
            tourList.add(new Tour(mainArray[0], mainArray[1],mainArray[2], R.drawable.i10));
            tourList.add(new Tour(mainArray[3], mainArray[4],mainArray[5], R.drawable.i11));
            tourList.add(new Tour(mainArray[6], mainArray[7],mainArray[8], R.drawable.i12));
            tourList.add(new Tour(mainArray[9], mainArray[10],mainArray[11], R.drawable.i13));
            tourList.add(new Tour(mainArray[12], mainArray[13],mainArray[14], R.drawable.i14));
        }
        if(value==4){
            String[] mainArray = res.getStringArray(R.array.Arts);
            tourList.add(new Tour(mainArray[0], mainArray[1],mainArray[2], R.drawable.i15));
            tourList.add(new Tour(mainArray[3], mainArray[4],mainArray[5], R.drawable.i16));
            tourList.add(new Tour(mainArray[6], mainArray[7],mainArray[8], R.drawable.i17));
            tourList.add(new Tour(mainArray[9], mainArray[10],mainArray[11], R.drawable.i18));

        }
        TourGuideAdapter flavorAdapter = new TourGuideAdapter(this,tourList);
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(flavorAdapter);
    }

}
