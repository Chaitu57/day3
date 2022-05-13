package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDao {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	// add new employee
	public boolean addnewEmployee(Employee employee)
 {
	if(employee !=null)
	{
		return employeeSet.add(employee); 
	}
 
	 return false; 
}

	// update existing employee
	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employeeSet) {
			if (emp.getEmployeeId() == employee.getEmployeeId()) {
				emp.setName(employee.getName());
		        emp.setSalary(employee.getSalary());   
		return true;
	}
}
		return false;
	}

	// delete employee

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId()==employeeId) {
				employeeSet.remove(employee);
			}
		}
		return false;
	}

	// get single employee by employee id
	public Employee getEmployeebyEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId()==employeeId) {
				return employee;
			}
		}
		return null;

	}

	// get all the employee
	public Set<Employee> getAllEmployee() {
		return employeeSet;
	}

}
