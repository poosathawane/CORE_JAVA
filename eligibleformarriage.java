import java.util.Scanner;
 
public class eligibleformarriage
{
    public static void main(String args[])  
    {
        char  gender;
        int age;
       Scanner SC=new Scanner(System.in);
        System.out.print("Enter Gender m/f: ");
        gender=SC.next().charAt(0);
        System.out.print("Enter age: ");
        age=SC.nextInt();
 if (gender =='m' && age >21) {
        System.out.println("person eligible for marriage. " );}
 else if (gender== 'f' && age>18) {
            System.out.println("person eligible for marriage. " );}
 else 
	 System.out.println("person not eligible for marriage!");
       
                                  
    }
}