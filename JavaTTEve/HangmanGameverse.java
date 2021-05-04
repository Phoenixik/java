package game;

import java.util.Scanner;
import java.util.Random;

public class HangmanGameverse
{
    //Instance variable
	
String word[] = {"japan", "qatar", "syria", "mongolia", "bahrain", "india"};
 // import statements:

    public void showMenu()
    {
        int option=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------- Hangman Menu ---------");
        System.out.println("1. Play");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
		
        System.out.print("\nChoose the option: ");   
	try {
			option = sc.nextInt();
		}catch (RuntimeException e)
		{
			System.out.println("please provide a valid numeric output");
		}
	// Switch Case
        switch(option)
        {
            case 1: playGame();
                    break;
            case 2: instructGame();
                    break;
            case 3: exitGame();
                    break;
            default: try
						{
							throw new MenuInputException();
						}
						catch (Exception e)
						{
							showMenu();
						}
       }
    }
    
    // Method definition
    public void playGame() 
    {
		//playGame functionality
			
		int len, i, count = 0, rnd, flag =0;
		String choice, temp;
			
		Random rd = new Random();
		Scanner input = new Scanner(System.in);
			
		rnd = rd.nextInt(6); /* generates a random number between -1 and 7 and          assigns the same to the variable rnd */

		len = word[rnd].length();
		char[] newString = new char[len];
			

		StringBuffer wrgString = new StringBuffer();
			
		for(int j = 0; j < len; j++) 
		{
		  System.out.print("_ ");
		}

		System.out.println();

		do
		{
			flag =0;
			
			System.out.print("\n\nEnter your guess: ");
		try
		{
			String ch = input.nextLine().toLowerCase();
			if(ch.length()!=1)
			{
			throw new WrongInputException();
			}
		
			count++;
				
			for (i = 0; i < len; i++) 
			{
				if (word[rnd].charAt(i) == ch.charAt(0))
				{
					newString[i] = word[rnd].charAt(i);
					flag = 1;
				}
			}
		
				if (flag == 0) 
				{
					flag=1;
							wrgString.append(ch + ",");
					System.out.println("\nMisses: " + wrgString);
				}
						
					System.out.println(newString);
					temp = new String(newString);
				
				if (word[rnd].equals(temp)) 
				{
					System.out.println("---------- Congrats :) You won ------------");
					System.out.println("Do you want to play again (Y/N)");
					choice = input.nextLine();
		
					if (choice.equalsIgnoreCase("y")) 
					{
						playGame();
					} 
					else 
					{
						showMenu();
					}
										   
				}
		}
		catch (WrongInputException e)
		{
		//System.out.println(e);
		flag = 1;
		}

        }while(flag!=0);

		
			String guess;
			Scanner sc = new Scanner(System.in);
		do
		{  
			System.out.print("\n Guess a letter in the word : ");
			guess = input.nextLine();
							   
			for(i=0;i<word[rnd].length();i++)
			{
				if(word[rnd].charAt(i) == guess.charAt(0))
				{
					flag=1;
				}					
			}
			if(flag==1)
			{
				System.out.println("This letter is present in the word");
			}
			else
			{
				System.out.println("This letter is not present in the word");
			}			
			System.out.println("Do want to guess again(y/n):");
			guess=input.nextLine();
			flag=0;
				
		}while(guess.equals("y")||guess.equals("Y"));
    }

    public void instructGame() 
    {
        System.out.println("instructGame method is invoked");
    }

    public void exitGame() 
    {
        System.out.println("exitGame method is invoked");
        System.exit(0);
    }    

    public static void main(String[] args) 
    {
        HangmanGameverse hgv = new HangmanGameverse();
		hgv.showMenu();
    }	
}

 class WrongInputException extends RuntimeException 
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

