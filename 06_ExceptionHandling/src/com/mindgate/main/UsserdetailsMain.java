package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UsserdetailsMain {
 public static void main(String[] args) { 
	 System.out.println("Main start");
	 UserDetails details=new UserDetails();
	 details.acceptUserDetails();
	details.displayUserDetails();
	System.out.println("Main Ends");
	
	Class.forName("com.mindgate.pojo.UserDetails");
}
}
