package com.company;

public class Test2 implements ReadListener{
    public void eol(){
        System.out.println("Im Test obj2. Paket reader has just read another line.");
    }

    public void eof(){
        System.out.println("Im Test obj2. Paket faced end of file.");
    }

}
