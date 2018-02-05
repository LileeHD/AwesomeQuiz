package com.example.android.awesomequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        display();
    }

    /**
     * This method display the score and the picture according to the score
     */
    private void display() {
        // it retrieves the score
        Intent intent = getIntent();
        Integer score = intent.getIntExtra("score", 0);

        // Show the score
        TextView scoreView = findViewById(R.id.score);
        scoreView.setText(getText(R.string.score_text) + score.toString());

        // The ImageView changes according to the score
        ImageView scorePic = findViewById(R.id.image_score);
        if (score <= 2) {
            scorePic.setImageResource(R.drawable.score_poor);
        }
        if (score == 3 || score == 4) {
            scorePic.setImageResource(R.drawable.score_medium);
        }
        if (score == 5 || score == 6) {
            scorePic.setImageResource(R.drawable.score_high);
        }
        if (score == 7) {
            scorePic.setImageResource(R.drawable.score_perfect);
        }
    }

    /**
     * The "Play again" button allows to reload the QuestionActivity.
     */
    public void reset(View view) {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
