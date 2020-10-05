import java.util.Scanner;
public class swapwithoutThird {

	public static void main(String[] args) {
	int a,b;
	
	Scanner in =new Scanner(System.in);
	System.out.println("enter value for a:");
	a=in.nextInt();
	System.out.println("enter value for b:");
	b=in.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap->");
	System.out.println("a=" + a + "\nb = " + b );
	}

}
