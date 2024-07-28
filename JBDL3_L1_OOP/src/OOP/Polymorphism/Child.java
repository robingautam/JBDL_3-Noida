package OOP.Polymorphism;

public class Child extends Parent{

    @Override
    public void m() {
        System.out.println("Inside the Child class method");
    }

    public void m2(){
        System.out.println("inside child class m2 method");
    }
}
