package com.wipro.hospital.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.hospital.model.Login;
@Repository("hospitalDao")
public class HospitalDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public String doRegister(Login login) {
		sessionFactory.getCurrentSession().save(login);
		return "login";
	}
	
	public List<Login> getAllpatient() {
		List login = sessionFactory.getCurrentSession().createCriteria(Login.class).list();
		return login;
	}

	private Login getLogin(int id) {

		return (Login) sessionFactory.getCurrentSession().get(Login.class, id);
}
	public void doDelete(int id) {
		sessionFactory.getCurrentSession().delete(getLogin(id));
	}

	



}
