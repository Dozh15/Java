package BankAccount;

public class Bank {

	public static void main(String[] args) {
		BisnessAccount bi1 = new BisnessAccount("jonas", "jonaitis");
		bi1.addBalance(500);
		bi1.drawBalance(600);
		System.out.println(bi1.getBalance());
		System.out.println("");

		casualAccount ca1 = new casualAccount("tomas", "tomulis");
		System.out.println(ca1.getBalance());
		ca1.addBalance(500);
		System.out.println(ca1.getBalance());
		ca1.setLimit(1000);
		System.out.println(ca1.getLimit());
		ca1.addBalance(2000);
		ca1.drawBalance(200);
		System.out.println(ca1.getBalance());

	}

	/*
	 * Business account doesnt have limits.
	 * 
	 * casual account has limits you can set.
	 * 
	 * 
	 */
}
