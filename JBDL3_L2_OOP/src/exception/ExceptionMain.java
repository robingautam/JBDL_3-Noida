package exception;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionMain {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;



      //  int arr[] = new int[2];

        try {
         //   int c = a/b;
         //   System.out.println(c);
        //    String s = null;
        //    System.out.println(s.length());
            File f = new File("");
           // FileInputStream fis = new FileInputStream(f);
            byte[] fc = new byte[2056];
          //  fis.read(fc);

            // nested try catch block

            try {
                String s=null;
                s.length();
            }
            catch (ArithmeticException ex){
                System.out.println("inside the nested try catch");
            }
            finally {
                System.out.println("inside the nested finally");
            }
        }
        catch (ArithmeticException ex){
            System.out.println("Exception in divide");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception in array accessing");
        }
        catch (NullPointerException ex){
            System.out.println("Exception in String length");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Inside the exception class"+ex);
        }
        finally {
            System.out.println("inside the finally block");
        }

        System.out.println("Rest of the code");

       // System.out.println("ans: "+c);
    }
}
