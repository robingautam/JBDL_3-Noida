package org.gfg.JBDL3_Security.repository;

import org.gfg.JBDL3_Security.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findByEmail(String email);
}
