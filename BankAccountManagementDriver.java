
class BankAccountManagement
{
	private String accountHolderName; // getters or setters --> r
	private long accountNumber; // r
	private double balance; // r or w

	BankAccountManagement(String accountHolderName,long accountNumber,double balance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}



	// getter for accountHolderName
	public String getAccountHolderName() {  return accountHolderName ; }

	// getter for accountNumber
	public long getAccountNumber() { return accountNumber ;}

	// getter for balance
	public double getBalance(){ return balance ;}

	// setter for balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void withdraw(double amount)
	{
		if(amount<=balance && amount>0)
		{
			System.out.println(amount+ "withdrawn successfully");
			balance = balance - amount;
		}
		else 
		{
			System.out.println("Insufficient balance");
		}
	}

	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println(amount+" deposited successfully");
		}
		else 
		{
			System.out.println("Invalid amount");
		}
	}

}

class BankAccountManagementDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		BankAccountManagement bam1 = new BankAccountManagement("Monjulika",99999999999l,600000d);

		bam1.deposit(1500000d);
		System.out.println("Customer name is :"+bam1.getAccountHolderName());
		System.out.println("Customer bank account number :"+bam1.getAccountNumber());
		System.out.println("Customer balance is :"+bam1.getBalance());

		System.out.println("-----------");

		bam1.withdraw(2000000d);
		System.out.println("Customer name is :"+bam1.getAccountHolderName());
		System.out.println("Customer bank account number :"+bam1.getAccountNumber());
		System.out.println("Customer balance is :"+bam1.getBalance());

		System.out.println("===================================================");

		System.out.print("Enter a account holder name :"); String name = sc.next();
		System.out.print("Enter account number :"); long number = sc.nextLong();
		System.out.print("Enter initial account balance :"); double balance = sc.nextDouble();

		BankAccountManagement bam2 = new BankAccountManagement(name,number,balance);

		System.out.println("***********");

		System.out.println("Enter the deposit amount "); double deposit = sc.nextDouble();
		System.out.println("Enter the withdraw amount "); double withdraw = sc.nextDouble();


		bam2.deposit(deposit);
		System.out.println("Customer name is :"+bam2.getAccountHolderName());
		System.out.println("Customer bank account number :"+bam2.getAccountNumber());
		System.out.println("Customer balance is :"+bam2.getBalance());

		System.out.println("-----------");

		bam2.withdraw(withdraw);
		System.out.println("Customer name is :"+bam2.getAccountHolderName());
		System.out.println("Customer bank account number :"+bam2.getAccountNumber());
		System.out.println("Customer balance is :"+bam2.getBalance());


	}
}