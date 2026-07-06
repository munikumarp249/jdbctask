package com.jdbc.exception;

public class DuplicateStudentException  extends RuntimeException{
    public DuplicateStudentException(String Message){
        super(Message);

    }

}