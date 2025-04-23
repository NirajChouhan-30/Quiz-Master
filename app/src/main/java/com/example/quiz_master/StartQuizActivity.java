package com.example.quiz_master;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class StartQuizActivity extends AppCompatActivity {

    CardView ajpCard, manCard, etiCard;

    private ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        ajpCard = findViewById(R.id.ajpCard);
        manCard = findViewById(R.id.manCard);
        etiCard = findViewById(R.id.etiCard);

        backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String username = getIntent().getStringExtra("username");


        ajpCard.setOnClickListener(view -> {
            Intent intent = new Intent(StartQuizActivity.this, QuizActivity.class);
            intent.putExtra("quiz_topic", "ajp");
            intent.putExtra("username", username);
            startActivity(intent);
        });

        manCard.setOnClickListener(view -> {
            Intent intent = new Intent(StartQuizActivity.this, QuizActivity.class);
            intent.putExtra("quiz_topic", "man");
            intent.putExtra("username", username);
            startActivity(intent);
        });

        etiCard.setOnClickListener(view -> {
            Intent intent = new Intent(StartQuizActivity.this, QuizActivity.class);
            intent.putExtra("quiz_topic", "eti");
            intent.putExtra("username", username);
            startActivity(intent);
        });
    }
}
