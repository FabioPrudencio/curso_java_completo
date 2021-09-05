package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AppBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		Account conta;
		if (response == 'y') {		
			System.out.print("Enter initial deposit value: ");
			double inicial = sc.nextDouble();
			conta = new Account(numberAccount, holder, inicial);
		} else {
			conta = new Account(numberAccount, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");		
		conta.deposit(sc.nextDouble());		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");		
		conta.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}

}
