package com.examplege.example.test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examplege.example.test.models.Student;
import com.examplege.example.test.services.StudentService;

@RestController
public class testController {

   private final StudentService studentService;


   /* DEPENDENCY INJECTION   */
   @Autowired
    public testController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> index() {
        return studentService.getStudents();
    }  

}
