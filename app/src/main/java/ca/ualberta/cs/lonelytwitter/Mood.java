package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tony on 14/09/17.
 */

public abstract class Mood {
    private Date date;
    private String MyMood;

    public Mood(String MyMood){
        this.MyMood = MyMood;

    }

    public Mood(String MyMood, Date date){
        this.MyMood = MyMood;
        this.date = date;
    }

    public void SetMood(String MyMood){
        this.MyMood = MyMood;
    }

    public String getMood(String MyMood){
        return MyMood;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }


    /*
    public void setMyMood(String MyMood){
        this.MyMood = MyMood;

    }
    */
    public abstract Boolean isHappy();
}
