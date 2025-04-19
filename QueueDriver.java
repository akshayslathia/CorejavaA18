class Queue
{
	int[] queue;
	int front,rear;
	int capacity;

	Queue(int capacity)
	{
		this.capacity  = capacity;
		front = -1;
		rear = -1;
		queue = new int[capacity];
	}

	public boolean isEmpty()// checking queue is empty
	{
		return (front==-1);
		// return (rear==-1);
	}

	public boolean isFull() // checking queue is full
	{
		return ((rear+1)%capacity==front);
	}

	public int peek() // returning the element at front
	{
		if(isEmpty())
			return -1;
		else 
			return queue[front];
	}

	public void enqueue(int data)
	{
		if(isFull())
			System.out.println("Queue overflow");
		else 
		{
			if(isEmpty())
			{
				front= 0;
				rear = 0;
				queue[rear] = data;
				System.out.println(data+" enqued in queue");
			}
			else 
			{
				rear = (rear+1)%capacity;
				queue[rear] = data;
				System.out.println(data+" enqued in queue");
			}
		}
	}

	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue underflow");
		else 
		{
			int data = queue[front];// remove
			if(rear==front) // check if front== rear , bring back f and r to -1 
							//making queue empty
			{
				front = -1;
				rear = -1;
				System.out.println(data+" dequeued from queue");
			}
			else  // if not increment front by 1
			{
				front = (front+1)% capacity;
				System.out.println(data+" dequeued from queue");
			}

		}
	}

	public String display() // i = 1
	{
		String s = "[";

		for(int i=front; !isEmpty()  ;i=(i+1)%capacity)
		{
			if(i==rear)
			{
				s = s + queue[i];
				break;
			}
			else 
			{
				s = s + queue[i]+",";
			}
		}

		s = s + "]";
		return s;
	}

	

}

class QueueDriver
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the size of queue");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		boolean flag = true;
		while(flag)
		{
			System.out.println("------------------");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. isEmpty");
			System.out.println("4. isFull");
			System.out.println("5. peek");
			System.out.println("6. display");
			System.out.println("7. exit");
			System.out.println("------------------");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter the data");
						int data = sc.nextInt();
						q.enqueue(data);
						break;

				case 2 : q.dequeue();
						  break;

				case 3 : System.out.println(q.isEmpty());
						  break;

				case 4 : System.out.println(q.isFull());
						  break;

				case 5 : System.out.println(q.peek());
						  break;

				case 6 : System.out.println(q.display());
						 break;

				case 7 : flag = false;
						  break;

				default : System.out.println("Invalid choice");
			}

			
		}
		System.out.println("Thank you for your patience , don't try at your home!!");	
	}
}