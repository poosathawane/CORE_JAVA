import java.util.Scanner;

	class MathOp
	{
		void multiply(int a, int b)
		{
			int m=a*b;
			System.out.println("Multiplication1: "+m);
		}
		void multiply(float a, float b,float c)
		{
			float m=a*b*c;
			System.out.println("Multiplication2: "+m);
		}	
		void multiply(int [] arr)
		{
			int m=1;
			for(int x:arr)
			{
				m=m*x;
			}
			System.out.println("Multiplication3: "+m);
		}		
		void multiply(double a,int b)
		{
			double m=b*a;
			System.out.println("Multiplication1: "+m);
		}
	}
	class Prog36
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[4];
			MathOp M1=new MathOp();
			
			System.out.println("Enter two integers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			M1.multiply(a,b);
			
			System.out.println("Enter three decimals: ");
			float c=sc.nextFloat();
			float d=sc.nextFloat();
			float e=sc.nextFloat();
			M1.multiply(c,d,e);
			
			System.out.println("Enter 4 integers: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i]=sc.nextInt();
			}
			M1.multiply(arr);
			
			System.out.println("Enter one decimal and one integer: ");
			double r=sc.nextDouble();
			int s=sc.nextInt();
			M1.multiply(r,s);
		}
	}