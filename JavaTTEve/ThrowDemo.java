public class ThrowDemo 
{
    void display() 
    {
		 System.out.println("throw exception");
        throw new RuntimeException();
    }
	
	public static void main(String[] args) 
    {
        ThrowDemo obj1 = new ThrowDemo();
        try 
        {
            obj1.display();
        } 
		catch (RuntimeException e) 
        {
            System.out.println("Runtime Exception raised");
        }
    }
}        
