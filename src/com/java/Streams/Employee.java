package com.java.Streams;

public class Employee {
	int id;

	String name;
	float salary;
	int age;
	String dept; 
	String gender;
	String status;
	int DOJ;
	public Employee(int id, String name, float salary, int age, String dept, String gender, String status, int dOJ) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
		this.gender = gender;
		this.status = status;
		DOJ = dOJ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float d) {
		this.salary = d;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDOJ() {
		return DOJ;
	}
	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept
				+ ", gender=" + gender + ", status=" + status + ", DOJ=" + DOJ + "]";
	}
	
	
}
