package exception;

public class ThrowMain {

    public static void main(String[] args) {
     //   int a = 10/0;
        try {
            System.out.println(divide(2, 5));
        }
        catch (Exception ex){

        }
    }

    public static int divide(int a, int b) throws Exception{
        if (b==5){
            throw new Exception();
        }
        int c = a/b;
        return c;
    }
}
