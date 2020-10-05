import java.util.Scanner;
public class simpleInterest {

	public static void main(String[] args) {
	double principle,rate,time,SI;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter principle amount:");
	principle=sc.nextDouble();
	System.out.print("Enter rate amount:");
	rate=sc.nextDouble();
	System.out.print("Enter time amount:");
    time=sc.nextDouble();
    
SI= (principle *rate*time)/100;
System.out.println("Simple Interest :"+SI);
	}

}
