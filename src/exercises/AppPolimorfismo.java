package exercises;

import entities.Account;
import entities.SavingsAccount;

public class AppPolimorfismo {
	
	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		//Account y = new Account(123, "teste", 100.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		System.out.println("x: " + x.getBalance());
		System.out.println("y: " + y.getBalance());
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("x: " + x.getBalance());
		System.out.println("y: " + y.getBalance());	
	
	}
}
