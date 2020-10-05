import java.util.Scanner;
public class readDays {

	public static void main(String[] args) {
		int year,week,days;
		final int days_in_week=7;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter days:");
		days=sc.nextInt();

		
		year = days / 365; 
        week = (days% 365) / 
               days_in_week; 
        days = (days % 365) %  
                days_in_week; 
        System.out.println("years =" + year);
        System.out.println("weeks =" + week);
        System.out.println("days =" + days);
	}

}
