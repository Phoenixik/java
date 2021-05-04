import java.util.Scanner;
public class Addition 
{
	public static void main(String[] args)
	{
        int num1, num2, result;
		Scanner obj1 = new Scanner(System.in);
		
        System.out.println("Enter the 1st number");
        num1 = obj1.nextInt();
		
        System.out.println("Enter the 2nd number");
        num2 = obj1.nextInt();
		
        result = num1+num2;
		 System.out.println("The result is "+result);
    }
}
