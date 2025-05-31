package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEligibleException extends Exception // checked exception
{
	NotEligibleException(String msg)
	{
		super(msg);
	}
}

class CheckEligibility
{
	private int age;

	public int getAge() {
		return age;
	}
	
	public CheckEligibility(int age) {
		this.age = age;
	}
	
	public void checkEligibility()throws NotEligibleException
	{
		if(age>=18)
			System.out.println("Eligible for vote");
		else
			throw new NotEligibleException("Not eligible");
	}
	
}

public class VotingMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age :");
		try
		{
			int age = sc.nextInt();
			CheckEligibility ce = new CheckEligibility(age);
			try
			{
				ce.checkEligibility();
			}
			catch(NotEligibleException e)
			{
				System.err.println(e.getMessage());
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}

	}

}
