import java.util.Scanner;
	import java.lang.Math;
	class MathOperation
	{
		
		static int add(int a,int b)
		{
			int s=a+b;
			return s;
		}
		
	static int subtract(int a,int b)
		{
			int d=a-b;
			return d;
		}
		
	static int multiply(int a, int b)
		{
			int m=a*b;
			return m;
		}
		
     static double power(double a,double b)
		{
			double p=Math.pow(b,a);
			return p;
		}
	}
//demo(main class)
	class Prog35
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			MathOperation M1=new MathOperation();
			
			int s=M1.add(a,b);
			System.out.println("Sum: "+s);
			
			int d=M1.subtract(a,b);
			System.out.println("Subtract: "+d);
			
			int m=M1.multiply(a,b);
			System.out.println("Multiplication: "+m);
			
			double p=M1.power(a,b);
			System.out.println("Power: "+p);
		}
	}