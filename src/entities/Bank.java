package entities;

public class Bank {
	
	private int accountNumber;
	public String name;
	private double initialDeposit;
	
	public Bank() {		
	}
	
	public Bank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.initialDeposit = initialDeposit;
	}
		
	public Bank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getInitialDeposit() {
		return initialDeposit;
	}
	
	public void deposit(double deposit) {
		this.initialDeposit += deposit;
	}	
	
	public void withdraw(double withdraw) {
		this.initialDeposit = initialDeposit - withdraw - 5.00;
	}

	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $" 
				+ String.format("%.2f", initialDeposit);
	}
		
}
