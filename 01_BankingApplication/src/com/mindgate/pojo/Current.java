package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println(" default constructor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdreaftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdreaftBalance;
		initialOverdraftBalance= overdreaftBalance;
		System.out.println("Overloaded constructor of current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) { // amount = 5000 balance = 10000
				setBalance(getBalance() - amount);
				return true;
			}
			if (amount <= getBalance() + overdraftBalance) { // amount = 20000 balance = 5000 overdraft = 50000
				amount = amount - getBalance(); // amount 20000 balance = 5000

				setBalance(0);
				overdraftBalance = overdraftBalance - amount;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (initialOverdraftBalance > overdraftBalance) {
				if (amount < (initialOverdraftBalance - overdraftBalance)) {
					overdraftBalance = overdraftBalance + amount;
					return true;
				} else {
					amount = amount - (initialOverdraftBalance - overdraftBalance);
					setBalance(getBalance() + amount);
					overdraftBalance = initialOverdraftBalance;
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
