package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private long emp_id;
	
	@Column(name = " emp_nmae")
	private String name;
	
	@Column(name = " emp_gmail")
	private String emp_gamil;
	
	@Column(name =" emp_salary")
	private Float emp_salary;
	
	@Column(name =" emp_age")
	private int emp_age;
	
	@Column(name = "emp_city")
	private String emp_city;

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmp_gamil() {
		return emp_gamil;
	}

	public void setEmp_gamil(String emp_gamil) {
		this.emp_gamil = emp_gamil;
	}

	public Float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(Float emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public Employee(long emp_id, String name, String emp_gamil, Float emp_salary, int emp_age, String emp_city) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.emp_gamil = emp_gamil;
		this.emp_salary = emp_salary;
		this.emp_age = emp_age;
		this.emp_city = emp_city;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", emp_gamil=" + emp_gamil + ", emp_salary="
				+ emp_salary + ", emp_age=" + emp_age + ", emp_city=" + emp_city + "]";
	}
	

}
