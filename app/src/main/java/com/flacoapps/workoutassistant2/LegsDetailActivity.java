package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LegsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "legsExerciseNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_detail);

        //get exercise from intent
        int legsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise legsExercise = Exercise.legsMoves[legsExerciseNumber];

        //populate exercise image
        ImageView photo = (ImageView) findViewById(R.id.legs_photo);
        photo.setImageResource(legsExercise.getImageResourceId());
        photo.setContentDescription(legsExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(legsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(legsExercise.getDescription());
    }
}
