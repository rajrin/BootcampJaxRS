package com.bootcamp.jaxrs;

public class SimpleBean {
	public	String	fname;
	public	String	lname;
	public  int  	age;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return "Age of "+fname+" "+lname+" is "+age;
	}
}
