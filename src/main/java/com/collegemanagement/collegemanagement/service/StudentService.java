package com.collegemanagement.collegemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.collegemanagement.collegemanagement.dto.StudentRequest;
import com.collegemanagement.collegemanagement.model.Student;
import com.collegemanagement.collegemanagement.model.StudentProfile;
import com.collegemanagement.collegemanagement.repository.StudentProfileRepository;
import com.collegemanagement.collegemanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentProfileRepository studentProfileRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setEmail(studentRequest.getEmail());
        student.setStudentName(studentRequest.getStudentName());
        student.setPassword(passwordEncoder.encode(studentRequest.getPassword()));

        StudentProfile studentProfile = new StudentProfile();
        studentProfile.setAddress(studentRequest.getAddress());
        studentProfile.setCourse(studentRequest.getCourse());
        studentProfile.setFee(studentRequest.getFee());
        studentProfile.setPhone(studentRequest.getPhone());

        student.setStudentProfile(studentProfileRepository.save(studentProfile));

        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {

        studentRepository.deleteById(id);
    }

    public void updateStudent(Student student, Integer id) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        existingStudent.get().setStudentName(student.getStudentName());
        existingStudent.get().setEmail(student.getEmail());

        studentRepository.save(existingStudent.get());

    }

}
