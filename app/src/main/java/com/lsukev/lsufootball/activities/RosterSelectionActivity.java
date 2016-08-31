package com.lsukev.lsufootball.activities;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lsukev.lsufootball.R;

public class RosterSelectionActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCoaches;
    private Button btnOffense;
    private Button btnDefense;
    private Button btnSpecialTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster_selection);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCoaches:
                break;
            case R.id.btnOffense:
                break;
            case R.id.btnDefense:
                break;
            case R.id.btnSpecialTeams:
                break;
        }
    }
}
