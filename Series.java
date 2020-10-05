import java.util.Scanner;
	class Series
	{
		public static void main(String[] args)
		{
			int a=121,sum=0;
		
			for(int i=1; i<10; i++)
			{
				sum=a+sum;
				a=a+10;
			}
			System.out.println("Sum: "+sum);
		}
	}