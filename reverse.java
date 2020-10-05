import java.util.Scanner;
public class reverse {
	public static void main(String args[])
	{
		int a,b;
		int rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any no.-");
		a=sc.nextInt();
	
		while(a!=0)
		{
			b=a%10;
			rev=(rev*10) +b;
			a=a/10;
			
		}
		System.out.println("reverse is-" +rev);
	}
}

