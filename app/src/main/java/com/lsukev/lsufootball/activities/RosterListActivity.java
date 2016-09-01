package com.lsukev.lsufootball.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.lsukev.lsufootball.R;

public class RosterListActivity extends BaseActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster_list);

        listView = (ListView)findViewById(R.id.listView);

        offensePlayers();


    }

    private void offensePlayers() {
        final String[] playerName = new String[]{
                "Trey LaForge", "Nick Brossette", "Derrius Guice", "Brandon Harris", "Leonard Fournette",
                "Caleb Lewis", "Stephen Sullivan"
        };
        final Integer[] imageId = {
                R.drawable.treylaforge, R.drawable.nickbrosette, R.drawable.derriusguice, R.drawable.brandonharris,
                R.drawable.leonardfournette, R.drawable.caleblewis, R.drawable.stephensullivan
        };
        final String[] playerPos = new String[]{
                "QB", "RB", "RB","QB","RB","QB","WR"
        };
        final String[] playerNum = new String[]{
                "#2", "#4","#5","#6","#7","#8","#10"
        };
        final String[] height = new String[]{
                "6'6\""
        };
        final String[] weight = new String[]{
                "211 lbs."
        };
        final String[] playerClass = new String[]{
                "Freshman"
        };
        final String[] experience = new String[]{
                "Redshirt"
        };
        final String[] city = new String[]{
                "New Orleans, LA"
        };
        final String[] highSchool = new String[]{
                "Jesuit HS"
        };
        final String[] major = new String[]{
                "Finance"
        };
        final String[] born = new String[]{
                "10/06/1996"
        };

        CustomList adapter = new CustomList(this, playerName, imageId, playerPos, playerNum);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent i = new Intent(RosterListActivity.this, BioActivity.class);
                i.putExtra("playerName", playerName[position]);
                i.putExtra("imageId", imageId[position]);
                i.putExtra("playerPos", playerPos[position]);
                i.putExtra("playerNum", playerNum[position]);
                i.putExtra("height", height[position]);
                i.putExtra("weight", weight[position]);
                i.putExtra("class", playerClass[position]);
                i.putExtra("experience", experience[position]);
                i.putExtra("city", city[position]);
                i.putExtra("highSchool", highSchool[position]);
                i.putExtra("major", major[position]);
                i.putExtra("born", born[position]);
                startActivity(i);
//                Toast.makeText(RosterListActivity.this, "You clicked at " + playerName[+position] + " " + imageId[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
