package com.example.demo3;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Demo3Application {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private LocalUserRepository localUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@PostConstruct
	public void initData() {
		this.localUserRepository.save(new LocalUser("user", passwordEncoder.encode("password")));
	}

}
