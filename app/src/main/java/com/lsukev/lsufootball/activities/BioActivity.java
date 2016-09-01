package com.lsukev.lsufootball.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lsukev.lsufootball.R;

public class BioActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView txtName;
    private TextView txtPos;
    private TextView txtNum;
    private TextView txtHeight;
    private TextView txtWeight;
    private TextView txtClass;
    private TextView txtExperience;
    private TextView txtCity;
    private TextView txtHighSchool;
    private TextView txtMajor;
    private TextView txtBorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        imageView = (ImageView)findViewById(R.id.imageView);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPos = (TextView) findViewById(R.id.txtPos);
        txtNum = (TextView)findViewById(R.id.txtNum);
        txtHeight = (TextView)findViewById(R.id.txtHeight);
        txtWeight = (TextView)findViewById(R.id.txtWeight);
        txtClass=(TextView)findViewById(R.id.txtClass);
        txtExperience = (TextView)findViewById(R.id.txtExperience);
        txtCity = (TextView) findViewById(R.id.txtCity);
        txtHighSchool = (TextView)findViewById(R.id.txtHighSchool);
        txtMajor = (TextView)findViewById(R.id.txtMajor);
        txtBorn = (TextView) findViewById(R.id.txtBorn);

        Bundle bundle = getIntent().getExtras();
//        Toast.makeText(BioActivity.this, bundle.getString("playerName"), Toast.LENGTH_SHORT).show();
        imageView.setImageResource(bundle.getInt("imageId"));
        txtName.setText(bundle.getString("playerName"));
        txtPos.setText(bundle.getString("playerPos"));
        txtNum.setText(bundle.getString("playerNum"));
        txtHeight.setText(bundle.getString("height"));
        txtWeight.setText(bundle.getString("weight"));
        txtClass.setText(bundle.getString("class"));
        txtExperience.setText(bundle.getString("experience"));
        txtCity.setText(bundle.getString("city"));
        txtHighSchool.setText(bundle.getString("highSchool"));
        txtMajor.setText(bundle.getString("major"));
        txtBorn.setText(bundle.getString("born"));

    }
}
