package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayAnswer extends AppCompatActivity {
    TextView answerDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_answer);

        answerDisplay = findViewById(R.id.answerDisplay);
        Intent intent = getIntent();
        String answer = intent.getStringExtra("answer");
        answerDisplay.setText(answer);
    }
}