package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
public static void main(String[] args) {
	Set<String> nameSet= new HashSet<String>();
	 
	nameSet.add("vivek");
	nameSet.add("kiran");
	nameSet.add("chaitanya");
	nameSet.add("nitesh");
	nameSet.add("kiran");
	nameSet.add("vivek");
	
	System.out.println(nameSet);
	
	System.out.println("-".repeat(50));
	
	Employee employee1=new Employee(101, "vivek", 1000);
	System.out.println(employee1.hashCode());
	Employee employee2=new Employee(102, "chaitanya", 1000);
	System.out.println(employee2.hashCode());
	Employee employee3=new Employee(103, "kiran", 1000);
	System.out.println(employee3.hashCode());
	Employee employee4=new Employee(101, "vivek", 1000);
	System.out.println(employee4.hashCode());
	
	Set<Employee> employees=new HashSet<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	employees.add(employee3);
	employees.add(employee4);
	

	for (Employee employee : employees) {
		System.out.println(employee);
	}
	Integer a= Integer.valueOf(10);
	System.out.println(a.hashCode());
	
	String s=new String("hi");
	System.out.println(s.hashCode());
	s=s+"hello";
	System.out.println(s.hashCode());
}
}
