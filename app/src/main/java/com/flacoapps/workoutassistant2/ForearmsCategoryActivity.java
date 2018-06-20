package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ForearmsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listForearmsMoves = getListView();

        ArrayAdapter<Exercise> listAdapter = new ArrayAdapter<Exercise>(
                this,
                android.R.layout.simple_list_item_1,
                Exercise.forearmsMoves
        );

        listForearmsMoves.setAdapter(listAdapter);
    }

    // tells android what to do when a list item is clicked
   /* @Override
    public void onListItemClick (ListView listView,
                                 View itemView,
                                 int position,
                                 long id) {
        Intent intent = new Intent(ForearmsCategoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_INFO, (int) id);
        startActivity(intent);
    }*/
}
