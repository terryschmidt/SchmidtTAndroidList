package com.transitiontose.schmidttandroidlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// Terry Schmidt, CSC472, Fall 2015

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = getIntent();
        if (intent != null) {
            TextView gameName = (TextView) findViewById(R.id.text1);
            TextView detailDescription = (TextView) findViewById(R.id.text2);
            ImageView coverImage = (ImageView) findViewById(R.id.image);

            gameName.setText(intent.getCharSequenceExtra("GameName"));
            detailDescription.setText(intent.getCharSequenceExtra("GameDescription"));
            coverImage.setImageResource(intent.getIntExtra("GameCover", -1));
        }
    }
}
