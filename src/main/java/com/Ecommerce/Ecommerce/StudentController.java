package com.Ecommerce.Ecommerce;

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

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/registration")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/student/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable Integer id) {
        studentService.updateStudent(student, id);

    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "Deleted Successfully";
    }
}
