package com.stackroute.lombokDemo.exceptions;

public class TrackDoesNotExists extends  Exception {
    private String message;

    public TrackDoesNotExists(String message){
        super(message);
        this.message=message;
    }

}
