package com.example.demo2;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

	@Autowired
	private StudentRepository students;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@PostConstruct
	public void initData() {
		students.save(new Student("alice", "female", 8));
	}

	@GetMapping("/student")
	public List<Student> listAllStudents() {
		return students.findAll();
	}

}
