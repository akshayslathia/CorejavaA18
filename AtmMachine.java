import java.util.Scanner;
class AtmMachine
{
	public static double withdraw(double amount,double balance)
	{
		if(amount<=balance)
		{
			if(amount%100==0 && amount>0 && amount<=20000)
			{
				balance = balance - amount;
				System.out.println(amount+" withdrawn successfully!!!");
			}
			else 
			{
				System.out.println("Invalid amount");
			}
		}
		else 
		{
			System.out.println("Insufficient Balance");
		}

		return balance;
	}

	public static double deposit(double amount,double balance)
	{
		if(amount%500==0 && amount>0 && amount<=40000)
		{
			balance = balance + amount;
		}
		else 
		{
			System.out.println("Invalid deposit amount ");
		}

		return balance;
	}

	public static void checkBalance(double balance)
	{
		System.out.println("Balance availaible is :"+balance);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double balance = 2000d;
		boolean f = true;
		
		while(f==true)
		{
			System.out.println("----------Welcome to ATM machine-----------");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check balance ?");
			System.out.println("4. Exit ");
			System.out.println("--------------------------------------------");
			System.out.println();
			System.out.println("Enter your choice...");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.print("Enter the amount to withdraw ??"); double withdrawnAmount = sc.nextDouble();
						balance = withdraw(withdrawnAmount,balance);
						break;

				case 2: System.out.println("Enter the amount to deposit...");double depositAmount = sc.nextDouble();
						balance = deposit(depositAmount,balance);
						break;

				case 3 : checkBalance(balance);
						 break;

				case 4 : f = false;
						 break;

				default : System.out.println("Invalid input.....");

			}


		}

		System.out.println("thank you .. Please visit again!!!!!!!........");	
	}
}