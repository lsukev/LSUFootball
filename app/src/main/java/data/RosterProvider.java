package data;

import com.lsukev.lsufootball.R;

import java.util.Arrays;
import java.util.List;

import model.Roster;

/**
 * Created by Kevin on 9/3/2016.
 */
public class RosterProvider {

    public List<Roster> readRosters(){
        return Arrays.asList(
          new Roster("Donte Jackson", R.drawable.dontejackson, "#1", "DB", "Sophomore", "Metairie, LA", "1 Letter", "Riverdale HS", "General Business", "11/08/1995", "5'11", "173 lbs."),
                new Roster("Trey LaForge", R.drawable.treylaforge, "#2", "QB", "Freshman", "New Orleans, LA","Redshirt", "Jesuit HS", "Finance", "10/06/1996","6'6","211 lbs.")
        );
    }
}
