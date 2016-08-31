package com.lsukev.lsufootball.activities;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lsukev.lsufootball.R;

/**
 * Created by lsuke on 8/31/2016.
 */
public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] playerName;
    private final Integer[] imageId;
    private final String[] playerPos;
    private final String[] playerNum;
    public CustomList(Activity context, String[] playerName, Integer[] imageId, String [] playerPos, String [] playerNum){
        super(context, R.layout.list_single, playerName);
        this.context=context;
        this.playerName=playerName;
        this.imageId=imageId;
        this.playerPos=playerPos;
        this.playerNum=playerNum;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView)rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.img);
        TextView txtPos = (TextView)rowView.findViewById(R.id.txtPos);
        TextView txtNum = (TextView)rowView.findViewById(R.id.txtNum);
        txtTitle.setText(playerName[position]);
        imageView.setImageResource(imageId[position]);
        txtPos.setText(playerPos[position]);
        txtNum.setText(playerNum[position]);
        return rowView;
    }

}
