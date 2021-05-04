package gameconsole;

abstract class GameConsole 
{
    int score;
    void displayScore() 
    {
        System.out.println("The displayScore method.");
    }
    abstract void computeScore();
    abstract void playGame();
}

class Badminton extends GameConsole 
{
    void playGame() 
    {
        System.out.println("Starting the Badminton Game...");
		computeScore();
    }
    void computeScore() 
    {
        System.out.println("badminton Score.");
		displayScore();
    }
}

class Basketball extends GameConsole 
{
    void playGame() 
    {
        System.out.println("Starting the Basketball Game...");
		computeScore();
    }
    void computeScore() 
    {
        System.out.println("Basketball score.");
		displayScore();
    }
}

class GameDemo 
{
    public static void main(String args[]) 
    {
        Badminton obj1 = new Badminton();
        obj1.playGame();

		Basketball obj2 = new Basketball();
        obj2.playGame();
    }
}

