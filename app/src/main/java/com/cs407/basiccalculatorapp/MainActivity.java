package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void add(View view) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int ans = num1 + num2;
        String answer = Integer.toString(ans);
        goToActivity(answer);
    }

    public void subtract(View view) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int ans = num1 - num2;
        String answer = Integer.toString(ans);
        goToActivity(answer);
    }

    public void multiply(View view) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int ans = num1 * num2;
        String answer = Integer.toString(ans);
        goToActivity(answer);
    }

    public void divide(View view) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        String answer;
        if(num2 == 0){
            answer = "error:\ncannot divide by zero";
        }
        else{
            double ans = (double) num1 / num2;
            answer = String.format("%.10f", ans);
        }
        goToActivity(answer);
    }

    public void goToActivity(String answer){
        Intent intent = new Intent(this, DisplayAnswer.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}