package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class AbsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "absExerciseNumber" ;
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_detail);

        //get exercise from intent
        int exerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise absExercise = Exercise.absMoves[exerciseNumber];

        switch (exerciseNumber){
            case 0: webViewName = "weighted_leg_raise";
                break;
            case 1: webViewName = "dumbbell_side_bend";
                break;
            case 2: webViewName = "weighted_crunch";
                break;
        }

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.abs_photo);
        //photo.setImageResource(absExercise.getImageResourceId());
        //photo.setContentDescription(absExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(absExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(absExercise.getDescription());

        //populate webView
        webView = (WebView) findViewById(R.id.abs_webview);
        webView.loadUrl("file:///android_asset/" + webViewName +".html");
    }
}
