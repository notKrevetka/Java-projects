import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.company.Paket;
import com.company.PaketReader;
import com.company.ReadListener;
import com.company.Test;
import com.company.Test2;


public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        Test2 test2 = new Test2();
        ArrayList<ReadListener> l = new ArrayList<>();
        l.add(test);
        l.add(test2);
        PaketReader pr = new PaketReader("/home/f/Programming/my_sasha/Java-projects/some-text-reader/ok.log", l);
        pr.doRead();
    }
}