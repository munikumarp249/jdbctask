package com.jdbc.repository.impl;

import com.jdbc.connection.DBconnectionUtil;
import com.jdbc.connection.DBconnectionUtil;
import com.jdbc.dto.StudentDTO;
import com.jdbc.repository.StudentRepository;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void addStudent(StudentDTO student) {

        String sql = "INSERT INTO students VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getFirst_name());
            ps.setString(3, student.getLast_name());
            ps.setString(4, student.getGender());
            ps.setString(5, student.getCity());
            ps.setString(6, student.getState());
            ps.setString(7, student.getMobile_number());
            ps.setString(8, student.getEmail_id());
            ps.setInt(9, student.getCourse_id());
            ps.setString(10, student.getCourse_name());
            ps.setDate(11, Date.valueOf(student.getEnrollment_date()));
            ps.setString(12, student.getCourse_type());
            ps.setString(13, student.getGrade());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public StudentDTO getStudentById(int id) {

        String sql = "SELECT * FROM students WHERE id=?";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                StudentDTO student = new StudentDTO();

                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setCity(rs.getString("city"));
                student.setState(rs.getString("state"));
                student.setMobile_number(rs.getString("mobile_number"));
                student.setEmail_id(rs.getString("email_id"));
                student.setCourse_id(rs.getInt("course_id"));
                student.setCourse_name(rs.getString("course_name"));
                student.setEnrollment_date(String.valueOf(rs.getDate("enrollment_date").toLocalDate()));
                student.setCourse_type(rs.getString("course_type"));
                student.setGrade(rs.getString("grade"));

                return student;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void updateCourse(int id, int courseId, String courseName) {

        String sql = "UPDATE students SET course_id=?, course_name=? WHERE id=?";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, courseId);
            ps.setString(2, courseName);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Course Updated Successfully.");
            } else {
                System.out.println("Student Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted Successfully.");
            } else {
                System.out.println("Student Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<StudentDTO> getAllStudents() {

        List<StudentDTO> students = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                StudentDTO student = new StudentDTO();

                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setCity(rs.getString("city"));
                student.setState(rs.getString("state"));
                student.setMobile_number(rs.getString("mobile_number"));
                student.setEmail_id(rs.getString("email_id"));
                student.setCourse_id(rs.getInt("course_id"));
                student.setCourse_name(rs.getString("course_name"));
                student.setEnrollment_date(String.valueOf(rs.getDate("enrollment_date").toLocalDate()));
                student.setCourse_type(rs.getString("course_type"));
                student.setGrade(rs.getString("grade"));

                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    @Override
    public StudentDTO getStudentByEmailAndDate(String email, LocalDate date) {

        String sql = "SELECT * FROM students WHERE email_id=? AND enrollment_date=?";

        try (Connection con = DBconnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setDate(2, Date.valueOf(date));

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                StudentDTO student = new StudentDTO();

                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                student.setGender(rs.getString("gender"));
                student.setCity(rs.getString("city"));
                student.setState(rs.getString("state"));
                student.setMobile_number(rs.getString("mobile_number"));
                student.setEmail_id(rs.getString("email_id"));
                student.setCourse_id(rs.getInt("course_id"));
                student.setCourse_name(rs.getString("course_name"));
                student.setEnrollment_date(String.valueOf(rs.getDate("enrollment_date").toLocalDate()));
                student.setCourse_type(rs.getString("course_type"));
                student.setGrade(rs.getString("grade"));

                return student;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}