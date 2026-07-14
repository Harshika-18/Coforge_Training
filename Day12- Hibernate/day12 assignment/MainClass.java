package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//each transaction needs one session
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		
		//Student student1 = new Student(101, "Harshika");
		Student student2 = new Student(102, "Neha");
		Student student3 = new Student(103, "Satvika");
		Student student4 = new Student(104, "Aniketh");
		
		//Course course1 = new Course(2, "Python");
		Course course2 = new Course(1, "Java");
		Course course3 = new Course(3, "Hibernate");
		
		
		//session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(course3);
		session.save(course2);
		
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Done");
	}

}
