import java.util.Scanner;
public class sumof5 {
	
	public static void main(String[] args) {
		int ds,dbms,java,os,meanstack;
	    double sum,percentage;
	   Scanner sc =new Scanner(System.in);
		System.out.println("enter marks for subjects:");
		ds=sc.nextInt();
		dbms=sc.nextInt(); 
		java=sc.nextInt();
		os=sc.nextInt();
		meanstack=sc.nextInt();
		
		sum= ds + dbms + java + os + meanstack;
		percentage =(sum/5) ;
		
		System.out.println("sum of 5 subjects =" + sum);
		System.out.println("percentage marks=" + percentage); 
	}

}
