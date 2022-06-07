import java.util.ArrayList;

public class FixedDepositAccount {
	private String username;  //getter only
	private String accnumber; //getter only
	private float accbalance;
	private ArrayList<String> transactions = new ArrayList<String>();
	private boolean accstatus = false;
	private String creationdate;
	private String closedate;
	
	private float interest = 3;
	private int intcount = 0;
	
	private int duration = 6; //in months eg 1 means 1 month
	private int durcount = 0; //if more than 1, throw illegalargumentgexception
	
	public FixedDepositAccount (String name, float balance) { 
		this.username = name;
		this.accbalance = 0;
	}
	
	public FixedDepositAccount (String name, float balance, float interest) {
		this.username = name;
		this.accbalance = balance;
		
		if (intcount > 0)
			throw new IllegalArgumentException();
		else
			this.interest = interest;
	}
	
	public FixedDepositAccount (String name, float balance, float interest, Integer duration) {
		this.username = name;
		this.accbalance = balance;
		
		if (intcount <= 0)
			this.interest = interest;
		else
			throw new IllegalArgumentException();
		
		if (durcount <= 0)
			this.duration = duration;
		else
			throw new IllegalArgumentException();
	}
	
	public void deposit(float amount) throws IllegalArgumentException {
		if (amount < 0 || accstatus == true)
			throw new IllegalArgumentException();
		else {
		//this.transactions.add("deposit " + amount + " at <date time>");
		}
	}
	
	public void withdraw(float amount) throws IllegalArgumentException {
		if (amount < 0 || accstatus == true)
			throw new IllegalArgumentException();
		else {
		//this.transactions.add("withdraw " + amount + " at <date time>");
		}
	}
	
	public float getBalance() {
		return accbalance + interest;
	}
	
	public void setclosed() {
		accstatus = true;
	}
	
	public void getinfo() {
		System.out.println("Your username is " + username);
		System.out.println("Your account number is " + accnumber);
		System.out.println("Your balance is " + this.getBalance());
	}
	
}
