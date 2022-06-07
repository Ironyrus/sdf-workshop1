
public class openacc {
	public static void main (String[] args) {
		//FixedDepositAccount a = new FixedDepositAccount("John", 100, 3, 6);
		BankAccount a = new BankAccount("John", 100);
		a.withdraw(1);
		a.deposit(5);
		a.getinfo();
		a.printTransactions();
	}	
}
