package data;


import java.util.Arrays;
import java.util.List;

import model.Schedule;

/**
 * Created by lsuke on 9/2/2016.
 */
public class ScheduleProvider {

    public List<Schedule> readSchedules(){
        return Arrays.asList(
                new Schedule("Wisconsin", "LSU", "Sat, Sep 3, 2:30PM CT","Green Bay, Wisc", "@drawable/wisconsinlogo", "@drawable/lsulogo"),
                new Schedule("Jacksonville State", "LSU", "Sat, Sep 10, 6:30PM CT", "Baton Rouge, LA","@drawable/jsulogo", "@drawable/lsulogo"),
                new Schedule("Mississippi St.", "LSU", "Sat, Sep 17, 6:00PM CT", "Baton Rouge, LA", "@drawable/msulogo", "@drawable/lsulogo"),
                new Schedule("LSU", "Auburn", "Sat, Sep 24, TBA", "Auburn, AL", "@drawable/lsulogo", "@drawable/auburnlogo"),
                new Schedule("Missouri", "LSU", "Sat, Oct 1, TBA", "Baton Rouge, LA", "@drawable/missourilogo", "@drawable/lsulogo"),
                new Schedule("LSU", "Florida", "Sat, Oct 8, TBA", "Gainesville, FL", "@drawable/lsulogo", "@drawable/floridalogo"),
                new Schedule("Southern Miss", "LSU", "Sat, Oct 15, TBA", "Baton Rouge, LA", "@drawable/smlogo", "@drawable/lsulogo"),
                new Schedule("Ole Miss", "LSU", "Sat, Oct 22, TBA", "Baton Rouge, LA", "@drawable/olemisslogo", "@drawable/lsulogo"),
                new Schedule("Alabama", "LSU", "Sat, Nov 5, TBA", "Baton Rouge, LA", "@drawable/bamalogo", "@drawable/lsulogo"),
                new Schedule("LSU", "Arkansas", "Sat, Nov 12, TBA", "Fayetteville, AR", "@drawable/lsulogo", "@drawable/arklogo"),
                new Schedule("South Alabama", "LSU", "Sat, Nov 19, TBA", "Baton Rouge, LA", "@drawable/southbamalogo", "@drawable/lsulogo"),
                new Schedule("LSU", "Texas AM", "Thu, Nov 24, 6:30PM CT", "College Station, TX", "@drawable/lsulogo", "@drawable/txlogo")
        );
    }

}
