package com.test6;
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
	@Value("#{friends}")
	private List<String> add;
	
	public List getAdd() {
		return add;
	}
	public void setAdd(List add) {
		this.add = add;
	}
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNo, String studentName, String studentAddress,List add) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.add=add;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", add=" + add+ "]";
	}
	
}
