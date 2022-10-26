package com.collegemanagement.collegemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegemanagement.collegemanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}