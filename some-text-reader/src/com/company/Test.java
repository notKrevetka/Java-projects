package com.company;

public class Test implements ReadListener{
    public void eol(){
        System.out.println("Im Test obj. Paket reader has just read another line.");
    }

    public void eof(){
        System.out.println("Im Test obj. Paket faced end of file.");
    }

}
