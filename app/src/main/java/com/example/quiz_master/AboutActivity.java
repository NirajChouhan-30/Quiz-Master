package com.example.quiz_master;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    TextView txtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Setup toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable back arrow
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_242); // replace with your drawable
            getSupportActionBar().setTitle("About Us");
        }

        // Handle back arrow click
        toolbar.setNavigationOnClickListener(view -> onBackPressed());

        // Setup the clickable text
        txtLink = findViewById(R.id.txtLink);
        String fullText = "Click here to open notes and previous year papers";
        SpannableString spannableString = new SpannableString(fullText);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // Open your desired URL or activity here
                String url = "https://drive.google.com/drive/u/0/mobile/folders/1-0w4UMMNwPALyp4o-A3N1xv2VMZsjqBd"; // replace with your actual URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        };

        int start = fullText.indexOf("here");
        int end = start + "here".length();

        spannableString.setSpan(clickableSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtLink.setText(spannableString);
        txtLink.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
