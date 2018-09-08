package BankAccount;

public class BisnessAccount extends Account {
	private int balance;

	public BisnessAccount(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addBalance(int sum) {
		// TODO Auto-generated method stub
		return this.balance += sum;
	}

	@Override
	public int drawBalance(int sum) {
		// TODO Auto-generated method stub
		if (sum < balance) {
			balance -= sum;
		} else {
			System.out.println("NOT ENOUGH MONEY");
		}
		return balance;
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

}