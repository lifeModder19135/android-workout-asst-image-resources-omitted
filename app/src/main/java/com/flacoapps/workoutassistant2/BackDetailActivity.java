package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class BackDetailActivity extends Activity {

    public static final String EXTRA_INFO = "backExerciseNumber" ;
    WebView webView;
    String webViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_detail);

        //get exercise from intent
        int backExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise backExercise = Exercise.backMoves[backExerciseNumber];

        switch (backExerciseNumber){
            case 0: webViewName = "back_fly";
                break;
            case 1: webViewName = "bend_to_opposite_foot";
                break;
            case 2: webViewName = "bent_over_row";
                break;
            case 3: webViewName = "dead_lift";
                break;
            case 4: webViewName = "kneeling_one_arm_row";
                break;
            case 5: webViewName = "one_arm_row";
                break;
            case 6: webViewName = "twisting_bend_to_opposite_foot";
                break;
            case 7: webViewName = "stiff_legged_dead_lift";
                break;
            case 8: webViewName = "stiff_legged_dead_lift";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.abs_webview);
        webView.loadUrl("file:///android_asset/" + webViewName +".html");

        //populate exercise image
        ImageView photo = (ImageView) findViewById(R.id.back_photo);
        photo.setImageResource(backExercise.getImageResourceId());
        photo.setContentDescription(backExercise.getName());

        //populate exercise name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(backExercise.getName());

        //populate exercise description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(backExercise.getDescription());
    }
}
