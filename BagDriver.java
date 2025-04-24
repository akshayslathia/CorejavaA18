class Ball
{
	private String brand = "Nivia";

	public String getBrand(){ return brand ;}

}
class BasketBall extends Ball 
{
	String colour = "Red";
	double radius = 34.56d;
	public void display()
	{
		System.out.println("you can play with basketball whose colour is :"+colour);
		System.out.println("Radius :"+radius);
		System.out.println("Ball brand :"+getBrand());
	}
}
class TennisBall extends Ball 
{
	String colour = "Green";
	double radius = 12.45d;
	public void display()
	{
		System.out.println("you can play with tennisball whose colour :"+colour);
		System.out.println("Radius :"+radius);
		System.out.println("Ball brand :"+getBrand());
	}
}

class Bag 
{
	Ball ball ; // reference variable of clas Ball ( generalized container )

	public void addBall(Ball ball)
	{
		if(this.ball==null)
		{
			this.ball = ball;
			System.out.println("Ball added successfully");
		}
		else 
		{
			System.out.println("Ball exists already");
		}

	}

	public void removeBall()
	{
		if(this.ball!=null)
		{
			this.ball = null;
			System.out.println("Ball removed succesfully");
		}
		else 
		{
			System.out.println("Bag is already empty");
		}
	}

	public boolean isBagEmpty()
	{
		// if(ball==null)
		// 	return true;
		// else 
		// 	return false;

		return (ball==null);
	}

	public void checkGame()
	{
		if(isBagEmpty())
			System.out.println("Oopsss.... we can't play with anything , so better let's go and do bootcamp");
		else if(ball instanceof BasketBall)
		{
			BasketBall bb = (BasketBall)ball; // downcasting to basketball
			bb.display();
		}
		else 
		{
			TennisBall tb = (TennisBall)ball;
			tb.display();
		}
	}
}

class BagDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		Bag bag = new Bag();
		while(flag)
		{

			System.out.println("---------------------");
			System.out.println("1. Add Ball");
			System.out.println("2. Remove Ball");
			System.out.println("3. Check game");
			System.out.println("4. is Empty???");
			System.out.println("5. Exit");
			System.out.println("----------------------");
			System.out.print("Enter choice :");int choice = sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("Which ball ? 1. Basket ball \t 2. TennisBall");
					   int ch = sc.nextInt();
					   if(ch==1)
					   		bag.addBall(new BasketBall());
					   else 
					   		bag.addBall(new TennisBall());

					   break;

				case 2 :bag.removeBall();
						break;

				case 3 : bag.checkGame();
						 break;

				case 4 : System.out.println(bag.isBagEmpty());
						  break;

				case 5 : flag = false;
						  break;

				default : System.out.println("Invalid choice");
			}
		}

		System.out.println("Dhanyavadddd ..... abar asben.....");
	}
}