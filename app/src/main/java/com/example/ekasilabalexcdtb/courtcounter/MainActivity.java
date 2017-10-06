package com.example.ekasilabalexcdtb.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int scoreForTeamA = 0;

    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void addThreeForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }
    public void addOneForTeamA(View v) {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);

    }

    public void addOneForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);

    }
    public void addTwoForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);

    }
    public void addThreeForTeamB(View v){
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);

    }
    public void resetScore (View V){
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }


    public void displayForTeamA(int score){
        TextView ScoreView =(TextView) findViewById(R.id.team_a_score);
        ScoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView ScoreView =(TextView) findViewById(R.id.team_b_score);
        ScoreView.setText(String.valueOf(score));
    }



}
