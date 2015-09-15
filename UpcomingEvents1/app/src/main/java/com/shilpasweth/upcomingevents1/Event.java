package com.shilpasweth.upcomingevents1;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Lenovo on 9/14/2015.
 */
public class Event {

    public Event(Integer id,String name,Time start_time,Time end_time,Time last_updated,String venue,String desc,Date date,String cluster)
    {

        this.id=id;
        this.name=name;
        this.start_time=start_time;
        this.end_time=end_time;
        this.venue=venue;
        this.cluster=cluster;
        this.date=date;
        this.last_updated=last_updated;
        this.desc=desc;



    }

    public Integer id ;
    public String name;
    public Time start_time;
    public Time end_time;
    public Time last_updated;
    public String venue;
    public String desc;
    public Date date;
    public String cluster;

}
