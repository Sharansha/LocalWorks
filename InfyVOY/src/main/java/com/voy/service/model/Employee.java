package com.voy.service.model;

public class Employee {

	private String name;
	private int empNo;
	private String mailID;
	public Employee(String name, int empNo, String mailID) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.mailID = mailID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
		result = prime * result + ((mailID == null) ? 0 : mailID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNo != other.empNo)
			return false;
		if (mailID == null) {
			if (other.mailID != null)
				return false;
		} else if (!mailID.equals(other.mailID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", mailID=" + mailID + "]";
	}
	
	

	
}
