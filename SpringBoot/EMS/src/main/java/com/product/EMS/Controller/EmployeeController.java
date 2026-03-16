package com.product.EMS.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.product.EMS.Entity.Employee;
import com.product.EMS.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	@GetMapping("/signup")
	public String signUp() {
		return "signup";
	}
	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute Employee emp) {
		return service.createEmp(emp);
		
	}

}