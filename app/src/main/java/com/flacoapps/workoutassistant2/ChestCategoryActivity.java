package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChestCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listChestMoves = getListView();

        ArrayAdapter<Exercise> listAdapter = new ArrayAdapter<Exercise>(
                this,
                android.R.layout.simple_list_item_1,
                Exercise.chestMoves
        );

        listChestMoves.setAdapter(listAdapter);
    }
}
