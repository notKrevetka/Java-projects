package com.company;

import java.util.ArrayList;

public class PaketReaderFactory {
        public PaketReader createPacketReader (String filename) {

            String fileExt = filename.substring(filename.length() - 3, filename.length());
            System.out.println(fileExt);
            ArrayList<ReadListener> lst = new ArrayList<>();

            if(fileExt.equals("log")) {
                lst.add(new LogEventListener());

            } else if (fileExt.equals("txt")){
                lst.add(new TxtEventListener());
            } else {
                throw new RuntimeException("unknown filetype");
            }
            return new PaketReader(
                    filename,
                    lst
            );
        }
}
