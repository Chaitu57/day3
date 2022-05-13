package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {

public static void main(String[] args) {
	 
System.out.println(" WELCOME TO XYZ BANK");

Scanner scanner=new Scanner(System.in);

 int AccountNumber;
 String name;
 double balance;
 int amount;
 boolean result;
 String continueChoice;
 
 System.out.println("Enter the accountNumber");
   AccountNumber=scanner.nextInt();
   System.out.println("Enter the name");
  name=scanner.next();
  System.out.println("Enter the balance");
  balance=scanner.nextDouble();
  
  Account account=new Account(AccountNumber,name,balance);
  
  System.out.println("Account open successfully");
  System.out.println("-----------------");
  do {
  System.out.println("menu");
  System.out.println("1.withdraw");
  System.out.println("2.deposit");
  System.out.println("3.balance");
  
  int choice= scanner.nextInt();
	 switch (choice) {
 
case 1: 
	System.out.println("Enter the amount to be withdraw");
   amount=scanner.nextInt();
    result =account.withdraw(amount);
if(result) {
	 System.out.println("transaction completed successfull");
	 System.out.println("balance:"+account.getBalance());
}
else {
	 System.out.println("transation failed");
	 System.out.println("balance"+account.getBalance());
}
	break;
case 2:System.out.println("Enter the amount to be deposite");
       amount=scanner.nextInt();
      result =account.deposit(amount);
if(result) {
 System.out.println("transaction completed successfull");
 System.out.println("balance:"+account.getBalance());
}
else {
 System.out.println("transation failed");
 System.out.println("balance"+account.getBalance());
}
	
	break;
case 3:System.out.println("balance"+account.getBalance());

     break;
     
default:
	System.out.println("invalid choice");
	break;
	
	 }
	 System.out.println("do you want to conyinue");
	 continueChoice=scanner.next();
  }
  while(continueChoice.equals("yes"));
  System.out.println("thank you for banking with us");
  }
}

