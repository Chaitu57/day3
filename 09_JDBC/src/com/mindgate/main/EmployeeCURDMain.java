package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCURDMain {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		int resultCount = 0;
		String sqlQuery = null;
           
		Connection connection;
//		Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resultSet;
		System.out.println("Insert Example");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
			sqlQuery = "INSERT INTO employee_details(name, salary) VALUES(?,?)";
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1,"chaitanya");
			preparedStatement.setDouble(2, 5000);
			
			resultCount=preparedStatement.executeUpdate();
//			resultCount = statement.executeUpdate(sqlQuery);///// sql injection
			connection.close();
			if (resultCount > 0) {
				System.out.println("Record Insterted sucessfully  ");
			} else {
				System.out.println("Failed To Insert Record ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
		//	statement=connection.createStatement();
			sqlQuery="update  employee_details set name=?,salary=? where employee_id=?";
		     preparedStatement=connection.prepareStatement(sqlQuery);
		     preparedStatement.setString(1, "kiran");
		     preparedStatement.setDouble(2, 5000);
		     preparedStatement.setInt(3, 3);
			//resultCount=statement.executeUpdate(sqlQuery);
		     resultCount=preparedStatement.executeUpdate();
		     
			connection.close();
			if(resultCount>0) {
				System.out.println("update susseful");
			}
			else {
				System.out.println("update failed");
			}
		} catch (ClassNotFoundException | SQLException e) {
          System.out.println("exception!!");
          System.out.println(e.getMessage());
		}
		
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
//			statement=connection.createStatement();
			sqlQuery="delete employee_details where employee_id=?";
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 3);
			resultCount=preparedStatement.executeUpdate(sqlQuery);
			if(resultCount>0) {
				System.out.println("delete sucessfull");
			}
			else {
				System.out.println("delete unsucessfull");
			}
		} catch (ClassNotFoundException | SQLException e) {
System.out.println("exception!!");
System.out.println(e.getMessage());
		}
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			sqlQuery="select* from employee_details";
			preparedStatement=connection.prepareStatement(sqlQuery);
			resultSet=preparedStatement.executeQuery(sqlQuery);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("employee_id"));
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getDouble("salary"));
				System.out.println("_".repeat(50));
				connection.close();	
			}
		} catch (ClassNotFoundException | SQLException e) {
			
		System.out.println("exception");
		System.out.println(e.getMessage());
		
		}
	}
}
