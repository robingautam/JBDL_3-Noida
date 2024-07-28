package Singleton;

import javax.print.DocFlavor;

public class Student {

    private Student(){}
    private static Student INSTANCE=null;

    public static Student getInstance(){
        if (INSTANCE==null){
            INSTANCE = new Student();
        }
        return INSTANCE;
    }
}
