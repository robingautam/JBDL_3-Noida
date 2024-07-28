package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionMain {

    public static void main(String[] args) {
        try {
            File f = new File("");
            FileInputStream fileInputStream = new FileInputStream(f);
            f.exists();
        }
        catch (FileNotFoundException ex){

        }
    }

}
