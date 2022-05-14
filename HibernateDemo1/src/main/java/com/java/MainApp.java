package com.java;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {

        Employee eob=new Employee();
		//eob.setEid(1);
		eob.setEname("Anitha");
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Employee.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
       Transaction tx=sess.beginTransaction();
       //to get the record based on id
       //select * from employee
       
       //Employee e= (Employee) sess.get(Employee.class, 1);
       //System.out.println(e);
       
       
       //retrieve all record
       
      /* Query q=sess.createQuery("from Employee");
      Iterator<Employee> e=q.iterate();
       while(e.hasNext())
       {
    	   Employee em=e.next();
    	   System.out.println(em.getEid()+","+em.getEname());
       }
       */
       // to delete a record
       
       Employee e=new Employee();
       e.setEid(4);
       sess.delete(e);
                    
        //sess.save(eob);
        tx.commit();

	}

}
