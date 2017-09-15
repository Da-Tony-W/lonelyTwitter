package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tony on 15/09/17.
 */

public class HappyMood extends Mood {
    public HappyMood(String MyMood, Date date) {
        super(MyMood, date);
    }

    public HappyMood(String MyMood) {
        super(MyMood);
    }


    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }

}
