import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.company.Paket;
import com.company.PaketReader;
import com.company.ReadListener;


public class Main {
    public static void main(String[] args) {

        PaketReader ok = new PaketReader("C:/Users/sasha/Desktop/Александра/Универ/4 курс/some-text-reader/ok.log");
        ok.doRead();
        System.out.println(ok.doRead());
        }
}