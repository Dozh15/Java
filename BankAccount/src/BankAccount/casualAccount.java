package BankAccount;

public class casualAccount extends Account {
	private int balance;
	private int limit;
	private int limitLeft;

	public casualAccount(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	public int setLimit(int sk) {
		this.limit = sk;
		this.limitLeft = limit;
		return limit;
	}

	public int getLimitLeft() {
		return this.limitLeft;
	}

	public int getLimit() {
		return this.limit;
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
			if (limitLeft > sum) {
				this.limitLeft -= sum;
				this.balance -= sum;
			} else {
				System.out.println("No limit left");
			}
			// balance -= sum;
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
