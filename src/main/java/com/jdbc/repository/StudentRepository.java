package com.jdbc.repository;

import com.jdbc.dto.StudentDTO;
import java.time.LocalDate;
import java.util.List;

public interface StudentRepository {
    void addStudent(StudentDTO student);
    StudentDTO getStudentById(int id);
    void updateCourse(int id, int courseId, String courseName);
    void deleteStudent(int id);
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentByEmailAndDate(String email, LocalDate date);
}