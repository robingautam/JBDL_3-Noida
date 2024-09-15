package org.gfg.JBDL3_JUNITAndMockito.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Spy
    PersonService personService;

    @Test
    void sayHello() {
        when(personService.sayHello()).thenReturn("Mocking Say Hello");
        String ans = personService.sayHello();
        System.out.println(ans);
    }

    @Test
    void checkPerson() {

        String ans = personService.checkPerson();
        System.out.println(ans);
    }

    @Test
    void checkArgument(){
        when(personService.checkingArgument(anyInt(),anyInt())).thenReturn("ans: 2");

        personService.checkingArgument(3,4);
    }
}