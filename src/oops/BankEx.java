package oops;


//Abstract class cannot be intiated. Meaning an object cannot be created. Object can be created via the child class

public abstract class BankEx {

	public abstract void CheckBalance();

	public abstract void DepositMoney();

	public abstract void WithdrawMoney();

	public void welcome() {
		System.out.println("Welocome to bank...");
	}
}
