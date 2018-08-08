package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class BicepsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "bicepsExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= BicepsDetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_detail);

        //get exercise from intent
        int bicepsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise bicepsExercise = Exercise.bicepsMoves[bicepsExerciseNumber];

        switch (bicepsExerciseNumber) {
            case 0: webViewName = "alternating_biceps_curl";
                break;
            case 1: webViewName = "bench_alternated_biceps_curl";
                break;
            case 2: webViewName = "biceps_curl";
                break;
            case 3: webViewName = "concentrated_biceps_curl";
                break;
            case 4: webViewName = "hammer_curl";
                break;
            case 5: webViewName = "incline_biceps_bench_curl";
                break;
            case 6: webViewName = "incline_biceps_curl";
                break;
            case 7: webViewName = "inclined_alternated_biceps_curl";
                break;
            case 8: webViewName = "inner_biceps_curl";
                break;
            case 9: webViewName = "palms_forward_preacher_biceps_curl";
                break;
            case 10: webViewName = "palms_neutral_preacher_biceps_curl";
                break;
            case 11: webViewName = "seated_alternated_biceps_curl";
                break;
            case 12: webViewName = "seated_biceps_curl";
                break;
            case 13: webViewName = "seated_concentrated_curl";
                break;
            case 14: webViewName = "seated_inner_biceps_curl";
                break;
            case 15: webViewName = "seated_isolated_curl";
                break;
            case 16: webViewName = "supine_biceps_curl";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.biceps_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e)
        {
            Log.d(TAG, String.valueOf(e));
        }

        //populate exercise image
        //ImageView photo = (ImageView) findViewById(R.id.biceps_photo);
        //photo.setImageResource(bicepsExercise.getImageResourceId());
        //photo.setContentDescription(bicepsExercise.getName());

        //populate exercise name
        TextView name = findViewById(R.id.name);
        name.setText(bicepsExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(bicepsExercise.getDescription());
    }
}
