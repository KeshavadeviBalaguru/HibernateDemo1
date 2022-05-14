package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //create table Student
@Table(name="MyEmployee")//different table in database
public class Employee {

		 @Id //primary key
		 @Column(name="EmployeeId" ,nullable=false)//not null
		 @GeneratedValue(strategy=GenerationType.AUTO)// to generate primary key automatically
	private int eid;
		 @Column(name="EmployeeName",nullable=false,length=30)
	private String ename;
	//generate setter and getter method 
	//generate toString
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
