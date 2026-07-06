package com.jdbc.dto;

public class StudentDTO {
    private int id;
    private String first_name;
    private  String last_name;
    private String gender;
    private String city;
    private String state;
    private  String mobile_number;
    private  String email_id;
    private int course_id;
    private  String course_name;
    private String enrollment_date;
    private String course_type;
    private String grade;

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getEnrollment_date() {
        return enrollment_date;
    }

    public String getCourse_type() {
        return course_type;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setEnrollment_date(String enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", email_id='" + email_id + '\'' +
                ", course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", enrollment_date='" + enrollment_date + '\'' +
                ", course_type='" + course_type + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}