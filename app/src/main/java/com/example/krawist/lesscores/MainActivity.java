package com.example.krawist.lesscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView teamAView;
    TextView teamBView;
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAView = findViewById(R.id.score_team_a);

        teamBView = findViewById(R.id.score_team_b);


    }

    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        updateUI();
    }

    public void plus(View view){
        switch (view.getId()){

            case R.id.plus_1_team_a:
                teamAScore = addPoint(teamAScore,1);
                updateUI();
                break;

            case R.id.plus_1_team_b:
                teamBScore = addPoint(teamBScore,1);
                updateUI();
                break;

            case R.id.plus_2_team_a:
                teamAScore = addPoint(teamAScore,2);
                updateUI();
                break;

            case R.id.plus_2_team_b:
                teamBScore = addPoint(teamBScore,2);
                updateUI();
                break;

            case R.id.plus_3_team_a:
                teamAScore = addPoint(teamAScore,3);
                updateUI();
                break;

            case R.id.plus_3_team_b:
                teamBScore = addPoint(teamBScore,3);
                updateUI();
                break;
        }

    }


    private int addPoint(int teamScore, int point){
        teamScore = teamScore + point;

        return teamScore;

    }

    private void updateUI(){
        /*Log.v("MainActivity","le score de la team A: " + teamAScore);
        Log.v("MainActivity","le score de la team B: " + teamBScore);*/
        teamAView.setText(String.valueOf(teamAScore));
        teamBView.setText(String.valueOf(teamBScore));
    }
}
