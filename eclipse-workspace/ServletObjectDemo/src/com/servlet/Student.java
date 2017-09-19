package com.servlet;

import java.io.Serializable;
public class Student implements  Serializable{

	public Student()
	{}
		String firstName;
		String lastName;
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setFirstName(String name)
	{
		this.firstName=name;
	}
	public void setLastName(String lName)
	{
		this.lastName=lName;
	}
}
