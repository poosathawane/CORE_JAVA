import java.util.Scanner;
	class sortarray
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 10 numbers: ");
			   int temp = 0;    
			int arr[]=new int[10];
			 for (int i = 0; i < arr.length; i++) { 
					arr[i]= sc.nextInt(); 
		        }    
		        System.out.println("Elements of original array: ");    
		        for (int i = 0; i < arr.length; i++) {     
		            System.out.print(arr[i] + " ");    
		        }          
		        for (int i = 0; i < arr.length; i++) {     
		            for (int j = i+1; j < arr.length; j++) {     
		               if(arr[i] < arr[j]) {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }     
		            }     
		        }    
		        System.out.println();    
		        System.out.println("Elements of array sorted in descending order: ");    
		        for (int i = 0; i < arr.length; i++) {     
		            System.out.print(arr[i] + " ");    
		        }    
		    }    
		}    