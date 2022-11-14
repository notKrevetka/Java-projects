package com.company;

public class Paket {
    String dateTime;
    String paketType;
    String interfaceTime;
    String bytesAmount;

    public Paket(String dateTime, String paketType, String interfaceTime, String bytesAmount){
        this.dateTime = dateTime;
        this.paketType = paketType;
        this.interfaceTime = interfaceTime;
        this.bytesAmount = bytesAmount;
    }
    @Override
    public String toString(){
        return this.paketType;
    };
}
