package com.flacoapps.workoutassistant2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class ForearmsDetailActivity extends Activity {

    public static final String EXTRA_INFO = "forearmsExerciseNumber";
    WebView webView;
    String webViewName;
    private static final String TAG= ForearmsDetailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearms_detail);

        //get exercise from intent
        int forearmsExerciseNumber = (Integer) getIntent().getExtras().get(EXTRA_INFO);
        Exercise forearmsExercise = Exercise.forearmsMoves[forearmsExerciseNumber];

        switch (forearmsExerciseNumber){
            case 0: webViewName = "one_arm_palm_down_wrist_curl";
                break;
            case 1: webViewName = "one_arm_palm_up_wrist_curl";
                break;
            case 2: webViewName = "palms_down_wrist_curl";
                break;
            case 3: webViewName = "palms_up_wrist_curl";
                break;
        }

        //populate webView
        webView = (WebView) findViewById(R.id.forearms_webview);
        try {
            webView.loadUrl("file:///android_asset/" + webViewName +".html"/*"file:///android_asset/back_fly.html"*/);
        }
        catch (Exception e)
        {
            Log.d(TAG, String.valueOf(e));
        }

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
