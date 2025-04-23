package com.example.quiz_master;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    private TextView congratsMessage, subjectText, correctText, incorrectText, dateText;
    private Button finishButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Initialize views
        congratsMessage = findViewById(R.id.congratsMessage);
        subjectText = findViewById(R.id.subjectText);
        correctText = findViewById(R.id.correctText);
        incorrectText = findViewById(R.id.incorrectText);
        dateText = findViewById(R.id.dateText);
        finishButton = findViewById(R.id.finishButton);
        backButton = findViewById(R.id.backButton);

        // Get data from intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int total = intent.getIntExtra("total", 0);
        String subject = intent.getStringExtra("subject");
        String username = intent.getStringExtra("username");

        // Calculate incorrect answers
        int incorrect = total - score;

        // Set data to views
        congratsMessage.setText("Welldone " + (username != null ? username.toLowerCase() : "user"));
        subjectText.setText(subject != null ? subject : "Quiz");
        correctText.setText(String.valueOf(score));
        incorrectText.setText(String.valueOf(incorrect));

        // Set current date and time
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        String currentDateTime = sdf.format(new Date());
        dateText.setText(currentDateTime);

        // Store quiz history
        storeQuizHistory(subject, score, total, currentDateTime);

        // Set click listeners
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Return to main activity or exit app
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void storeQuizHistory(String subject, int score, int totalQuestions, String date) {
        SharedPreferences sharedPreferences = getSharedPreferences("QuizHistory", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        String json = sharedPreferences.getString("historyList", null);
        Type type = new TypeToken<ArrayList<HistoryItem>>() {}.getType();
        List<HistoryItem> historyList = gson.fromJson(json, type);

        if (historyList == null) {
            historyList = new ArrayList<>();
        }

        HistoryItem newHistoryItem = new HistoryItem(subject, score, totalQuestions, date);
        historyList.add(newHistoryItem);

        String jsonHistory = gson.toJson(historyList);
        editor.putString("historyList", jsonHistory);
        editor.apply();
    }
}

