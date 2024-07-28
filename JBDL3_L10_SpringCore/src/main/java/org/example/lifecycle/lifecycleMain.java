package org.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.support.ScheduledTaskObservationContext;

public class lifecycleMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/org/example/lifecycle/empconfig.xml");

        Employee employee = context.getBean("employee", Employee.class);

        Employee employee2 = context.getBean("employee", Employee.class);
        Employee employee3 = context.getBean("employee", Employee.class);



        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee3);


        //   employee.markAttendance();
      //  context.registerShutdownHook();

       /* Employee2 employee2 = context.getBean("employee2", Employee2.class);

        employee2.markAttendance();*/

    }
}
