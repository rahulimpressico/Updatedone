package com.collegemanagement.collegemanagement.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collegemanagement.collegemanagement.dto.StudentRequest;
import com.collegemanagement.collegemanagement.model.Student;
import com.collegemanagement.collegemanagement.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping("")
    public Student addStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.addStudent(studentRequest);
    }

    @PutMapping("/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable Integer id) {
        studentService.updateStudent(student, id);

    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "Deleted Successfully";
    }
}
