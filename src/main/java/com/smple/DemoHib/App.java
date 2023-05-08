package com.smple.DemoHib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	int id;

    public static void main( String[] args )
    
    {
        StudentDTO st1  = new StudentDTO();
        Scanner sc = new Scanner(System.in);
        int i = 1;

        do {
        	System.out.print("You want enter Details (1 = Yes, 0 = No)");
        	 i = sc.nextInt();
        	 System.out.println("Enter name and color");
        	 String name = sc.next();
        	 String color = sc.next();
        	 st1.setName(name);
             st1.setColor(color);
             Configuration cfg = new Configuration().configure().addAnnotatedClass(StudentDTO.class);
             SessionFactory sf = cfg.buildSessionFactory();
             Session session = sf.openSession();
             Transaction tx = session.beginTransaction();
             session.save(st1);
             tx.commit();
             System.out.println("Insertion Successfully");
		} while (i != 0);
        
       
    }
}
