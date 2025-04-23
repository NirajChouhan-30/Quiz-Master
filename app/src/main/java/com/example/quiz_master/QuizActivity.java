package com.example.quiz_master;




import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView questionText, timerText, questionCounterText;
    private TextView optionAText, optionBText, optionCText, optionDText;
    private CardView optionA, optionB, optionC, optionD;
    private View nextButton;

    private ProgressBar progressBar;
    private ImageView backArrow;

    private CountDownTimer countDownTimer;
    private int questionIndex = 0;
    private int score = 0;
    private List<String> shuffledQuestions;
    private HashMap<String, String[]> questionBank;
    private HashMap<String, String> answerKey;
    private String selectedAnswer = "";
    private boolean answered = false;

    private final int QUIZ_SIZE = 20;

    private List<String> allQuestions;       // All questions from the question bank
    private List<String> displayedQuestions; // The subset of questions used in the current quiz session

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        String username = getIntent().getStringExtra("username");

        String quizTopic = getIntent().getStringExtra("quiz_topic");

        questionText = findViewById(R.id.questionText);
        timerText = findViewById(R.id.timerText);
        questionCounterText = findViewById(R.id.questionCounterText);
        nextButton = findViewById(R.id.nextButton);
        progressBar = findViewById(R.id.progressBar);
        backArrow = findViewById(R.id.backArrow);

        optionA = findViewById(R.id.option1);
        optionB = findViewById(R.id.option2);
        optionC = findViewById(R.id.option3);
        optionD = findViewById(R.id.option4);

        optionAText = findViewById(R.id.option1Text);
        optionBText = findViewById(R.id.option2Text);
        optionCText = findViewById(R.id.option3Text);
        optionDText = findViewById(R.id.option4Text);

        questionBank = QuestionBank.getQuestions(quizTopic);
        answerKey = QuestionBank.getAnswers(quizTopic);

        allQuestions = new ArrayList<>(questionBank.keySet());
        Collections.shuffle(allQuestions);

        // Select only the first QUIZ_SIZE questions
        displayedQuestions = allQuestions.subList(0, Math.min(QUIZ_SIZE, allQuestions.size()));
        updateProgressBar();

        startTimer();
        loadQuestion();

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View.OnClickListener optionClickListener = view -> {
            if (!answered) {
                answered = true;
                CardView selectedCard = (CardView) view;
                TextView selectedText = (TextView) selectedCard.getChildAt(0);
                selectedAnswer = selectedText.getText().toString();
                showAnswerFeedback(selectedCard);
            }
        };

        optionA.setOnClickListener(optionClickListener);
        optionB.setOnClickListener(optionClickListener);
        optionC.setOnClickListener(optionClickListener);
        optionD.setOnClickListener(optionClickListener);

        nextButton.setOnClickListener(v -> {
            if (!answered) return;

            questionIndex++;
            if (questionIndex < displayedQuestions.size()) {
                loadQuestion();
            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total", displayedQuestions.size());

                // Add these lines to pass additional data
                intent.putExtra("subject", getIntent().getStringExtra("quiz_topic")); // Get the subject/topic
                intent.putExtra("username", username); // Replace with actual username retrieval

                startActivity(intent);
                finish();
            }
        });
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(600000, 1000) {
            public void onTick(long millisUntilFinished) {
                int minutes = (int) millisUntilFinished / 60000;
                int seconds = (int) (millisUntilFinished % 60000) / 1000;
                timerText.setText(String.format("%02d:%02d", minutes, seconds));
            }

            public void onFinish() {
                Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total", displayedQuestions.size());

                // Add these lines to pass additional data
                intent.putExtra("subject", getIntent().getStringExtra("quiz_topic")); // Get the subject/topic
                intent.putExtra("username", "niraj"); // Replace with actual username retrieval

                startActivity(intent);
                finish();
            }
        }.start();
    }

    private void loadQuestion() {
        String question = displayedQuestions.get(questionIndex);
        String[] options = questionBank.get(question);

        questionText.setText(question);
        optionAText.setText(options[0]);
        optionBText.setText(options[1]);
        optionCText.setText(options[2]);
        optionDText.setText(options[3]);

        questionCounterText.setText("Question: " + (questionIndex + 1));
        selectedAnswer = "";
        answered = false;

        resetCardColors();
    }

    private void resetCardColors() {
        int defaultColor = getResources().getColor(R.color.white, null);
        optionA.setCardBackgroundColor(defaultColor);
        optionB.setCardBackgroundColor(defaultColor);
        optionC.setCardBackgroundColor(defaultColor);
        optionD.setCardBackgroundColor(defaultColor);
    }

    private void showAnswerFeedback(CardView selectedCard) {
        String correctAnswer = answerKey.get(displayedQuestions.get(questionIndex));
        TextView selectedText = (TextView) selectedCard.getChildAt(0);

        if (selectedText.getText().toString().equals(correctAnswer)) {
            selectedCard.setCardBackgroundColor(Color.parseColor("#A5D6A7")); // Green
            score++;
        } else {
            selectedCard.setCardBackgroundColor(Color.parseColor("#EF9A9A")); // Red
            highlightCorrectAnswer(correctAnswer);
        }
    }

    private void highlightCorrectAnswer(String correctAnswer) {
        if (optionAText.getText().toString().equals(correctAnswer)) {
            optionA.setCardBackgroundColor(Color.parseColor("#A5D6A7"));
        } else if (optionBText.getText().toString().equals(correctAnswer)) {
            optionB.setCardBackgroundColor(Color.parseColor("#A5D6A7"));
        } else if (optionCText.getText().toString().equals(correctAnswer)) {
            optionC.setCardBackgroundColor(Color.parseColor("#A5D6A7"));
        } else if (optionDText.getText().toString().equals(correctAnswer)) {
            optionD.setCardBackgroundColor(Color.parseColor("#A5D6A7"));
        }
    }

    private void updateProgressBar() {
        int progress = (int) (((double) (questionIndex + 1) / displayedQuestions.size()) * 100);
        progressBar.setProgress(progress);
    }
}
