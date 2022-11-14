package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PaketReader {
    String filename;
    public PaketReader(String filename){
        this.filename = filename;
    }
    private ReadListener localReader;
    public List<Paket> doRead(){
        FileReader fr;
        List<Paket> paketList = new ArrayList<>();
        try {
            fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String l;
            while ((l = br.readLine()) != null) {
                if (!l.contains("*****")) {
                    paketList.add(new Paket(
                            l.split(";")[0],
                            l.split(";")[1],
                            l.split(";")[2],
                            l.split(";")[3]
                    ));
                }
//                System.out.println(l);
            }

        } catch (Exception e) {
            System.err.println("что-то нетак");
        }
        return paketList;
    }
}
