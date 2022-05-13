package com.mindgate.pojo;

public class saving  extends Account{
	
// variable
	
private boolean isSalary;

/// constructor

public saving() {
System.out.println("default constructor of saving");

}

public saving(int accountNumber, String name, double balance, boolean isSalary) {
	super(accountNumber, name, balance);
	this.isSalary = isSalary;
    System.out.println("overloaded constructor of savings");
}
 
// withdraw method
@Override
	public boolean withdraw(double amount) {
      if(isSalary && amount <= getBalance()){
    	  setBalance(getBalance()-amount);
    	  return true;
      }
      if(isSalary==false && getBalance()-amount>=1500) {
    	  setBalance(getBalance()-amount);
    	  return true;
      }
      return false;
}

//deposit method
@Override
	public boolean deposit(double amount) {
	if(amount>0) {
		setBalance(getBalance()+amount);
		return true;
	}
	return false;
	}

public boolean isIssalary() {
	return isSalary;
}

public void setIssalary(boolean issalary) {
	this.isSalary = issalary;
}
 
//to string

@Override
public String toString() {
	return "saving [issalary=" + isSalary + ", toString()=" + super.toString() + "]";
}




}
