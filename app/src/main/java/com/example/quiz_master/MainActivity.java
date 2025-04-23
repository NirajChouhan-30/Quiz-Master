package com.example.quiz_master;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardStartQuiz, cardRules, cardHistory, cardAbout, cardExit;
    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        cardStartQuiz = findViewById(R.id.cardStartQuiz);
        cardRules = findViewById(R.id.cardRules);
        cardHistory = findViewById(R.id.cardHistory);
        cardAbout = findViewById(R.id.cardAbout);
        cardExit = findViewById(R.id.cardExit);
        tvWelcome = findViewById(R.id.tvWelcome);

        // Get the username from intent and set welcome text
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            tvWelcome.setText("Hello " + username);
        }

        // Set onClickListeners
        cardStartQuiz.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, StartQuizActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        });

        cardRules.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RulesActivity.class);
            startActivity(intent);
        });

        cardHistory.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(intent);
        });

        cardAbout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        });

        cardExit.setOnClickListener(view -> showExitConfirmation());
    }

    // Custom-styled exit confirmation dialog
    private void showExitConfirmation() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Quiz Master App");
        builder.setMessage("Would you like to leave?");
        builder.setCancelable(false);

        builder.setPositiveButton("YES", (dialog, which) -> {
            dialog.dismiss();
            finishAffinity(); // Close the app completely
        });

        builder.setNegativeButton("NO", (dialog, which) -> dialog.dismiss());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        // Optional: Change button text colors (requires API 23+ or compatible with AppCompat)
        alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.blue_med));
        alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.peach));
    }
}
