package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AbsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "absExerciseNumber" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_detail);

        //get exercise from intent
        int exerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise absExercise = Exercise.absMoves[exerciseNumber];

        //populate exercise image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(absExercise.getImageResourceId());
        photo.setContentDescription(absExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(absExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(absExercise.getDescription());
    }
}
