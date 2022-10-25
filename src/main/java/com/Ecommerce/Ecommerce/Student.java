package com.Ecommerce.Ecommerce;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentname;
    private String course;
    private String fee;
    private String address;
    private String phone;
    private String email;
    private String password;
    
    
    
    public Student() {
        
    }
    
    public Student(Integer id, String studentname, String course, String fee, String address, String phone, String email , String password) {
        super();
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.fee = fee;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Topic [id=" + id + ", studentname=" + studentname + ", course=" + course +", fee=" + fee +", address="+ address +", phone=" + phone +", email=" + email +", password=" + password +"]";
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStudentName() {
        return studentname;
    }
    public void setStudentName(String studentname) {
        this.studentname = studentname;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course= course;
    }
    public String getFee() {
        return fee;
    }
    public void setFee(String fee) {
        this.fee= fee;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address= address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email= email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password= password;
    }
}





//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//
//@Entity
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//
//    private String studentname;
//
//    private String course;
//
//    private int fee;
//    public Student() {
//
//    }
//    public Student(Long id, String studentname, String course, int fee) {
//        this.id = id;
//        this.studentname = studentname;
//        this.course = course;
//        this.fee = fee;
//    }
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getStudentname() {
//        return studentname;
//    }
//    public void setStudentname(String studentname) {
//        this.studentname = studentname;
//    }
//    public String getCourse() {
//        return course;
//    }
//    public void setCourse(String course) {
//        this.course = course;
//    }
//    public int getFee() {
//        return fee;
//    }
//    public void setFee(int fee) {
//        this.fee = fee;
//    }
//
//}