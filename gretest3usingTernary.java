import java.util.Scanner;
public class gretest3usingTernary
{
    public static void main(String[] args) 
    {
        int n1, n2, n3, result, temp;
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        n1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        n2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        n3 = scanner.nextInt();
        temp = n1>n2 ? n1:n2;
        result = n3>temp ? n3:temp;
        System.out.println("Largest Number is:"+result);
    }
}
