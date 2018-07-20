package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChestDetailActivity extends Activity {

    public static final String EXTRA_INFO = "chestExerciseNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_detail);

        //get exercise from intent
        int chestExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise chestExercise = Exercise.chestMoves[chestExerciseNumber];

        //populate exercise image
        ImageView photo = (ImageView) findViewById(R.id.chest_photo);
        photo.setImageResource(chestExercise.getImageResourceId());
        photo.setContentDescription(chestExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(chestExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(chestExercise.getDescription());
    }
}
