package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class ForearmsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "forearmsExerciseNumber";
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearms_detail);

        //get exercise from intent
        int forearmsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise forearmsExercise = Exercise.forearmsMoves[forearmsExerciseNumber];

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.forearms_photo);
        //photo.setImageResource(forearmsExercise.getImageResourceId());
        //photo.setContentDescription(forearmsExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(forearmsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(forearmsExercise.getDescription());
    }
}
