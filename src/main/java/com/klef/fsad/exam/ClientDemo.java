package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ClientDemo {

	public static void main(String args[]) {
		addBooking();
		viewAllBookings();
	}

	public static void addBooking() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Booking b = new Booking();
		b.setId(1);
		b.setName("Jaydev");
		b.setDate("2026-03-13");
		b.setStatus(true);

		session.save(b);

		t.commit();
		session.close();
		sf.close();
	}

	public static void viewAllBookings() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		String hql = "from Booking";   
		Query<Booking> query = session.createQuery(hql, Booking.class);

		List<Booking> bookings = query.list();

		for(Booking b : bookings) {
			System.out.println(b);
		}

		session.close();
		sf.close();
	}
}