class Bag
{
	String type = "leather";
}

class RedBall extends Bag
{
	String colour  = "red";
	public void display()
	{
		System.out.println("Colour of ball is :"+colour);
	}
}
class BlackBall extends Bag 
{
	String colour = "black";
	public void display()
	{
		System.out.println("Colour of ball is :"+colour);
	}
}

class SmokyWhite extends Bag 
{
	String colour = "smoky white";
	public void display()
	{
		System.out.println("Colour of ball is :"+colour);
	}
}

class BagMainKyaHai
{
	public static void checkBallColour(Bag bag) // this is you
	{
		if(bag instanceof BlackBall)
		{
			BlackBall bb =(BlackBall)bag;
			bb.display();
		}
		else if(bag instanceof SmokyWhite)
		{
			SmokyWhite sw = (SmokyWhite)bag;
			sw.display();
		}
		else 
		{
			RedBall rb = (RedBall)bag;
			rb.display();
		}
	}
	public static void main(String[] args) // this is me 
	{
		
		Bag bag = new SmokyWhite();
		checkBallColour(bag);
	}
}