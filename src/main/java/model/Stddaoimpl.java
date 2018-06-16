package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
@Repository
public class Stddaoimpl implements Stddao {

	public List<Stddtls> alllist() {
		Configuration con= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		List<Stddtls> allstudentlist=session.createQuery("from Stddtls").list();
		session.close();
		return allstudentlist;
	}

	public Stddtls login(String mobile) {
		Configuration con= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf =con.buildSessionFactory();
		Session session=sf.openSession();
		//Transaction tx=session.beginTransaction();
		System.out.println(mobile);
		Query q=session.createQuery("from Stddtls");
		System.out.println(q);
		List<Stddtls> allstdlist=q.list();
		System.out.println(allstdlist);
		for(Stddtls stdlst:allstdlist) {
			if(stdlst.getStdMobleno().equals(mobile)) {
				System.out.println(stdlst);
				return stdlst;
			}
		}
		
		//session.close();
		return null;
	}
	
	

}
