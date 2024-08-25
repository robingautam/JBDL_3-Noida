package org.example;


import org.example.mapper.StudentRowMapper;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class App
{

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/config.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);


        // Insert the data or create the data
     /*   String query = "INSERT INTO student (id, name, email) VALUES (?,?,?)";
        int rows = jdbcTemplate.update(query,2,"Preeti", "preeti@gmail.com");

        System.out.println("Rows Affected: "+rows);*/


        // Update the data

/*        String sql = "UPDATE student set NAME=? WHERE ID=?";
       int rows =  jdbcTemplate.update(sql,"Preeti Kumari", 2);

        System.out.println("Rows Affected: "+rows);*/

        // Delete the data
      /*  String query = "DELETE FROM student WHERE ID=1";
        int rows =  jdbcTemplate.update(query);

        System.out.println("Rows Affected: "+rows);*/


        // Fetching the data from db

        //String query = "SELECT * FROM student";

       // Student student = jdbcTemplate.queryForObject(query,new StudentRowMapper());

     //   List list = jdbcTemplate.queryForList(query,StudentRowMapper.class);

       // System.out.println(list);




    }
}
