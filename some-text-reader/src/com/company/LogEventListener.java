package com.company;

public class LogEventListener implements ReadListener{
    public void eol(){
        System.out.println("Another log file line just ended");
    }

    public void eof(){
        System.out.println("Faced end of log file");
    }

}
