public class AgeException extends RuntimeException 
{
     public AgeException() 
    {
       System.out.println("Invalid value for age");
    }
	public AgeException(String msg) 
	{
       		 super(msg);
    }
}
