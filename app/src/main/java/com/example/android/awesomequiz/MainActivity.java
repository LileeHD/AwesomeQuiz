package com.example.android.awesomequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * display the question page when the start button is hit
     */
    public void openQuestionsList(View view) {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
