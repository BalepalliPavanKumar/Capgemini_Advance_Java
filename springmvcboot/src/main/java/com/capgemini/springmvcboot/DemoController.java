package com.capgemini.springmvcboot;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class DemoController {
	
	@Autowired
	UserRepository jpa;
	
	@GetMapping("/hello")
	public String getHi() {
		return "welcome";
	}
	@GetMapping("/register")
	public String createAccount() {
		return "register";
	}
	
//	@PostMapping("/create-account")
//	@ResponseBody
//	public void register(HttpServletRequest request) {
//		String name=request.getParameter("name");
//		 String email = request.getParameter("email");
//	     String password = request.getParameter("password");
//	     String gender = request.getParameter("gender");
//	     String country = request.getParameter("country");
//	     
//	     System.out.println(name);
//	     System.out.println(email);
//	     System.out.println(password);
//	     System.out.println(gender);
//	     System.out.println(country);
//	    
//	}\
//	@PostMapping("/create-account")
//	public String register(@ModelAttribute Users users) {
//		System.out.println(users.getName());
//		System.out.println(users.getCountry());
//		System.out.println(users.getEmail());
//		System.out.println(users.getGender());
//		System.out.println(users.getPassword());
//	
//		return "user registerd";
//	}
	@PostMapping("/create-account")
	public String register(@ModelAttribute Users users) {
		
		jpa.save(users);
		return "user registerd";
	
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/logincheck")
	public String logincheck(HttpServletRequest request) {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Users user=jpa.findByEmailAndPassword(email, password);
		if(user!=null) {
			return "loginsuccess";
		}else {
			return "redirect:login";
		}
	}
	@GetMapping("/hi")
	public ModelAndView sendData() {
		ModelAndView m=new ModelAndView();
		List<String> names=List.of("Miller","Allen","Jrdan");
		m.addObject("msg",names);
		m.setViewName("abc");
		return m;
	}
	
	

}
