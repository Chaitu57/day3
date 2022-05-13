package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	private String userId;
	private String name;
	private int age;
	public void acceptUserDetails(){
		try {Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter the userId");
		    userId= scanner.next();
		    System.out.println("Enter the name");
			name=scanner.next();
			System.out.println("enter age");
			age=scanner.nextInt();
			
		} catch (InputMismatchException e) {
           System.out.println(e.getMessage());
           System.out.println("Invalid Input from user");
           System.out.println("please enter valid values");
		}
	
	}	
	
	public void displayUserDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
		
		
	}
	

}
