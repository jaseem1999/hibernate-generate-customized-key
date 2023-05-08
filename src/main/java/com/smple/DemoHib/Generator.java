package com.smple.DemoHib;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class Generator implements IdentifierGenerator {
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub 
		System.out.println("Enter the ID ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		return "AJK"+id;

	}
}
