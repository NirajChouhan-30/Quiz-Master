package com.example.quiz_master;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bumptech.glide.Glide;  // Import Glide

public class RulesActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView backArrow, gifImageView;  //Add Gif Image View

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        gifImageView = findViewById(R.id.gifImageView);  // Find the GIF ImageView

        // Load GIF using Glide
        Glide.with(this)
                .asGif()
                .load(R.drawable.hello)  // Replace with your GIF resource
                .into(gifImageView);
    }
}