package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointerA (View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointerA (View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void FreeThrowA (View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    private void displayForTeamA(int number)
    {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score); // Instantiating a TextView
        scoreTextView.setText(String.valueOf(number));    // calling the TextView's setText() method with String.valueOf()
    }

    /**
     * Displays the given score for Team B.
     */

    public void threepointerB (View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointerB (View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void FreeThrowB (View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    private void displayForTeamB(int number)
    {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score); // Instantiating a TextView
        scoreTextView.setText(String.valueOf(number));    // calling the TextView's setText() method with String.valueOf()
    }

    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
