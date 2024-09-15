package org.gfg.JBDL3_JUNITAndMockito.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
 //   @Mock
 // StudentService studentService;

    StudentService studentService = Mockito.mock(StudentService.class);

  //  StudentService studentService = Mockito.mock(StudentService.class);


    @Test
    void getStudentEmail() {
        
        when(studentService.getStudent()).thenReturn(new Student(1,"preeti", "preeti@gmail.com"));

        Student email = studentService.getStudent();

        Assertions.assertEquals("preeti@gmail.com",email.getEmail());
    }


}