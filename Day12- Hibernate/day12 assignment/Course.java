package com.coforge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity 
@Table(name = "tbl_course")
public class Course {
	@Id 
	@Column(name = "cid", length =5)
	private int course_id;
	
	@Column(name = "cname", length =30)
	private String course_name;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students;
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", students=" + students + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}
}
