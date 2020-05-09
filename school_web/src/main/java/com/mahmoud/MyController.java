package com.mahmoud;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import beans.Student;
import beans.StudentDao;

@Controller
public class MyController {
	private ApplicationContext context;


	@RequestMapping("/")
	public String display() {  
        return "login";  
    } 
	
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username , Model model){
		System.out.println("ss Username = "+username);
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = (StudentDao) context.getBean("StudentDao");
		List<Student> students = studentDao.getStudents();
		if(students != null) {
		System.out.println("students = "+students.size());
		}else {
			System.out.println("Empty student list");
		}
		model.addAttribute("students", students);
		model.addAttribute("username", username);
	 
		return "home";
	}
}
