package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap=new HashMap<Integer, String>();
		employeeMap.put(101, "Santosh");
		employeeMap.put(103, "shubham");
		employeeMap.put(1041, "shashank");
		employeeMap.put(12, "Vaibhav");
		
		System.out.println(employeeMap);
	}
	
	
}
