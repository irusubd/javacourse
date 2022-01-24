package curs9;

public abstract class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner;

	public Account(int accountNumber, double balance, Customer accountOwner) {
		setAccountNumber(accountNumber);
		this.balance = balance;
		this.accountOwner = accountOwner;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	abstract void withdraw(int amount) throws InsufficientFundsException;

}
