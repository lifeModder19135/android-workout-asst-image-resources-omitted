package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class TricepsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "tricepsExerciseNumber";
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_detail);

        //get exercise from intent
        int tricepsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise tricepsExercise = Exercise.tricepsMoves[tricepsExerciseNumber];

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.triceps_photo);
        //photo.setImageResource(tricepsExercise.getImageResourceId());
        //photo.setContentDescription(tricepsExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(tricepsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(tricepsExercise.getDescription());
    }
}
