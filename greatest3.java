import java.util.Scanner;
public class greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter value for a:");
	    a=sc.nextInt();
		System.out.print("enter value for b:");
	    b=sc.nextInt();
		System.out.print("enter value for c:");
	    c=sc.nextInt();

if (a>b && a>c) {
	System.out.println("a is greatest !");
}
else  if(b>a && b>c) {
	System.out.println("b is greatest !");
}
else {
	System.out.println("c is greatest !");
}
}
}
