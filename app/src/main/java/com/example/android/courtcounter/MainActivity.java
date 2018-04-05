package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }



    /**

     * Displays the given score for Team A.

     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }
    public void onePoint(View view) {
        points=points+1;
        displayForTeamA(points);

    }
    public void twoPoints(View view) {
        points=points+2;
        displayForTeamA(points);

    }
    public void threePoints(View view) {
        points=points+3;
        displayForTeamA(points);

    }

}
