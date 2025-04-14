class Processor
{
	String brand = "intel";
	int coreCount = 12;
	double speedGHZ = 3.6d;
}

class Laptop
{
	String laptopBrand;
	int ram;
	double price;
	String colour;

	Processor p = new Processor();

	Laptop(String laptopBrand,int ram,double price,String colour)
	{
		this.laptopBrand = laptopBrand;
		this.ram = ram;
		this.price = price;
		this.colour = colour;
	}

	public void displayDetails()
	{
		System.out.println("Laptop brand is :"+laptopBrand);
		System.out.println("Laptop colour :"+colour);
		System.out.println("Laptop price :"+price);
		System.out.println("Laptop ram :"+ram);
		System.out.println("Processor brand :"+p.brand);
		System.out.println("Processor core count :"+p.coreCount);
		System.out.println("Processor speed :"+p.speedGHZ);
	}

	
}

class LaptopDriver
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop("Hp",16,76000d,"Black");	
		l1.displayDetails();
	}
}