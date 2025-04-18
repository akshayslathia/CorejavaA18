class Stack
{
	int top;
	int[] stack;
	int capacity;

	Stack(int capacity)
	{
		this.capacity = capacity;
		top = -1;
		stack = new int[capacity];
		
	}

	public boolean isEmpty() // checking stack is empty
	{
		return (top==-1);
	}

	public boolean isFull() // checking stack is Full
	{
		return (top==capacity-1);
	}

	public int peek() // used to return top element
	{
		if(isEmpty())
			return -1;
		else
			return stack[top];
	}

	public void push(int data) // used to push data into stack
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else 
		{
			// top++;
			// stack[top] = data;
			stack[++top] = data;
			System.out.println(data+" pushed to stack");
		}
	}

	public void pop() // used to pop element from stack
	{
		if(isEmpty())
			System.out.println("Stack underflow");
		else 
		{
			int data = stack[top--];
			System.out.println(data+" poped from stack");
		}
	}

	public String display() // used to display element till top
	{
		String s = "[";

		for(int i=0;i<=top;i++)
		{
			if(i!=top)
				s = s + stack[i]+",";
			else 
				s = s + stack[i];
		}

		s = s + "]";

		return s;

	}
}


class StackDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the capacity of stack");
		int capacity = sc.nextInt();
		Stack stack = new Stack(capacity);
		boolean flag = true;
		while(flag)
		{
			System.out.println("----------------");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Isempty");
			System.out.println("4. isFull");
			System.out.println("5. peek");
			System.out.println("6. display");
			System.out.println("7. exit");	
			System.out.println("-----------------");
			int choice = sc.nextInt();

			switch(choice)
			{
				case 1: System.out.println("Enter the data to push");
						int data = sc.nextInt();
						stack.push(data);
						break;

				case 2: stack.pop();
					    break;

				case 3: System.out.println(stack.isEmpty());
						break;

				case 4: System.out.println(stack.isFull());
						break;

				case 5 :System.out.println(stack.peek());
						break;

				case 6 : System.out.println(stack.display());
						break;

				case 7 : flag = false;
						break;

				default : System.out.println("Invalid options!!!");
			}
		}

		System.out.println("thank you !! for the patience!! please visit again!! Dhanyavad");
	}
}