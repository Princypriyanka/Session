package com.aeq.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Admin {
	void display(){
		System.out.println("");
		System.out.println("");
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		List am = session.createQuery("FROM AdminModel").list(); 
		System.out.println("Id:    Name: "); 
		for (Iterator iterator = am.iterator(); iterator.hasNext();){
		   AdminModel adminmodel = (AdminModel) iterator.next(); 
		  
		   System.out.println(adminmodel.getId()+"      " + adminmodel.getName()); 
		}
		session.close();
		
	}
	
	
public static void main(String[] args) throws NumberFormatException, IOException {
	
	Admin admin=new Admin();
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = null;
	//admin.display();
	AdminModel p=new AdminModel();
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("1.Add 2.Delete 3.Update 4.View");
System.out.println("Enter Option:-");
int option=Integer.parseInt(br.readLine());
switch (option)
{
case 1:
	 
     
	System.out.println("Enter id:-");
	int id=Integer.parseInt(br.readLine());
	System.out.println("Enter name:-");
	String name=br.readLine();
	p.setId(id);
	p.setName(name);
	tx = session.beginTransaction();
	session.save(p);
	System.out.println("Id and Name saved successfully.....!!");
	//admin.display();

	tx.commit();
	break;
case 2:
	System.out.println("Enter delete id:-");
	int deleteid=Integer.parseInt(br.readLine());
	p.setId(deleteid);
	tx = session.beginTransaction();
	session.delete(p);
	System.out.println("Id deleted successfully.....!!");
//	admin.display();

	tx.commit();
	
	break;
	
case 3:
	System.out.println("Enter update name:-");
	String updatename=br.readLine();
	System.out.println("Enter id:-");
	int updateid=Integer.parseInt(br.readLine());
	p.setName(updatename);
	p.setId(updateid);
	tx = session.beginTransaction();
	session.update(p);
	System.out.println("Name updated successfully.....!!");
	//admin.display();

	tx.commit();
	
	break;
case 4:
	 List am3 = session.createQuery("FROM AdminModel").list(); 
     for (Iterator iterator = am3.iterator(); iterator.hasNext();){
        AdminModel adminmodel = (AdminModel) iterator.next(); 
        System.out.println("Id: " + adminmodel.getId()+"   Name: " + adminmodel.getName()); 
     }
     
	break;
	}

session.close();
factory.close();


}
}