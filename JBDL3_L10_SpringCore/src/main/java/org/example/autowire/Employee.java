package org.example.autowire;

public class Employee {

    Address address2;

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {

        System.out.println("inside the setter method ");
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address2 +
                '}';
    }
}
