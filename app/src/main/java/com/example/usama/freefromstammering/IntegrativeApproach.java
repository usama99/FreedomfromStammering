package com.example.usama.freefromstammering;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Objects;

public class IntegrativeApproach extends AppCompatActivity {

    ImageView backTech7;
    LinearLayout articleTech7, videoTech7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_integrative_approach);
        backTech7 = findViewById(R.id.backtotech7);
        articleTech7 = findViewById(R.id.articletech7);
        videoTech7 = findViewById(R.id.videotech7);

        backTech7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        articleTech7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtTech7 = new Intent(IntegrativeApproach.this, ArticleTech7.class);
                intentArtTech7.putExtra("tech7", "http://www.mnsu.edu/comdis/isad/papers/healey.html");
                startActivity(intentArtTech7);
            }
        });

        videoTech7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntentTech7 = new Intent(Intent.ACTION_VIEW);
                playIntentTech7.setData(Uri.parse("https://www.youtube.com/watch?v=fpUNwTVjFg4"));
                playIntentTech7.putExtra("force_fullscreen", true);
                Toast.makeText(IntegrativeApproach.this, "Long podcast, requires patience", Toast.LENGTH_LONG).show();
                startActivity(playIntentTech7);
            }
        });
    }
}