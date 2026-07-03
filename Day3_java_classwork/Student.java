package com.coforge.day3;

public class Student {

	private int studentid;
	private String name;
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String name, String email) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.email = email;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	} 

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", email=" + email + "]";
	}

}
