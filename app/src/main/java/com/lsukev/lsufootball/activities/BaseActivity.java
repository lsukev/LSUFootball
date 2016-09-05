package com.lsukev.lsufootball.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.lsukev.lsufootball.R;

public class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private NavigationView navigationView;
    private DrawerLayout fullLayout;
    private Toolbar toolbar;
    private ActionBarDrawerToggle drawerToggle;
    private int selectedNavItemId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void setContentView(int layoutResID){

        fullLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base, null);

        FrameLayout activityContainer = (FrameLayout)fullLayout.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);

        super.setContentView(fullLayout);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigationView);


        if (useToolbar()){
            setSupportActionBar(toolbar);
        }else{
            toolbar.setVisibility(View.GONE);
        }
        setUpNavView();

    }

    protected boolean useToolbar(){
        return true;
    }

    protected boolean useDrawerToggle(){
        return true;
    }

    protected void setUpNavView(){
        navigationView.setNavigationItemSelectedListener(this);

        if (useDrawerToggle()){
            drawerToggle = new ActionBarDrawerToggle(this, fullLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

            fullLayout.setDrawerListener(drawerToggle);
            drawerToggle.syncState();
        }else if(useToolbar() && getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material));
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        fullLayout.closeDrawer(GravityCompat.START);
        selectedNavItemId = menuItem.getItemId();
        return onOptionsItemSelected(menuItem);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_home:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.action_roster:
                startActivity(new Intent(this, RosterCardActivity.class));
                return true;
            case R.id.action_schedule:
                startActivity(new Intent(this, ScheduleActivity.class));
                return true;
            case R.id.action_notification:
                startActivity(new Intent(this, NotificationTestActivity.class));
                return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
