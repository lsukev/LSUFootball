package com.lsukev.lsufootball.activities;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lsukev.lsufootball.R;

import java.util.List;
import data.RosterProvider;
import model.Roster;

public class RosterCardActivity extends BaseActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster_card);

        RecyclerView rv = (RecyclerView) findViewById(R.id.roster_list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RosterListAdapter(new RosterProvider().readRosters()));
    }

    class RosterListAdapter extends RecyclerView.Adapter<RosterViewHolder>{
        private final List<Roster> rosters;
        RosterListAdapter(List<Roster> rosters){
            this.rosters = rosters;
        }
        @Override
        public RosterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
            final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            final View v = layoutInflater.inflate(R.layout.roster_card, viewGroup, false);
            return new RosterViewHolder(v);

        }
        @Override
        public void onBindViewHolder(RosterViewHolder rosterViewHolder, int i){
            rosterViewHolder.txtPlayerName.setText(rosters.get(i).getPlayerName());

//            int imageResource = getResources().getIdentifier(rosters.get(i).getImgPlayer(), null, getPackageName());
//            Drawable res = getResources().getDrawable(imageResource);
            rosterViewHolder.imgPlayer.setImageResource(rosters.get(i).getImgPlayer());

            rosterViewHolder.txtPlayerNumber.setText(rosters.get(i).getPlayerNumber());

            rosterViewHolder.txtYear.setText(rosters.get(i).getPlayerClass());
            rosterViewHolder.txtPosition.setText(rosters.get(i).getPlayerPos());

            //Setting up string to pass to BIO screen
            rosterViewHolder.currentName = rosters.get(i).getPlayerName();
            rosterViewHolder.imageId = rosters.get(i).getImgPlayer();
            rosterViewHolder.playerPos = rosters.get(i).getPlayerPos();
            rosterViewHolder.playerNum = rosters.get(i).getPlayerNumber();
            rosterViewHolder.state = rosters.get(i).getPlayerState();
            rosterViewHolder.height = rosters.get(i).getPlayerHeight();
            rosterViewHolder.weight = rosters.get(i).getPlayerWeight();
            rosterViewHolder.playerClass = rosters.get(i).getPlayerClass();
            rosterViewHolder.experience = rosters.get(i).getPlayerExperience();
            rosterViewHolder.highschool = rosters.get(i).getPlayerHighSchool();
            rosterViewHolder.major = rosters.get(i).getPlayerMajor();
            rosterViewHolder.born = rosters.get(i).getPlayerBorn();

        }
        @Override
        public int getItemCount(){
            return rosters.size();
        }
    }

    class RosterViewHolder extends RecyclerView.ViewHolder{
        TextView txtPlayerName;
        ImageView imgPlayer;
        TextView txtPlayerNumber;

        TextView txtYear;
        TextView txtPosition;

        public String currentName;
        public int imageId;
        public String playerPos;
        public String playerNum;
        public String state;
        public String height;
        public String weight;
        public String playerClass;
        public String experience;
        public String highschool;
        public String major;
        public String born;

        RosterViewHolder(final View itemView){
            super(itemView);
            txtPlayerName = (TextView)itemView.findViewById(R.id.txtPlayerName);
            imgPlayer = (ImageView)itemView.findViewById(R.id.imgPlayer);
            txtPlayerNumber = (TextView)itemView.findViewById(R.id.txtPlayerNumber);

            txtYear = (TextView)itemView.findViewById(R.id.txtYear);
            txtPosition = (TextView)itemView.findViewById(R.id.txtPosition);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(RosterCardActivity.this, BioActivity.class);
                    i.putExtra("playerName", currentName);
                    i.putExtra("imageId", imageId);
                    i.putExtra("playerPos", playerPos);
                    i.putExtra("playerNum", playerNum);
                    i.putExtra("height", height);
                    i.putExtra("weight", weight);
                    i.putExtra("class", playerClass);
                    i.putExtra("experience", experience);
                    i.putExtra("city", state);
                    i.putExtra("highSchool", highschool);
                    i.putExtra("major", major);
                    i.putExtra("born", born);
                    startActivity(i);
                }
            });

        }

    }
}
