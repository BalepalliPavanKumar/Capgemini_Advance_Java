package com.onetomanymapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setStu_Id(101);
		s1.setName("abhi");
		s1.setBranch("CSE");
		
		Student s2 = new Student();
		s2.setStu_Id(102);
		s2.setName("ram");
		s2.setBranch("ECE");
		
		Student s3 = new Student();
		s3.setStu_Id(103);
		s3.setName("ravi");
		s3.setBranch("CSE");
		List<Student> stu = new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		
		College c1 = new College();
		c1.setClgId(1);
		c1.setName("NIT");
		c1.setLocation("WGL");
		c1.setPincode("506000");
		
		c1.setStu(stu);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		et.commit();
		
		
	}

}