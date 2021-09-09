package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class AppWithdrawLimit {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");		  
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		//Account acc = new Account(8021, "Bob Brown", 200.0, 300.0);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		acc.withdraw(amount);		
		System.out.println(String.format("New balance: %.2f", acc.getBalance()));
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Something was wrong!");
		}
		
		sc.close();		
	}

}
