package com.Example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

    public static void main(String[] args) {

        // Create EntityManagerFactory
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("postgres");

        // ---------- Save Aadhar and Room ----------
        EntityManager em1 = emf.createEntityManager();
        em1.getTransaction().begin();

        AadharCard aadhar = new AadharCard("1234-5678-9999");
        HostelRoom room = new HostelRoom("H-101");

        em1.persist(aadhar);
        em1.persist(room);

        em1.getTransaction().commit();
        em1.close();

        // ---------- Create Student ----------
        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();

        Student student = new Student("Pavan", aadhar, room);
        em2.persist(student);

        em2.getTransaction().commit();
        em2.close();

        // ---------- Fetch Student ----------
        EntityManager em3 = emf.createEntityManager();

        Student s = em3.find(Student.class, student.getId());

        System.out.println("Student: " + s.getName());
        System.out.println("Aadhar: " + s.getAadharCard().getNumber());
        System.out.println("Room: " + s.getHostelRoom().getRoomNumber());

        em3.close();

        // ---------- Delete Student ----------
        EntityManager em4 = emf.createEntityManager();
        em4.getTransaction().begin();

        Student deleteStudent =
                em4.find(Student.class, student.getId());

        em4.remove(deleteStudent);

        em4.getTransaction().commit();
        em4.close();

        // Close factory
        emf.close();
    }
}
