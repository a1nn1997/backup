package com.test1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
	private int studentNo;
	private String studentName;
	private String studentAddress;
	public int getStudentNo() {
//		System.out.println("a1");
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
//		System.out.println("a2");
		this.studentNo = studentNo;
	}
	public String getStudentName() {
//		System.out.println("b1");
		return studentName;
	}
	public void setStudentName(String studentName) {
//		System.out.println("b2");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
//		System.out.println("c1");
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
//		System.out.println("c2");
		this.studentAddress = studentAddress;
	}


	public Student2() {
		super();
	}
	@Override
	public String toString() {
		return "Stud"
				+ "ent [studentId = "+ studentNo+ ", studentName = " + studentName + " studentCity = "+studentAddress +"]";
	}
	@PostConstruct
	public void start() {
		System.out.print("this is init");
	}
	@PreDestroy
	public void end() {
		System.out.print("this is destroy");
	}

}
