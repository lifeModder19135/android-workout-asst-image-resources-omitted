package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class ShouldersDetailActivity extends Activity {

    public static final String EXTRA_INFO = "shouldersExerciseNumber";
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders_detail);

        //get exercise from intent
        int shouldersExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise shouldersExercise = Exercise.shouldersMoves[shouldersExerciseNumber];

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.shoulders_photo);
        //photo.setImageResource(shouldersExercise.getImageResourceId());
        //photo.setContentDescription(shouldersExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(shouldersExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(shouldersExercise.getDescription());
    }
}
