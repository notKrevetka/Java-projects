package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PaketReader {
    String filename;
    ArrayList<ReadListener> listeners;

    public PaketReader(String filename, ArrayList<ReadListener> listeners){
        this.filename = filename;
        this.listeners = listeners;
    }

    public List<Paket> doRead(){
        FileReader fr;
        List<Paket> paketList = new ArrayList<>();
        try {
            fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String l;
            while ((l = br.readLine()) != null) {
                this.listeners.forEach((ReadListener x) -> {x.eol();});
                if (!l.contains("*****")) {
                    paketList.add(new Paket(
                            l.split(";")[0],
                            l.split(";")[1],
                            l.split(";")[2],
                            l.split(";")[3]
                    ));
                }
            }
            this.listeners.forEach((ReadListener x) -> {x.eof();});

        } catch (Exception e) {
            System.err.println("что-то нетак");
        }
        return paketList;
    }
}
