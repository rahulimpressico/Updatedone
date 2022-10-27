package com.collegemanagement.collegemanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {

    private String studentName;
    private String email;
    private String password;
    private String course;
    private String fee;
    private String address;
    private String phone;

}
