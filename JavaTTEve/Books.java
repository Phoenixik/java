package books;

class Books 
{
    int page_num;
    String authorname, bookname;
    float price;

    public Books() 
    {
        page_num = 50;
        authorname = "Andrew Jones";
        bookname = "The Living Ideas";
        price = 15.78f;
    }

    public void displayInfo() 
    {
        System.out.println("The name of the book is " + bookname);
        System.out.println("The price of the book is " + price);
        System.out.println("The author name is " + authorname);
        System.out.println("The total number of pages is " + page_num);
    }
}

