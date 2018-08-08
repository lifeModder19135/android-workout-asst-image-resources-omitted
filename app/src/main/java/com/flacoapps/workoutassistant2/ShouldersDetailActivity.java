package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class ShouldersDetailActivity extends Activity {

    public static final String EXTRA_INFO = "shouldersExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= ShouldersDetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders_detail);

        //get exercise from intent
        int shouldersExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise shouldersExercise = Exercise.shouldersMoves[shouldersExerciseNumber];

        switch (shouldersExerciseNumber){
            case 0: webViewName = "bent_over_rear_deltoid_raise";
                break;
            case 1: webViewName = "bent_over_one_arm_deltoid_raise";
                break;
            case 2: webViewName = "chrouched_rear_deltoid_row";
                break;
            case 3: webViewName = "front_raise";
                break;
            case 4: webViewName = "lateral_raise";
                break;
            case 5: webViewName = "palms_in_shoulder_press";
                break;
            case 6: webViewName = "push_press";
                break;
            case 7: webViewName = "rear_deltoid_circle";
                break;
            case 8: webViewName = "rear_deltoid_raise";
                break;
            case 9: webViewName = "seated_shoulder_press";
                break;
            case 10: webViewName = "seated_side_lateral_raise";
                break;
            case 11: webViewName = "shoulder_press";
                break;
            case 12: webViewName = "shoulder_shrug";
                break;
            case 13: webViewName = "straight_arm_front_deltoid_raise";
                break;
            case 14: webViewName = "upright_row";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.shoulders_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e)
        {
            Log.d(TAG, String.valueOf(e));
        }

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
