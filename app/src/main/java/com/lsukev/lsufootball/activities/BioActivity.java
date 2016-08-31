package com.lsukev.lsufootball.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lsukev.lsufootball.R;

import org.w3c.dom.Text;

public class BioActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView txtName;
    private TextView txtPos;
    private TextView txtNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        imageView = (ImageView)findViewById(R.id.imageView);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPos = (TextView) findViewById(R.id.txtPos);
        txtNum = (TextView)findViewById(R.id.txtNum);

        Bundle bundle = getIntent().getExtras();
//        Toast.makeText(BioActivity.this, bundle.getString("playerName"), Toast.LENGTH_SHORT).show();
        imageView.setImageResource(bundle.getInt("imageId"));
        txtName.setText(bundle.getString("playerName"));
        txtPos.setText(bundle.getString("playerPos"));
        txtNum.setText(bundle.getString("playerNum"));


    }
}
