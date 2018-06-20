package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BackDetailActivity extends Activity {

    public static final String EXTRA_INFO = "backExerciseNumber" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_detail);

        //get exercise from intent
        int backExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise backExercise = Exercise.backMoves[backExerciseNumber];

        //populate exercise image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(backExercise.getImageResourceId());
        photo.setContentDescription(backExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(backExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(backExercise.getDescription());
    }
}
