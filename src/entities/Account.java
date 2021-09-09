package entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	protected double balance;
	private Double withdrawLimit;

	public Account() {
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}	
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		deposit(balance);
	}
	
	public Account(Integer number, String holder, double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}	

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) { // final evita sobreposição desse método (Override)
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " +
				this.number +
			   ", Holder: " + 
			   this.holder +
			   ", Balance: $" +
			   String.format("%.2f", this.balance);
				
	}	
}