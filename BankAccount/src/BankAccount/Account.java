package BankAccount;

public abstract class Account {
	private String name;
	private String surname;
	private int balance = 0;

	public Account(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public abstract int addBalance(int sum);

	public abstract int drawBalance(int sum);

	public abstract int getBalance();

	/*
	 * public int getBalance() { return this.balance; }
	 * 
	 * 
	 * public int addBalance(int sum) { this.balance += sum; return balance; }
	 * 
	 * public int drawBalance(int sum) { if(sum<balance) { balance -= sum; }else {
	 * System.out.println("NOT ENOUGH MONEY BAE"); } return balance; }
	 * 
	 * 
	 * public String userInfo() { return "Name: " + name +" Surname :" +" Balance :"
	 * + balance; }
	 */
}
