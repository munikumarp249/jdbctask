package com.jdbc.service.Impl;

import com.jdbc.dto.StudentDTO;
import com.jdbc.repository.StudentRepository;
import com.jdbc.repository.impl.StudentRepositoryImpl;
import com.jdbc.service.Studentservice;

import java.time.LocalDate;
import java.util.List;

public class StudentserviceImpl implements Studentservice {

    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public void addStudent(StudentDTO student) {
        repository.addStudent(student);
    }

    @Override
    public StudentDTO getStudentById(int id) {
        return repository.getStudentById(id);
    }

    @Override
    public void updateCourse(int id, int courseId, String courseName) {
        repository.updateCourse(id, courseId, courseName);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteStudent(id);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return repository.getAllStudents();
    }

    @Override
    public StudentDTO getStudentByEmailAndDate(String email, LocalDate date) {
        return repository.getStudentByEmailAndDate(email, date);
    }
}