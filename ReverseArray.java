import java.util.*;
	class ReverseArray
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			int start=0;
			System.out.println("Enter 5 Array elements :");
		
			int arr[]=new int[5];	
			
			for (int i=0;i<arr.length;i++)
			{
				arr[i] =sc.nextInt();
				}
			for (int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] < arr[j]) {
						start =arr[i];
						arr[i] = arr[j];
						arr[j]= start;
					}
				}
			}
			System.out.println("Array in reverse order: ");
			for(int i: arr)
			{
				System.out.println(i);
			}
			
		}
	}