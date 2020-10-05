import java.util.Scanner;
public class circle {
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		double pi=3.14;
System.out.print("enter radius for circle:");
double radius =sc.nextDouble();
double area = pi* (radius*radius);
System.out.println("area of circle :" +area);
double circumference =pi *2*radius;
System.out.println("circumference of circle:"+circumference);

	}

}
