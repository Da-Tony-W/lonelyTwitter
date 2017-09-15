package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tony on 14/09/17.
    note, attribute uses lower case; class uses camel case

 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;

    }

    public void setMessage(String message)throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }

    }

    public Date getDate(){
        return date;
    }

    public String getMessage(){
        return message;
    }


    public abstract Boolean isImportant();


}
