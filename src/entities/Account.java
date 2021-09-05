package entities;

public class Account {
	private Integer number;
	private String holder;
	protected double balance;
	
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
	
	public void deposit(Double amount) { // final evita sobreposição desse método (Override)
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
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