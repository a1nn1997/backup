package com.test4;

import java.util.*;

public class a {
 private String name;
 private int age;
 private int rollNo;
 private List<String> lang;
 private b obj;

public a(String name, int age, int rollNo, List lang, b obj) {
	super();
	this.name = name;
	this.age = age;
	this.rollNo = rollNo;
	this.lang=lang;
	this.obj = obj;
}

public a() {
	super();
	// TODO Auto-generated constructor stub
}

 @Override
public String toString() {
	return "a [name=" + name + ", age=" + age + ", rollNo=" + rollNo +  ", languages known=" + lang + ", obj="+obj+ "]";
}
 
}
