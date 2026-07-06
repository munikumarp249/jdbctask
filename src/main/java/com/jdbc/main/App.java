package com.jdbc.main;

import com.jdbc.dto.StudentDTO;
import com.jdbc.service.Studentservice;
import com.jdbc.service.Impl.StudentserviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Studentservice service = new StudentserviceImpl();

        while (true) {

            System.out.println("\n===== Student Enrollment System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Fetch Student By Id");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Student");
            System.out.println("5. Fetch All Students");
            System.out.println("6. Fetch Student By Email & Date");
            System.out.println("7. Exit");
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    StudentDTO s = new StudentDTO();
                    System.out.print("Id : ");
                    s.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("First Name : ");
                    s.setFirst_name(sc.nextLine());
                    System.out.print("Last Name : ");
                    s.setLast_name(sc.nextLine());
                    System.out.print("Gender : ");
                    s.setGender(sc.nextLine());
                    System.out.print("City : ");
                    s.setCity(sc.nextLine());
                    System.out.print("State : ");
                    s.setState(sc.nextLine());
                    System.out.print("Mobile : ");
                    s.setMobile_number(sc.nextLine());
                    System.out.print("Email : ");
                    s.setEmail_id(sc.nextLine());
                    System.out.print("Course Id : ");
                    s.setCourse_id(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Course Name : ");
                    s.setCourse_name(sc.nextLine());
                    System.out.print("Enrollment Date (yyyy-MM-dd): ");
                    s.setEnrollment_date(String.valueOf(LocalDate.parse(sc.nextLine())));
                    System.out.print("Course Type : ");
                    s.setCourse_type(sc.nextLine());
                    System.out.print("Grade : ");
                    s.setGrade(sc.nextLine());
                    service.addStudent(s);
                    break;

                case 2:

                    System.out.print("Enter Id : ");
                    StudentDTO student = service.getStudentById(sc.nextInt());
                    System.out.println(student);
                    break;

                case 3:

                    System.out.print("Student Id : ");
                    int id = sc.nextInt();
                    System.out.print("Course Id : ");
                    int courseId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Course Name : ");
                    String courseName = sc.nextLine();
                    service.updateCourse(id, courseId, courseName);
                    break;

                case 4:
                    System.out.print("Enter Id : ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    List<StudentDTO> list = service.getAllStudents();
                    for (StudentDTO st : list) {
                        System.out.println(st);
                    }
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Email : ");
                    String email = sc.nextLine();
                    System.out.print("Enrollment Date (yyyy-MM-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.println(service.getStudentByEmailAndDate(email, date));
                    break;

                case 7:
                    System.out.println("Thank You...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}