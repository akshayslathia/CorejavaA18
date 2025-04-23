class Bag
{
	String brand = "chutkiiii wala bag";
}

class Shoes extends Bag 
{
	String shoesBrand = "adibas";
	int cost  = 100;

	public void display()
	{
		System.out.println("Shoes brand is :"+shoesBrand);
		System.out.println("Shoes cost is :"+cost);
		System.out.println("Bag brand is :"+brand);
	}
}

class Laptop extends Bag 
{
	String laptopBrand = "dell";
	int cost = 35000;

	public void display()
	{
		System.out.println("Laptop brand is :"+laptopBrand);
		System.out.println("Cost is :"+cost);
		System.out.println("Bag brand is :"+brand);
	}
}

class MakeupKit extends Bag 
{
	String makeupKitBrand = "nyka";
	String eyeliner = "lakmee";
	String primer = "Asian paint";
	String comb = "iron comb 10 kg wala";

	public void display()
	{
		System.out.println("Make up kit brand "+makeupKitBrand);
		System.out.println("eyeliner brand :"+eyeliner);
		System.out.println("Primer brand is :"+primer);
		System.out.println("Comb is :"+comb);
		System.out.println("Bag brand :"+brand);
	}
}

class SpeciaDrink extends Bag 
{
	String specialDrinkBrand = "simple water with ice and BP";
	int cost = 10000;

	public void display()
	{
		System.out.println("Special drink brand :"+specialDrinkBrand);
		System.out.println("Special drink cost :"+cost);
		System.out.println("Bag brand :"+brand);
	}
}

class BagDriverMain
{
	public static void checkItemInBag(Bag bag) // this method check what is there
													// in bag
	{
		if(bag instanceof Shoes)
		{
			Shoes s = (Shoes)bag;
			s.display();
		}
		else if(bag instanceof Laptop)
		{
			Laptop l = (Laptop)bag;
			l.display();
		}
		else if(bag instanceof SpeciaDrink)
		{
			SpeciaDrink sd = (SpeciaDrink)bag;
			sd.display();
		}
		else 
		{
			MakeupKit mk = (MakeupKit)bag;
			mk.display();
		}
	}
	public static void main(String[] args) // main method add something in bag
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("-------------------");	
		System.out.println("1. Shoes");
		System.out.println("2. MakeupKit");
		System.out.println("3. SpecialDrink");
		System.out.println("4. Laptop");
		System.out.println("-------------------");
		int choice = sc.nextInt();

		Bag bag ; // this is generalized bag

		if(choice==1)
		{
			bag = new Shoes();
			checkItemInBag(bag);
		}
		else if(choice==2)
		{
			bag = new MakeupKit();
			checkItemInBag(bag);
		}
		else if(choice==3)
		{
			bag = new SpeciaDrink();
			checkItemInBag(bag);
		}
		else if(choice==4)
		{
			bag = new Laptop();
			checkItemInBag(bag);
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
