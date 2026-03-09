package com.product.EMS.Service;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.product.EMS.Entity.Employee;
import com.product.EMS.Repsitory.EmployeeRepo;
@Service
public class EmployeeService {
	private EmployeeRepo jpa;
	
	public EmployeeService(EmployeeRepo jpa) {
		this.jpa = jpa;
	}
	public ModelAndView createEmp(Employee emp) {
		 Optional<Employee> e = jpa.findById(emp.getEmail());
		 ModelAndView m = new ModelAndView();
		 if(e.isPresent()) {
			 m.addObject("msg",emp.getName());
			 m.setViewName("exist");
			 return m;
		 }else {
			 m.addObject("msg", emp.getName());
			 m.setViewName("succesfull");
			 Employee empl = jpa.save(emp);
			 return m;
		 }
	}
}