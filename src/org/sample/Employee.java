package org.sample;

import java.nio.charset.MalformedInputException;

public class Employee {
	public static int a=12;
	public void add() {
		a=10;
		System.out.println(a+1);
	}
	public static void main(String[] args) {
		int a=2;
		System.out.println(a);
		Employee e=new Employee();
		e.add();
		
	}
	/*private void empId() {
		System.out.println("emp id is 44444");
		
	}
	private void empName() {
		System.out.println("emp name is raj");
		
	}
	
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();*/
}

