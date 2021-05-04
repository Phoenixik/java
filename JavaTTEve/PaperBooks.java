package books;

class PaperBooks extends Books 
{
    int shippingcharges = 10;

    public void printInfo() 
	{
        displayInfo();//Calling the method of Book class.
        System.out.println("The total shipping charges are" + shippingcharges);
    }

    public static void main(String[] args) 
	{
        PaperBooks pb = new PaperBooks();
        pb.printInfo();
    }
}
