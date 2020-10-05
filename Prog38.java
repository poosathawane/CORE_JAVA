import java.util.*;

	class Employee
	{
		static int empno=0;
		static float salary=0;
		static int totalSalary =0;
		Employee(int salary)
		{
			empno++;
			this.salary+=salary;
		}
		
		void display()
		{
			System.out.println("Total employees: "+empno);
			System.out.println("Total salary: "+salary);
		}
	}
//EmployeeDemo
	class Prog38
	{
		public static void main(String[] args)
		{
			Employee e1=new Employee(15000);
			Employee e2=new Employee(10000);
			Employee e3=new Employee(8000);
		
			e1.display();
		}
	}