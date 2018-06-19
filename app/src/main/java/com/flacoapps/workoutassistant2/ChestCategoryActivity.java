package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    // tells android what to do when a list item is clicked
    @Override
    public void onListItemClick (ListView listView,
                                 View itemView,
                                 int position,
                                 long id) {
        Intent intent = new Intent(ChestCategoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_INFO, (int) id);
        startActivity(intent);
    }
}
