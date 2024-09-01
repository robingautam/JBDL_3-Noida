package org.gfg.JBDL3_L13_SpringJPA;

import org.gfg.JBDL3_L13_SpringJPA.model.Student;
import org.gfg.JBDL3_L13_SpringJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jbdl3L13SpringJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jbdl3L13SpringJpaApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		//studentRepository.save(new Student(1, "Robin", "robin@gmail.com"));

	//	System.out.println("Data Saved in database");

		// Reading the data

	//	Student student = studentRepository.findById(1).get();

	//	System.out.println(student);

	//	studentRepository.deleteById(1);

//	Student student =	studentRepository.findByEmailAndName("robin@gmail.com", "Sarthak");

	//	Student student = studentRepository.findByEmailQuery("robin@gmail.com");

	//	System.out.println(student);

	//	studentRepository.changeStudentName("rob",1);

		Student student = studentRepository.findByEmailNativeQuery("robin@gmail.com");

		System.out.println(student);

	}
}
