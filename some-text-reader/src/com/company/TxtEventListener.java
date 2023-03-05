package com.company;

public class TxtEventListener implements ReadListener{
    public void eol(){
        System.out.println("Another txt file line just ended");
    }

    public void eof(){
        System.out.println("End of txt file");
    }

}
