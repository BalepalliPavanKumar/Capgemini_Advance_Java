package com.product.EMS.Repsitory;



import org.springframework.data.jpa.repository.JpaRepository;

import com.product.EMS.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>{
	
	

}