package FunctionalInter;

public class FunctionalMain {

    public static void main(String[] args) {

    }
}

interface task{ // functional interface
    abstract void m1();
}

interface noTask { // non functional interface
    abstract void m1();
    abstract void m2();
}

@FunctionalInterface
interface taskanno { // functional interface
     void m1();
     default void m2(){
         System.out.println("hello");
     }
}