import java.util.Scanner;

	class Student1
	{
		int roll,age;
		float score;
		String name;
		
		Student1(int roll,String name,int age,float score)
		{
			this.roll=roll;
			this.name=name;
			this.age=age;
			this.score=score;
		}
		
		static float total(Product []p)
		{
			Product test;
			float sum=0;
			for(int i=0; i<p.length; i++)
			{
				test=p[i];
				sum=sum+(test.quantity*test.price);
			}
			return sum;
		}
	}
//StudentDemo1
	class Prog40
	{
		public static void main(String[] args)
		{	
			int roll,age;
			float score;
			String name;
			Scanner scan=new Scanner(System.in);
			Student1 s[]=new Student1[10];
			Student test;
			
			for(int i=0; i<4; i++)
			{
				System.out.println("Enter roll, name, age and score:");
				roll=scan.nextInt();
				name=scan.next();
				age=scan.nextInt();
				score=scan.nextFloat();
				
				Student1 s1=new Student1(roll,name,age,score);
				s[i]=s1;
				
			}
			
			System.out.println("Students who scored between [80-100]: ");
			for(int i=0; i<4; i++)
			{
				if(s[i].score>=80 && s[i].score<=100)
				{
					System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
				}
			}
			
			System.out.println("Students who scored between [65-80]: ");
			for(int i=0; i<4; i++)
			{
				if(s[i].score>=65 && s[i].score<80)
				{
					System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
				}
			}
			
			System.out.println("Students who scored between [50-65]: ");
			for(int i=0; i<4; i++)
			{
				if(s[i].score>=50 && s[i].score<65)
				{
					System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
				}
			}
			
			System.out.println("Students who scored between [45-50]: ");
			for(int i=0; i<4; i++)
			{
				if(s[i].score>=45 && s[i].score<50)
				{
					System.out.println("Roll: "+s[i].roll+"    Name: "+s[i].name+"    Age: "+s[i].age+"    Score: "+s[i].score+"%");
				}
			}
		}
	}	
	
		