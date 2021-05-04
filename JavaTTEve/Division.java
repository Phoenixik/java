import java.util.Scanner;

public class Division 
{
    public static void main(String[] args) 
    {
        int num1, num2, result;
        Scanner obj1 = new Scanner(System.in);
        try 
        { // monitor the try block for exceptions
            System.out.println("Enter the 1st number");
            num1 = obj1.nextInt();
            System.out.println("Enter the 2nd number");
            num2 = obj1.nextInt();
            result = num1 / num2;
            System.out.println("The result is " + result);
        } catch (ArithmeticException e) 
        {
            System.out.println("Please input only numeric values..!!");
        } catch (Exception e) /*the catch block catches the exception raised in the try block and handles it */
        {
            System.out.println("Division performed by zero...");
        }
    }
}
