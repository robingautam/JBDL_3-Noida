package org.gfg.JBDL3_L13_SpringJPA.repository;

import jakarta.transaction.Transactional;
import org.gfg.JBDL3_L13_SpringJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

    Student findByEmailAndName(String email, String name);

    Student findByEmailLike(String s);

    @Query("select s from student s where s.email=:email")
    Student findByEmailQuery(String email);

    @Modifying
    @Query("update  student s set s.name=:name where s.id=:id")
    @Transactional
    void changeStudentName(String name, int id);

    @Query(value = "SELECT * FROM student where email=:email", nativeQuery = true)
    Student findByEmailNativeQuery(String email);


    Student findByEmail(String email);
}
