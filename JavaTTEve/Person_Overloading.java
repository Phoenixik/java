class Person_Overloading
{
    public void Greeting(String name) 
    {
        System.out.println("Hello," + name);
    }
	public void Greeting() 
    {
        System.out.println("Hi Bobby");
    }
	public void Greeting(String name, int id) 
    {
        System.out.println("Hello, "+ name + "NIN " +id);
    }
	
	public static void main(String[] args) 
    {
		Person_Overloading ol = new Person_Overloading();
		ol.Greeting("Johnson");
		ol.Greeting("Johnson",9876543);
		ol.Greeting();
		//ol.Greeting(9876543, "Johnson");
    }
}

