package com.examplege.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.examplege.example.test.Controllers.testController;
import com.examplege.example.test.services.StudentService;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
		StudentService studentService = new StudentService();
		testController test = new testController(studentService);
		Object result = test.index();
		System.out.println(result);

	}
	

}
