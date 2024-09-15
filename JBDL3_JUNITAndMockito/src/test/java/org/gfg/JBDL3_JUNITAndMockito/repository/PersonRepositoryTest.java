package org.gfg.JBDL3_JUNITAndMockito.repository;

import jakarta.persistence.Table;
import org.gfg.JBDL3_JUNITAndMockito.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    void testPersonJPA(){
        Person p = new Person();
        p.setEmail("preeti@gmail.com");
        p.setName("Preeti");
        p.setId(123);

        personRepository.save(p);

       Person result = personRepository.findById(123).get();

        Assertions.assertEquals("preeti@gmail.com",result.getEmail());

    }

}