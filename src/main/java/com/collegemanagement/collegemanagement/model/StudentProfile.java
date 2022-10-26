package com.collegemanagement.collegemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String course;
    private String fee;
    private String address;
    private String phone;

    // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
    // "studentProfile")
    // private Student student;

}
