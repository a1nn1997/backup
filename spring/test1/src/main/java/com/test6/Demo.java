package com.test6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d")

public class Demo {
	//static method
	//@Value("#{ T(java.lang.Math).sqrt(16) }")
	@Value("#{ T(java.lang.Math).E }")  //static value
	private double x;
	@Value("#{5*3+2}") //expression
	private int y;
	@Value("#{ new java.lang.String('Hello Poppy') }")  //create objects
	private String z;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(double x, int y, String z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
