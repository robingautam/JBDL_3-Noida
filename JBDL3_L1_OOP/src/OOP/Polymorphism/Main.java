package OOP.Polymorphism;

public class Main {

    public static void main(String[] args) {
       Parent p = new Child();
       p.m();

       Child c=new Parent();
       c.m2();
    }
}
