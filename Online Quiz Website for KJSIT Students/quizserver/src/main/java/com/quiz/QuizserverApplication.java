package com.quiz;

import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class QuizserverApplication  {
//@SpringBootApplication
//public class QuizserverApplication implements CommandLineRunner {
//
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(QuizserverApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Starting code");
//
//		User user= new User();
//
//		user.setFirstName("Tirth");
//		user.setLastName("Panchal");
//		user.setUsername("tirth.3132");
//		user.setPassword(this.bCryptPasswordEncoder.encode("tirth@3132"));
//		user.setEmail("tbp3132@gmail.com");
//		user.setProfile("default.png");
//
//		Role role1 =new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//
//		userRole.setRole(role1);
//
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 =this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
//
//
//	}


}
