package com.Ecommerce.Ecommerce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        Student createStudent = new Student();
        createStudent.setAddress(student.getAddress());
        createStudent.setCourse(student.getCourse());
        createStudent.setEmail(student.getEmail());
        createStudent.setFee(student.getFee());
        createStudent.setPhone(student.getPhone());
        createStudent.setStudentName(student.getStudentName());
        createStudent.setPassword(passwordEncoder.encode(student.getPassword()));

        return studentRepository.save(createStudent);
    }

    public void deleteStudent(Integer id) {

        studentRepository.deleteById(id);
    }

    public void updateStudent(Student student, Integer id) {
        // String encodedPassword = this.passwordEncoder.encode(student.getPassword());
        Optional<Student> existingStudent = studentRepository.findById(id);
        existingStudent.get().setStudentName(student.getStudentName());
        existingStudent.get().setCourse(student.getCourse());
        existingStudent.get().setFee(student.getFee());
        existingStudent.get().setAddress(student.getAddress());
        existingStudent.get().setPhone(student.getPhone());
        existingStudent.get().setEmail(student.getEmail());
        existingStudent.get().setPassword(passwordEncoder.encode(student.getPassword()));

        studentRepository.save(existingStudent.get());

    }

}
