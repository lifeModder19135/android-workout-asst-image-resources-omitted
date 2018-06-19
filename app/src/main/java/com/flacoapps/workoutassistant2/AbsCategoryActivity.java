package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class AbsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listAbsMoves = getListView();

        ArrayAdapter<Exercise> listAdapter = new ArrayAdapter<Exercise>(
                this,
                android.R.layout.simple_list_item_1,
                Exercise.absMoves
        );

        listAbsMoves.setAdapter(listAdapter);
    }

    // tells android what to do when a list item is clicked
    @Override
    public void onListItemClick (ListView listView,
                                 View itemView,
                                 int position,
                                 long id) {
        Intent intent = new Intent(AbsCategoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_INFO, (int) id);
        startActivity(intent);
    }

}
