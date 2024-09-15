package org.gfg.JBDL3_JUNITAndMockito.repository;

import org.gfg.JBDL3_JUNITAndMockito.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
