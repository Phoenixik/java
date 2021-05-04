package game;

public class WrongInputException extends RuntimeException 
{
	WrongInputException() 
	{
		System.out.println("Please provide a single character only..!!");
	}

}
 class MenuInputException extends RuntimeException 
{
    MenuInputException()
	{
        
        System.out.println("Please provide a valid input (1-3)");
	}
 }

