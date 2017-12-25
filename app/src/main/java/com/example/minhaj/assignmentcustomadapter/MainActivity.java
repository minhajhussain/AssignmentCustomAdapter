package com.example.minhaj.assignmentcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.layout.simple_expandable_list_item_1;
import static android.R.layout.simple_list_item_1;
import static android.R.layout.simple_list_item_2;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Mtag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);

        String collection[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};

        for(String str : collection)
        {
            ListView list = (ListView) findViewById(R.id.list2);
            Log.d(TAG, "onCreate:list view ");
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.custom_layout, collection);
            list.setAdapter(arrayAdapter);
        }
    }
}
