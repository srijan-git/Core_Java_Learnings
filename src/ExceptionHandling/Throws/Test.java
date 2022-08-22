package ExceptionHandling.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Abc.txt");
    }
}

public class Test {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}