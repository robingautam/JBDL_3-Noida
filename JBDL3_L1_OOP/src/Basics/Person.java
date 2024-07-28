package Basics;

public class Person {



   private String name;
    private String email;
    private int age;

    public static String getCollegeName(){
        return "IIT";
    }

    Person(String name, String email, int age){
        this.name = name;
       this.email = email;
       this.age = age;
    }
    Person(int age){

    }
    Person(){
        this(23);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            this.age = 10;
            return;
        }
        this.age = age;
    }


    @Override
    public int hashCode() {
        return this.name.hashCode()+this.email.hashCode();
    }

    @Override
    public boolean equals(Object o){
        Person p = (Person) o;
        if (this.email.equals(p.email) && this.name.equals(p.name)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
