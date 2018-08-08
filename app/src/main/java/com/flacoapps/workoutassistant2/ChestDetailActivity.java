package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class ChestDetailActivity extends Activity {

    public static final String EXTRA_INFO = "chestExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= ChestDetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_detail);

        //get exercise from intent
        int chestExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise chestExercise = Exercise.chestMoves[chestExerciseNumber];

        switch (chestExerciseNumber){
            case 0: webViewName = "back_fly";
                break;
            case 1: webViewName = "bent_arm_pullover";
                break;
            case 2: webViewName = "decline_bench_press";
                break;
            case 3: webViewName = "neutral_grip_decline_bench_press";
                break;
            case 4: webViewName = "incline_bench_press";
                break;
            case 5: webViewName = "incline_fly";
                break;
            case 6: webViewName = "lying_fly";
                break;
            case 7: webViewName = "neutral_grip_incline_bench_press";
                break;
            case 8: webViewName = "neutral_grip_bench_press";
                break;
            case 9: webViewName = "straight_arm_pullover";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.chest_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e)
        {
            Log.d(TAG, String.valueOf(e));
        }

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.chest_photo);
        //photo.setImageResource(chestExercise.getImageResourceId());
        //photo.setContentDescription(chestExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(chestExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(chestExercise.getDescription());
    }
}
