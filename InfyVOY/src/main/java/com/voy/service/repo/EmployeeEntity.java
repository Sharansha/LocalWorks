package com.voy.service.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {

	@Column(name="name")
	private String name;
	@Id
	@Column(name="emp_no")
	private Integer emp_No;
	@Column(name="mailID")
	private String mailID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmp_No() {
		return emp_No;
	}
	public void setEmp_No(Integer emp_No) {
		this.emp_No = emp_No;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	
	@Override
	public String toString() {
		return "EmployeeRepository [name=" + name + ", empNo=" + emp_No + ", mailID=" + mailID + "]";
	}
}
