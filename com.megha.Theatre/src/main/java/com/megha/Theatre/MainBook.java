package com.megha.Theatre;
	import org.hibernate.Session;
	import org.hibernate.Transaction;
	public class MainBook {
	public static void main(String[] args) {
	Theatre a = new Theatre(1,"Tu Jhoothi main Makkar");
	Theatre b = new Theatre(2,"Shehzada");
	Theatre c = new Theatre(3,"Pathaan");
	Theatre d = new Theatre(4,"Mission Majnu");
	Theatre e = new Theatre(5,"Bholaa");
	Transaction txn;
	try(Session session = HibernateUtil.getSessionFactory().openSession()){
	txn = session.beginTransaction();
	session.save(a);
	session.save(b);
	session.save(c);
	session.save(d);
	session.save(e);
	txn.commit();
	}
	}
	}

