package com.mindgate.Main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDao;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		
		int choice;
		int employeeId ;
		String name;
		double salary ;
		String continueChoice;
		boolean result;
		Scanner scanner = new Scanner(System.in);
		do {
		
		System.out.println("Select from given choices");
		System.out.println("1.Add New Employee");
		System.out.println("2.Update employee");
		System.out.println("3.Delete employee");
		System.out.println("4.Get Single Employee details");
		System.out.println("5.Get All employee Details");

		EmployeeDao dao = new EmployeeDao();
		Employee employee;

		choice = scanner.nextInt();

		switch (choice) {
		case 1: 
			System.out.println("Enter EmployeeId");
			 employeeId = scanner.nextInt();

			System.out.println("Enter the Name");
			 name = scanner.next();

			System.out.println("Enter the salary");
			salary = scanner.nextDouble();
			
			employee = new Employee(employeeId, name, salary);
			if (dao.addnewEmployee(employee)) {
				System.out.println("Account created Successfull!!");
				System.out.println(dao.getAllEmployee());
			}

			break;
		case 2: 
			System.out.println("Enter EmployeeId");
			 employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			 name = scanner.next();
			System.out.println("Enter salary");
			 salary = scanner.nextDouble();
			employee = new Employee(employeeId, name, salary);
			if (dao.updateEmployee(employee)) {
				System.out.println("Employee details updated");
			}
		
			break;
			
		case 3:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				employee = new Employee();
				result= (dao.deleteEmployeeByEmployeeId(employeeId));
				if(result) {
					System.out.println("employee deleted");
				}
				break;
				
			case 4:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				employee=dao.getEmployeebyEmployeeId(employeeId);
                 if(employee!=null)
                 {
                	 System.out.println(employee);
                 }
                 
              
                 
				break;

			case 5:
//				System.out.println(dao.getAllEmployee());
			Set<Employee> importedDetails = dao.getAllEmployee();
		
					System.out.println(importedDetails);

				break;
		}
		System.out.println("Do you Want to Continue\n yes/no");
		continueChoice=scanner.next(); 
}while (continueChoice.equalsIgnoreCase("yes"));
}
}
	
//				System.out.println("Do you Want to Continue\n yes/no");
//				continueChoice=scanner.next();
//			 while (continueChoice.equalsIgnoreCase("yes")); 
				


	



