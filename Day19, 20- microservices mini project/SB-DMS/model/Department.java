package com.coforge.dms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_department")
public class Department {
	@Id
	@Column(name = "dno", length=5)
	private int dno;
	
	@Column(name = "dname", length=50)
	private String dname;
	
	public Department() {
		super();
	}
	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}
}
