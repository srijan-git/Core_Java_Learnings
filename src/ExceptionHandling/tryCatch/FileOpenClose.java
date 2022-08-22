package ExceptionHandling.tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOpenClose {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Abc.txt"); //risky code
        } catch (FileNotFoundException e) {
            System.out.println("File problem: " + e); //Handling Code
        } finally {
            //Cleanup Code
            if (fis != null) {
                fis.close();  //close() throws IOException
            }
            System.out.println("File closed");
        }
    }

}
