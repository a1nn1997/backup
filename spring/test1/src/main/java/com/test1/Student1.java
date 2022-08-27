package com.test1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 implements InitializingBean, DisposableBean {
	private int studentNo;
	private String studentName;
	private String studentAddress;
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student1 [studentNo=" + studentNo + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("init methods");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("destroy methods");
		
	}
}
