package curs9;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}

	@Override
	void withdraw(int amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException();
		} else {
			balance = balance - amount;
		}
	}

}
