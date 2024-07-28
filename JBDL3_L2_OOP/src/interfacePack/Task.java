package interfacePack;

public interface Task {

    public void prepareBreakFast();
    public void takeBreakFast();
    public void goToCoaching();
    public void reviseCoachingConcept();
    public void watchNetflix();
    public void scrollSocilaMedia();

    public void learn();
    public default void sleep(){
        doUtil();
        System.out.println("Sleep");
    }
    public static void staticMethod(){
        System.out.println("Inside static method");
    }
    public void someMethod();

    private void doUtil(){
        System.out.println("inside do UTIL");
    }

}
