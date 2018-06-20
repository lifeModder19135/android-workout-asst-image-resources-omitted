package com.flacoapps.workoutassistant2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    // tells android what to do when a list item is clicked
    @Override
    public void onListItemClick (ListView listView,
                                 View itemView,
                                 int position,
                                 long id) {
        Intent intent = new Intent(ShouldersCategoryActivity.this, ShouldersDetailActivity.class);
        intent.putExtra(ShouldersDetailActivity.EXTRA_INFO, (int) id);
        startActivity(intent);
    }
}
