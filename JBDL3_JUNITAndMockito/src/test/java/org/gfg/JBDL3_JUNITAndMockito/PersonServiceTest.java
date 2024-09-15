package org.gfg.JBDL3_JUNITAndMockito;

import org.gfg.JBDL3_JUNITAndMockito.mockito.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {

    @Autowired
    PersonService personService;

    @Test
    void createPerson() {

        String person = personService.sayHello();

        Assertions.assertEquals(1, person);
    }
}