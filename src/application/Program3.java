package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		System.out.print("Enter account number: ");
		int accountNumber = entrada.nextInt();
		System.out.print("Enter account holder: ");
		entrada.nextLine();
		String name = entrada.nextLine();
		System.out.print("Is there na initial deposit? [y/n]: ");
		char response = entrada.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = entrada.nextDouble();
			bank = new Bank(accountNumber, name, initialDeposit);
		}
		else {
			bank = new Bank(accountNumber, name);
		}
				
		System.out.println("Initial data: ");
		System.out.println(bank);
		
		System.out.print("Enter a deposit value: ");
		double deposit = entrada.nextDouble();
		bank.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = entrada.nextDouble();
		bank.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		entrada.close();	

	}

}
