package arrayPrograms;

import java.util.Arrays;

public class Example {
	
	static void segregate0and1(int[] arr)
	{
		int k = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				arr[k++] = arr[i];
			}
		}
		
		for(int i=k;i<arr.length;i++)
		{
			arr[i] = 0;
		}
		
	}
	
	
	
	
	static void sortInAscendingOrder(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++) // current element
		{
			for(int j=i+1;j<n;j++) // next element from current
			{
				if(arr[i]>arr[j])
				{
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	static int[] removeDuplicates(int[] arr)
	{
		int n = arr.length;
		int count = 0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]!=-1 && arr[i]==arr[j])
					{
						arr[j] = -1;
						count++;
					}
				}
			}
		}
		
		int k = 0;
		int[] res = new int[n-count]; // creating new arr to store unique values
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=-1)
				res[k++] = arr[i];
		}
		
		return res;
	}
	
	static void sortDescendingOrder(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++) // current element
		{
			for(int j=i+1;j<n;j++) // next element from current
			{
				if(arr[i]<arr[j])
				{
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	static int balanced(int[] arr)
	{
		int totalSum = sumOfValues(arr);
		int leftSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			totalSum-=arr[i];
			
			if(totalSum==leftSum)
				return i;
			
			leftSum+=arr[i];
			
		}
		
		return -1;
	}

	static int[] swapExtremeValues(int[] arr)
	{
		//x = y - x + (y=x)
		//arr[0]---> x
		//arr[arr.length-1]--> y
		//arr[0] = arr[arr.length-1] - arr[0] + (arr[arr.length-1] = arr[0]);
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		
		return arr;
	}
	
	static void rightRotate(int[] arr)
	{
		int n = arr.length;
		int temp = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	}
	
	
	static void leftRotate(int[] arr)
	{
		int temp = arr[0];
		
		for(int i=1;i<arr.length;i++)
			arr[i-1] = arr[i];
		
		arr[arr.length-1] = temp;
	}
	
	static void leftRotate1(int[] arr,int k)
	{
		int n = arr.length;
		k = k%n; // avoid unnecessary rotations
		
		while(k!=0)
		{
			for(int i=1;i<arr.length;i++)
			{
				// arr[i]--> x
				//arr[i-1]--> y
				arr[i] = arr[i] + arr[i-1];
				arr[i-1] = arr[i] - arr[i-1];
				arr[i] = arr[i] - arr[i-1];
			}
			
			k--;
		}
		
		
	}
	
	
	
	
	static void printEvenNumbers(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
	
	static void printOddNumbers(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==1)
				System.out.println(a[i]);
		}
	}
	
	static int sumOfValues(int[] a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		return sum;
	}
	
	
	public static void demo(int[] arr)
	{
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i] = arr[i];
		}
		
		System.out.println("resulatant array"+Arrays.toString(res));
		res[2] = 100;
		System.out.println("resulatant changed array"+Arrays.toString(res));
	}
	
	static void arrayCopy(int[] a,int [] b)
	{
		int[] res = new int[a.length+b.length];
		
		int k = 0; 
		
		for(int i=0;i<res.length;i++)
		{
			if(i<a.length)
				res[i] = a[i];
			else
				res[i] = b[k++];
		}
		
		System.out.println(Arrays.toString(res));
	}
	
	static void printFactorsOfNumber(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(k%arr[i]==0 && arr[i]!=k)
				System.out.println(arr[i]);
		}
	}
	
	static int findLargest(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		
		return max;
	}
	
	static int findSecondLargest(int[] arr)
	{
		int max1 = findLargest(arr);
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max2 && arr[i]!=max1)
				max2 = arr[i];
		}
		
		return max2;
	}
	
	
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,5,8,3,6,9,3,4,6};
		System.out.println("Before removing duplicates :"+Arrays.toString(a));
		
		int[] res = removeDuplicates(a);
		System.out.println(Arrays.toString(a));
		System.out.println("After removing duplicates :"+Arrays.toString(res));
		
		
		
		
		
		
		
		
		
		
	}

}
