package com.test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
	@Autowired   //for type annotations
	// @Qualifier("temp2")  //resolve conflict in case of multiple annotation
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired  // for setter annotations by name
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired  // for constructor annotations
	public Emp1(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
}
