package com.lsukev.lsufootball.activities;

import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lsukev.lsufootball.R;

import java.util.List;

import data.ScheduleProvider;
import model.Schedule;

public class ScheduleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        RecyclerView rv = (RecyclerView) findViewById(R.id.schedule_list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ScheduleListAdapter(new ScheduleProvider().readSchedules()));

    }

    @Override
    protected boolean useDrawerToggle() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.action_schedule)
            return true;
        if (item.getItemId() == android.R.id.home)
            onBackPressed();

        return super.onOptionsItemSelected(item);
    }

    class ScheduleListAdapter extends RecyclerView.Adapter<ScheduleViewHolder>{
        private final List<Schedule> schedules;
        ScheduleListAdapter(List<Schedule> schedules){
            this.schedules = schedules;
        }
        @Override
        public ScheduleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
            final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            final View v = layoutInflater.inflate(R.layout.schedule_card, viewGroup, false);
            return new ScheduleViewHolder(v);
        }
        @Override
        public void onBindViewHolder(ScheduleViewHolder scheduleViewHolder, int i){
            scheduleViewHolder.txtAwayTeam.setText(schedules.get(i).getAwayTeam());
            scheduleViewHolder.txtHomeTeam.setText(schedules.get(i).getHomeTeam());
            scheduleViewHolder.txtDate.setText(schedules.get(i).getGameDate());
            scheduleViewHolder.txtVenue.setText(schedules.get(i).getGameVenue());

            int imageResource = getResources().getIdentifier(schedules.get(i).getAwayLogo(), null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            scheduleViewHolder.imgAway.setImageDrawable(res);

            int imageResource2 = getResources().getIdentifier(schedules.get(i).getHomeLogo(), null, getPackageName());
            Drawable res2 = getResources().getDrawable(imageResource2);
            scheduleViewHolder.imgHome.setImageDrawable(res2);


        }

        @Override
        public int getItemCount(){
            return schedules.size();
        }
    }

    class ScheduleViewHolder extends RecyclerView.ViewHolder{
        TextView txtAwayTeam;
        TextView txtHomeTeam;
        TextView txtDate;
        TextView txtVenue;
        ImageView imgHome;
        ImageView imgAway;

        ScheduleViewHolder(View itemView){
            super(itemView);
            txtAwayTeam = (TextView)itemView.findViewById(R.id.txtAwayTeam);
            txtHomeTeam = (TextView)itemView.findViewById(R.id.txtHomeTeam);
            txtDate = (TextView)itemView.findViewById(R.id.txtDate);
            txtVenue = (TextView)itemView.findViewById(R.id.txtVenue);
            imgHome = (ImageView)itemView.findViewById(R.id.imgHome);
            imgAway = (ImageView)itemView.findViewById(R.id.imgAway);
        }
    }


}
