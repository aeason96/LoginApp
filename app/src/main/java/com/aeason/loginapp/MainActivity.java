package com.aeason.loginapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.aeason.loginapp.R.layout.activity_login_screen;

public class MainActivity extends AppCompatActivity {

    TextView myRank;
    TextView teamRank;
    TextView myMiles;
    TextView teamMiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        myRank = (TextView) findViewById(R.id.myRank);
        myRank.setText("Rank: 21/48");

        teamRank = (TextView) findViewById(R.id.teamRank);
        teamRank.setText("Rank: 4/12");

        myMiles = (TextView) findViewById(R.id.myMiles);
        myMiles.setText("28 miles");

        teamMiles = (TextView) findViewById(R.id.groupMiles);
        teamMiles.setText("100 miles");

    }


}
