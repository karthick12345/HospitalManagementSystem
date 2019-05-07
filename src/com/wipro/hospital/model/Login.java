package com.wipro.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "login")
	@SequenceGenerator(name = "login", sequenceName = "patient_id_seq")
	private String id;
	
private String pw;

private int age;
private String des;
private String place;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

	
}
