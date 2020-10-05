import java.util.Scanner;

	class Circle
	{
		double radius;
		double area;
		
		void init(double radius)
		{
			this.radius=radius;
		}
		
		void calculateArea()
		{
			area=3.14f*radius*radius;
		}
		
		void display()
		{
			System.out.println("Radius: "+radius);
			System.out.println("Area: "+area);
		}
	}
//CircleDemo (main class)
	class Prog34
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Radius: ");
			double r=sc.nextDouble();
			Circle c=new Circle();
			c.init(r);
			c.calculateArea();
			c.display();
		}
	}