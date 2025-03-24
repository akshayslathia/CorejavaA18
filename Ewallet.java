class Ewallet
{
	public static void displayAmount(double wallet)
	{
		System.out.println("The amount availaible is :"+wallet);
	}

	public static double addAmount(double wallet,double amount)
	{
		wallet = wallet + amount;
		System.out.println(amount+" amount is added to wallet");
		return wallet;
	}

	public static double purchasing(double wallet,double purchaseAmount)
	{
		if(purchaseAmount<=wallet)
		{
			wallet = wallet - purchaseAmount;
			System.out.println("Purchasing of "+purchaseAmount+" done successfully");
			return wallet;
		}

		System.out.println("Availaible wallet amount is not sufficient");
		return wallet;
	}

	public static void main(String[] args) 
	{
		double wallet = 5000d;	

		// Displaying the wallet amount
		displayAmount(wallet);

		// Adding 3500 in the wallet and updating the wallet amount
		wallet = addAmount(wallet,3500d);
		System.out.println("========");
		displayAmount(wallet);

		// Assuming there is a purchase of 6000 , updating the ewallet
		wallet = purchasing(wallet,6000d);
		System.out.println("--------");
		displayAmount(wallet);


	}
}