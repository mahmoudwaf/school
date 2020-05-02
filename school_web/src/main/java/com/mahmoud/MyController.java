package com.mahmoud;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String display() {  
        return "login";  
    } 
	
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username , Model model){
		System.out.println("Username = "+username);
		model.addAttribute("username", username);
	 
		return "home";
	}
}
