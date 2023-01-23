package com.examplege.example.test.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.examplege.example.test.models.Student;

@Service
public class StudentService {

    public List<Student>  getStudents(){
        return List.of(
            new Student("John", "dsdsds", "dsdsds", "dsdsds"),
            new Student("John", "dsdsds", "dsdsds", "dsdsds"),
            new Student("John", "dsdsds", "dsdsds", "dsdsds")
        );
    }
    
}
