package com.test7;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	@Value("7")
	private int studentNo;
	@Value("poppy the pug")
	private String studentName;
	@Value("ajmer")
	private String studentAddress;
	private Desk desk;
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
	
	public Desk getDesk() {
		return desk;
	}
	public void setDesk(Desk desk) {
		this.desk = desk;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNo, String studentName, String studentAddress, Desk desk) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.desk = desk;
	}
	public Student(Desk desk) {
		super();
		this.desk = desk;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", desk=" + desk + "]";
	}
	
}
