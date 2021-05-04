class GeneralGreeting 
{
    public void Greeting() 
    {
        System.out.println("Good Morning");
    }
}
class Yoruba extends GeneralGreeting 
{
    public void Greeting() 
	{
        System.out.println("E ka a ro o");
    }
	
}
class Igbo extends GeneralGreeting 
{
    public void Greeting() 
    {
        System.out.println("O tutu oma");
    }
}

class Greeting_Override 
{
    public static void main(String[] args) 
    {
        GeneralGreeting P = new GeneralGreeting();
        Yoruba E = new Yoruba();
        Igbo S = new Igbo();
        GeneralGreeting ref;
        ref = P;
		ref.Greeting(); // calls the  showDetails method of the Person class
        ref = E;
		ref.Greeting(); // calls the showDetails method of the Employee class
        ref = S;
        ref.Greeting();// calls the showDetails method of the Student class
    }
}

