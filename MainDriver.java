class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
}

class LinkedList
{
	static Node head;

	// 1. if list is empty
	// 2. if list is not empty

	public static boolean isEmpty()
	{
		return head==null;
	}
	public static  void insertAtEnd(int data)
	{
		Node new_node = new Node(data);

		if(isEmpty()) // if list is empty , insert a new_node
						// at beggining
			head = new_node;
		else 
		{
			Node temp = head;
			while(temp.next!=null)// traversing to last
			{
				temp = temp.next;
			}
			temp.next = new_node; // node inserted at last
		}

		System.out.println(display());
	}

	public static void removeFromEnd()
	{
		if(isEmpty())
			System.out.println("List is empty!!");
		else if(head.next==null)
			head = null;
		else 
		{
			Node temp = head;
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}

			temp.next = null;

		}

		System.out.println(display());
	}

	public static void insertNodeAtBeginning(int data)
	{
		Node new_node = new Node(data);

		if(isEmpty())
			head = new_node;
		else 
		{
			new_node.next = head;
			head = new_node; // inserted at beginning
		}

		System.out.println(display());

	}

	public static String display()
	{
		String s = "[";
		Node temp = head;
		while(temp!=null)
		{
			if(temp.next==null)
				s = s + temp.data;
			else 
				s = s + temp.data+",";
			temp = temp.next;
		}

		s = s + "]";
		return s;
	}
}

class MainDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("---------------------");
			System.out.println("1. insert at end");
			System.out.println("2. insert at beginning");
			System.out.println("3. remove from end");
			System.out.println("4. display");
			System.out.println("5. exit");	
			System.out.println("-----------------------");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: System.out.print("Enter data :");int data1 = sc.nextInt();
						LinkedList.insertAtEnd(data1);
						break;
				case 2 :System.out.print("Enter data :");int data2 = sc.nextInt();
						LinkedList.insertNodeAtBeginning(data2);
						break;
				case 3 :LinkedList.removeFromEnd();
						break;
				case 4 :System.out.println(LinkedList.display());
						break;
				case 5 : flag = false;
						 break;
				default : System.out.println("Invalid choice");
			}

		}

	}
}