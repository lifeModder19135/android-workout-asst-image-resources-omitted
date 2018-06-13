package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShouldersCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listShouldersMoves = getListView();

        ArrayAdapter<Exercise> listAdapter = new ArrayAdapter<Exercise>(
                this,
                android.R.layout.simple_list_item_1,
                Exercise.shouldersMoves
        );

        listShouldersMoves.setAdapter(listAdapter);
    }
}
