package game;
import java.util.Scanner;
import java.util.Random;

public class Myexample
{
	int option;
	String word[] = {"japan", "qatar", "syria", "mongolia", "bahrain", "india"};
	Scanner input= new Scanner(System.in);
	
	public void showmenu() {
		System.out.println("--------- Hangman Menu ---------");
        System.out.println("1. Play");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
	
	    System.out.println("choose your option");
		option=input.nextInt();
		
		// Switch Case
        switch(option)
        {
            case 1: playGame();
                    break;
            case 2: instructGame();
                    break;
            case 3: exitGame();
                    break;
            default:  System.out.println("enter a valid numeric input");
					break;
					

		}
		
	}
	
	public void playGame() 
	{
		int rmd, len, count=0, flag;
		String ch, guess, temp, choice;
		Random r = new Random();
		
		rmd = r.nextInt(6);
		
		len = word[rmd].length();
		char[] userinput = new char[len];
		
		StringBuilder wrgstring=new StringBuilder();
		
	do
			
		{	
			flag=0;
			count++;
			
		for (int i=0; i<len; i++) 
		{
			System.out.print("_ ");
		}
		
			System.out.println();
			System.out.print("Enter your guess: ");
			ch = input.next().toLowerCase();
		
			for (int i=0; i<len; i++)
			{
				if (word[rmd].charAt(i) == ch.charAt(0)) 
				{
					flag=1;
					userinput[i]=word[rmd].charAt(i);
					
				}
			}
			if (flag==0) 
			{
				flag=1;
				wrgstring.append(ch + ",");
				System.out.println("\nMisses " + wrgstring);
			}
			
			System.out.println(userinput);
			temp = new String(userinput);
			if (word[rmd].equals(temp))
			{
				System.out.println("---------- Congrats :) You won ------------");
					System.out.println("Do you want to play again (Y/N)");
					choice = input.next();
		
					if (choice.equalsIgnoreCase("y")) 
					{
						playGame();
					} 
					else 
					{
						showmenu();
					}
			}
	}while (flag!=0);		
		
		do 
		{
			flag=0;
			
		
				
			for (int j=0; j<len; j++)
			{
				if (word[rmd].charAt(j) == ch.charAt(0)) 
				{
					flag=1;
					
				}
			}
				if (flag==1)
				{
					System.out.println("the letter is present in the word");
				}
				else
				{
					System.out.println("the letter is not present in the word");
				}
				System.out.println("Do want to guess again(y/n):");
					guess=input.next();
					flag=0;
		}while (guess.equals("y")||guess.equals("Y"));
	
	}
	
	
	
	
	
	public void instructGame() {}
	public void exitGame() {}
	
	public static void main(String[] args) 
    {
        Myexample m = new Myexample();
		m.showmenu();
    }
}


