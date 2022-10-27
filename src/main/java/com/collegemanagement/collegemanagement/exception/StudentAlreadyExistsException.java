package com.collegemanagement.collegemanagement.exception;


public class StudentAlreadyExistsException extends RuntimeException{
    public  StudentAlreadyExistsException(String msg){
        super(msg);
    }

}