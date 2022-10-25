package com.Ecommerce.Ecommerce;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	
	
    
    @Autowired
    StudentRepository studentRepository;
    
//    PasswordEncoder passwordEncoder;
//	public StudentService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
//	    this.studentRepository = studentRepository;
//	    this.passwordEncoder = new BCryptPasswordEncoder();
//	  }
    
    		
    
    
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    
    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }
    
    public Student addStudent( Student student ) {
        
        return studentRepository.save(student);
    }
    
    public void deleteStudent(Integer id) {
        
        studentRepository.deleteById(id);
    }
    
    public void updateStudent(Student student , Integer id) {
//    	String encodedPassword =  this.passwordEncoder.encode(student.getPassword());
        Optional<Student> existingStudent = studentRepository.findById(id);
        existingStudent.get().setStudentName(        student.getStudentName()        );
        existingStudent.get().setCourse( student.getCourse() );
        existingStudent.get().setFee( student.getFee() );
        existingStudent.get().setAddress( student.getAddress() );
        existingStudent.get().setPhone( student.getPhone() );
        existingStudent.get().setEmail( student.getEmail() );
        existingStudent.get().setPassword( student.getPassword() );
        
//        existingStudent.get().setPassword(encodedPassword);
        
        studentRepository.save(existingStudent.get());
        
    }

}



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentService {
//    @Autowired
//    private StudentRepository repo;
//
//    public List<Student> listAll() {
//
//        return repo.findAll();
//    }
//
//    public void save(Student std) {
//        repo.save(std);
//    }
//
//    public Student get(long id) {
//        return repo.findById(id).get();
//
//    }
//    public void delete(long id) {
//
//        repo.deleteById(id);
//    }
//
//
//   
//
//}
//
//
