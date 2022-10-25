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
    public void updateStudent(@RequestBody Student student , @PathVariable Integer id) {
        studentService.updateStudent(student , id);
       
    }
    
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "Deleted Successfully";
    }
}





//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.SpringCRUD.app.topic.Topic;
//
//import java.util.List;
//
//
//
//@Controller
//public class StudentController {
//    @Autowired
//    private StudentService service;
//
//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//        List<Student> liststudent = service.listAll();
//        model.addAttribute("liststudent", liststudent);
//        System.out.print("Get / ");
//        return "index";
//    }
//    
//    
//    @PostMapping("/registration")
//    public Student addDetails(@RequestBody Student Student) {
//        return StudentService.addDetails(Student);
//    }
//    
//    @GetMapping("/new")
//    public String add(Model model) {
//        model.addAttribute("student", new Student());
//        return "new";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveStudent(@ModelAttribute("student") Student std) {
//        service.save(std);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
//        ModelAndView mav = new ModelAndView("new");
//        Student std = service.get(id);
//        mav.addObject("student", std);
//        return mav;
//
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String deletestudent(@PathVariable(name = "id") int id, RedirectAttributes attributes) {
//        service.delete(id);
//        attributes.addFlashAttribute("success","The student has deleted !");
//        return "redirect:/";
//    }
//    
//
//}
//
//
//
