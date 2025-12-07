package oops.encapsulation;
// Encapsulation
class BankAccount{
	private double balance;
	public void deposit(double amount){
		// Enforce Business Logic
		if (amount<0) return;
		else balance+=amount;
	}
	public double getBalance(){
		return balance;
	}

}
public class Main {
	static void main() {
		System.out.println("Encapsulation");
		/*
			Encapsulation: Encapsulation hiding data dnd allowing controlled access using getters/setters
			📘 Why We need it?
			1. To protect data from being changed directly
			2. To enforce business rules
		*/

		/* This is Not Right ❌ you can't set negative bank-balance
		BankAccount bankAccount = new BankAccount();
		bankAccount.balance = -10000.54;
		System.out.println(bankAccount.balance);
		*/
		BankAccount bankAccount = new BankAccount();
//		bankAccount.balance = -10000.54; ❌ Now You can't set values directly
		bankAccount.deposit(-5000); // ❌ After Applying Business Rules
		System.out.println(bankAccount.getBalance());
	}
}
