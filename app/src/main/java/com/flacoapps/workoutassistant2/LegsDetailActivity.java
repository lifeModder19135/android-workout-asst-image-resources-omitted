package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class LegsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "legsExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= LegsDetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_detail);

        //get exercise from intent
        int legsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise legsExercise = Exercise.legsMoves[legsExerciseNumber];

        switch (legsExerciseNumber){
            case 0: webViewName = "dumbbell_swing_through";
                break;
            case 1: webViewName = "one_legged_toe_raise";
                break;
            case 2: webViewName = "reverse_lunge";
                break;
            case 3: webViewName = "seated_one_legged_toe_raise";
                break;
            case 4: webViewName = "side_lunge";
                break;
            case 5: webViewName = "squat";
                break;
            case 6: webViewName = "stationary_lunge";
                break;
            case 7: webViewName = "stiff_legged_dead_lift";
                break;
            case 8: webViewName = "toe_raise";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.legs_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e)
        {
            Log.d(TAG, String.valueOf(e));
        }

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.legs_photo);
        //photo.setImageResource(legsExercise.getImageResourceId());
        //photo.setContentDescription(legsExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(legsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(legsExercise.getDescription());
    }
}
