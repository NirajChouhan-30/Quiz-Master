package com.example.quiz_master;


public class HistoryItem {
    private String subject;
    private int score;
    private int totalQuestions;
    private String date;

    public HistoryItem(String subject, int score, int totalQuestions, String date) {
        this.subject = subject;
        this.score = score;
        this.totalQuestions = totalQuestions;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public String getDate() {
        return date;
    }
}
