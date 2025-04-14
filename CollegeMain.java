class Address
{
	String city = "Kolkata";
	String state = "WB";
	int pincode = 700001;
}

class Student
{
	String studentName = "Rohan";
	int rollNo = 23523;
	long phone = 96784675334l;
	Address a = new Address();
}

class College
{
	String collegeName = "Mamta banerjee institute of technology";
	Student s = new Student();

	public void display()
	{
		System.out.println("College name :"+collegeName);
		System.out.println("Student name :"+s.studentName);
		System.out.println("Student roll number :"+s.rollNo);
		System.out.println("Student phone :"+s.phone);
		System.out.println("Stundent's city :"+s.a.city);
		System.out.println("Student's pincode :"+s.a.pincode);
		System.out.println("Student's state :"+s.a.state);
	}
}

class CollegeMain
{
	public static void main(String[] args) 
	{
		College c = new College();	
		c.display();
	}
}

