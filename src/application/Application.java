package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = entrada.nextInt();
		System.out.print("Enter account holder: ");
		entrada.nextLine();
		String name = entrada.nextLine();
		System.out.print("Is there an initial deposit? (y/n)? ");
		char response = entrada.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = entrada.nextDouble();
			account = new Account(number, name, initialDeposit);
		}
		else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = entrada.nextDouble();
		account.deposit(amount);

		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = entrada.nextDouble();
		account.withdraw(amount);
				
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		entrada.close();
	}

}
