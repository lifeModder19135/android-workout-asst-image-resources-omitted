package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class BicepsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "bicepsExerciseNumber";
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_detail);

        //get exercise from intent
        int bicepsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise bicepsExercise = Exercise.bicepsMoves[bicepsExerciseNumber];

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.biceps_photo);
        //photo.setImageResource(bicepsExercise.getImageResourceId());
        //photo.setContentDescription(bicepsExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(bicepsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(bicepsExercise.getDescription());
    }
}
