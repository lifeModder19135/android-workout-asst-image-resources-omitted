package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class TricepsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "tricepsExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= TricepsCategoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_detail);

        //get exercise from intent
        int tricepsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise tricepsExercise = Exercise.tricepsMoves[tricepsExerciseNumber];

        switch (tricepsExerciseNumber){
            case 0: webViewName = "bent_over_one_arm_triceps_extension";
                break;
            case 1: webViewName = "lying_triceps_extension";
                break;
            case 2: webViewName = "one_arm_triceps_extension";
                break;
            case 3: webViewName = "seated_triceps_extension";
                break;
            case 4: webViewName = "triceps_bench_press";
                break;
            case 5: webViewName = "triceps_kickbacks";
                break;
            case 6: webViewName = "two_arms_triceps_extension";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.triceps_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e) {
            Log.d(TAG, String.valueOf(e));
        }

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
