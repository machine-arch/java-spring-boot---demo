package com.examplege.example.test.Controllers;

import com.examplege.example.test.GameRuner;
import com.examplege.example.test.MarioGame;
import com.examplege.example.test.configurationClass;
import com.examplege.example.test.models.Student;
import com.examplege.example.test.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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
    
    @GetMapping("/run_mario_game")
    public String test() {

       var context=new AnnotationConfigApplicationContext(configurationClass.class);

        var  MarioGame= new MarioGame();
		var GameRuner = new GameRuner(MarioGame);
		var response= context.getBean("Person").toString();

        return Arrays.stream(context.getBeanDefinitionNames()).reduce("",(a,b)->a+" "+b);
    }

}
