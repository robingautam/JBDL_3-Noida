package org.gfg.JBDL3_JUNITAndMockito.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public String getStudentEmail(){
       Student student = studentDAO.createAndGetStudent();
       if (student==null){
           throw new ArithmeticException("Exception");
       }
        System.out.println("Name: "+student.getName());
       return student.getEmail();


    }


    public Student getStudent(){
       return null;
    }
}
