import java.util.Scanner;
public class table {
public static void main(String[] args) {
		int num,i,j;
Scanner sc = new Scanner(System.in);
System.out.print(" Please Enter any Number : ");
 num = sc.nextInt();	
for (i=1;i<=10;i++)
{
		System.out.println(num +" * " + i+" ="+ i * num);
}
	}
}
