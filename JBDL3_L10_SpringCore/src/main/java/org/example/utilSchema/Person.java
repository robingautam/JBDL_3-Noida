package org.example.utilSchema;

import java.util.ArrayList;
import java.util.List;

public class Person {

    List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "list=" + list +
                '}';
    }
}
