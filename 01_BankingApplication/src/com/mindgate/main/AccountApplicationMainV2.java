package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {

	public static void main(String[] args) {
        Account account=new Account(101,"chaitanya raykar",1000);
         boolean result =account.withdraw(300);
         if(result) {
        	 System.out.println("transaction completed successfull");
        	 System.out.println("balance:"+account.getBalance());
         }
         else {
        	 System.out.println("transation failed");
        	 System.out.println("balance"+account.getBalance());
         }
         
         System.out.println("-".repeat(50));
         
          result=account.deposit(500);
          if(result) {
        	 System.out.println("transaction completed successfull");
        	 System.out.println("balance:"+account.getBalance());
          }
          else {
         	 System.out.println("transation failed");
         	 System.out.println("balance"+account.getBalance());
	}

	}
}
