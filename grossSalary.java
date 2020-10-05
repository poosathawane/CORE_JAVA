import java.util.Scanner;
public class grossSalary {
	
public static void main(String[] args) {
double basic_salary, gross_salary, HRA, DA;
Scanner sc =new Scanner(System.in);
System.out.print("enter value for Basic salary:");
basic_salary=sc.nextDouble();

if (basic_salary<10000)
{
	HRA=0.1*basic_salary;
	DA=0.9*basic_salary;
}
else
{	
	HRA=2000;
	DA=0.98*basic_salary;
}
gross_salary=basic_salary+HRA+DA;
System.out.println("gross salary:"+gross_salary);
	}
}
