import java.util.ArrayList;

import com.company.*;


public class Main {

    public static void main(String[] args) {
        String logfile = "some-text-reader\\ok.log";
        PaketReaderFactory fact = new PaketReaderFactory();
        PaketReader logReader = fact.createPacketReader(logfile);
        logReader.doRead();
    }
}