package org.example;

import org.example.models.Address;
import org.example.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Address.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //Employee employee = new Employee(1,"Robin", "robin12@gmail.com");

        session.beginTransaction();

       // session.save(employee); // transfering amount query

      //  Employee employee1 = session.load(Employee.class,1);

      //  employee1.setEmail("robin12@gmail.com");

//        System.out.println(employee1);

      //  session.save(employee1);
      //  session.save(new Employee(3,"Kajal","kajal@gmail.com")); // receiving amnt query

      //  session.delete(employee);

       // session.save(employee);

        Employee employee1 = new Employee(3, "Preet", "sagar@gmail.com");
        Address address = new Address("M.v Phasie 1", "110091");
        address.setId(1003);
        employee1.setAddress(address);

      //  session.save(address);
    //    session.save(employee1);


        Employee emp = session.load(Employee.class,1);

        System.out.println(emp.getEmail());

        Employee emp2 =  session.load(Employee.class,1);

        System.out.println(emp2);

        Session session1 = sessionFactory.openSession();

       Employee emp4 =  session1.load(Employee.class,1);

        System.out.println(emp4);

      //  System.out.println("Going to print the address");

     //   System.out.println(emp.getAddress());


        session.getTransaction().commit();


    }
}
