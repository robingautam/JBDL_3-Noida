package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Robin",15000));

        list.add(new Employee(1,"Robin",20000));
        list.add(new Employee(1,"Robin",30000));

        Collections.sort(list);

        System.out.println(list);
    }
}
