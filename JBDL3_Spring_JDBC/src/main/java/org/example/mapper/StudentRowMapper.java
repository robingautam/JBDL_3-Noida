package org.example.mapper;

import org.example.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("ID"));
        student.setName(rs.getString("NAME"));
        student.setEmail(rs.getString("EMAIL"));
        return student;
    }
}
