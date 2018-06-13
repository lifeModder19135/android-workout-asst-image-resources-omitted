package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.flacoapps.workoutassistant2.R;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent_back = new Intent(TopLevelActivity.this, BackCategoryActivity.class);
                        startActivity(intent_back);
                        break;
                    case 1:
                        Intent intent_chest = new Intent(TopLevelActivity.this, ChestCategoryActivity.class);
                        startActivity(intent_chest);
                        break;
                    case 2:
                        Intent intent_shoulders = new Intent(TopLevelActivity.this, ShouldersCategoryActivity.class);
                        startActivity(intent_shoulders);
                        break;
                    case 3:
                        Intent intent_biceps = new Intent(TopLevelActivity.this, BicepsCategoryActivity.class);
                        startActivity(intent_biceps);
                        break;
                    case 4:
                        Intent intent_triceps = new Intent(TopLevelActivity.this, TricepsCategoryActivity.class);
                        startActivity(intent_triceps);
                        break;
                    case 5:
                        Intent intent_forearms = new Intent(TopLevelActivity.this, ForearmsCategoryActivity.class);
                        startActivity(intent_forearms);
                        break;
                    case 6:
                        Intent intent_abs = new Intent(TopLevelActivity.this, AbsCategoryActivity.class);
                        startActivity(intent_abs);
                        break;
                    case 7:
                        Intent intent_legs = new Intent(TopLevelActivity.this, LegsCategoryActivity.class);
                        startActivity(intent_legs);
                        break;
                    default:
                        break;

                }
            }
        };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
