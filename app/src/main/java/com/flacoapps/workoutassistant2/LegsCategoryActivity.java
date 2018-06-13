package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LegsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listLegsMoves = getListView();

        ArrayAdapter<Exercise> listAdapter = new ArrayAdapter<Exercise>(
                this,
                android.R.layout.simple_list_item_1,
                Exercise.legsMoves
        );

        listLegsMoves.setAdapter(listAdapter);
    }
}
