package com.example.quiz_master;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView historyRecyclerView;
    private HistoryAdapter historyAdapter;
    private List<HistoryItem> historyList = new ArrayList<>();
    private Toolbar toolbar;
    private ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

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

        historyRecyclerView = findViewById(R.id.historyRecyclerView);
        historyRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadHistory();
        historyAdapter = new HistoryAdapter(historyList);
        historyRecyclerView.setAdapter(historyAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadHistory();
        historyAdapter.notifyDataSetChanged();
    }

    private void loadHistory() {
        SharedPreferences sharedPreferences = getSharedPreferences("QuizHistory", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("historyList", null);
        Type type = new TypeToken<ArrayList<HistoryItem>>() {}.getType();
        List<HistoryItem> loadedList = gson.fromJson(json, type);

        if (loadedList != null) {
            historyList.clear();
            historyList.addAll(loadedList);
        }
    }
}
