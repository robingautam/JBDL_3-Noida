package exception;

public class ExceptionPropagation {

    public static void main(String[] args) {
        n2();
    }

    public static void m1(){
        int a = 10/0;
        System.out.println(a);
    }

    public static void n1(){
        m1();
    }

    public static void n2(){
        try {
            n1();
        }
        catch (Exception ex){

        }
    }
}
