package com.test2;
import java.util.*;
public class Students {
	private String name;
	private List<String> phoneNumbers;
	private Set<String> addresses; 
	private Map<String,String> courses;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(String name, List<String> phoneNumbers, Set<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", phoneNumbers=" + phoneNumbers + ", addresses=" + addresses + ", courses="
				+ courses + ", props=" + props + "]";
	}
	
}
