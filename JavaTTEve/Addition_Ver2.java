import java.util.Scanner;
public class Addition_Ver2 
{
    public static void main(String[] args) 
	{
        int num1, num2, result;
		String snum1, snum2;
        Scanner obj1 = new Scanner(System.in);
     	try 
		{ 
			// monitor the try block for exceptions
        	System.out.println("Enter the 1st number");
        	snum1 = obj1.next();
			
        	System.out.println("Enter the 2nd number");
        	snum2 = obj1.next();
			
			num1=Integer.parseInt(snum1);
			num2=Integer.parseInt(snum2);
	
        	result = num1+num2;
        	System.out.println("The result is "+result);
        }
     	catch(Exception e) 
        {
        	System.out.println("Please input only numeric values..!!" );
			
        }
     
     }
}

