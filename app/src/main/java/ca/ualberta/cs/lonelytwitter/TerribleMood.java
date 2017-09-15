package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tony on 15/09/17.
 */

public class TerribleMood extends Mood{
    public TerribleMood(String MyMood, Date date) {
        super(MyMood, date);
    }

    public TerribleMood(String MyMood) {
        super(MyMood);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }

}
