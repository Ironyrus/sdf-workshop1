import java.util.ArrayList;

public class BankAccount {
	private String username;  //getter only
	private String accnumber; //getter only
	private float accbalance;
	private ArrayList<String> transactions = new ArrayList<String>();
	private boolean accstatus;
	private String creationdate;
	private String closedate;
	
	public BankAccount (String name) { 
		this.username = name;
		this.accbalance = 0;
	}
	
	public BankAccount (String name, float balance) {
		this.username = name;
		this.accbalance = balance;
	}
	
	public void deposit(float amount) throws IllegalArgumentException {
		if (amount < 0 || accstatus == true)
			throw new IllegalArgumentException();
		else {
			this.accbalance += amount;
			this.transactions.add("deposit " + amount + " at <date time>");
		}
	}
	
	public void withdraw (float amount) throws IllegalArgumentException {
		if (amount < 0 || accstatus == true)
			throw new IllegalArgumentException();
		else {
			this.accbalance -= amount;
			this.transactions.add("withdraw " + amount + " at <date time>");
		}
	}
	
	public void getinfo() {
		System.out.println("Your username is " + username);
		System.out.println("Your account number is " + accnumber);
		System.out.println("Your balance is " + accbalance);
	}
	
	public void printTransactions() {
		int i = 0;
		System.out.println("\n~~PRINT STATEMENT:~~");
		for (String item : transactions) {
			i++;
			System.out.println(i + ". " + item);			
		}
		System.out.println("~~STATEMENT END~~");
	}
	
}
