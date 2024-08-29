import java.util.Scanner;

class Guesser
{
	int guessNumber;
	
	int guessingNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser! Kindly guess the number");
		guessNumber=scan.nextInt();
		return guessNumber;
	}
	
}
class Player
{
	int guessNumber;
	
	int guessingNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player! Kindly guess the number");
		guessNumber=scan.nextInt();
		return guessNumber;
	}
	
	
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessingNumber();
		
	}
	void collectnumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessingNumber();
		numFromPlayer2=p2.guessingNumber();
		numFromPlayer3=p3.guessingNumber();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 2, Player 3  guessed correctly Game tied");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 & Player 2 guessed correctly and game tied");

			}
			
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player 3 guessed correctly and game tied");

			}
			else
			{
				System.out.println("Player 1 won the game");
			}
		}
		
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player 3 guessed correctly and game tied");

			}
			else
			{
			
				System.out.println("Player2 won the game");
			}
			
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		else
		{
			System.out.println("GameLost! Try Again");
		}
	}
}




public class LaunchGame 
{
	public static void main(String[] args) 
	{
		Umpire umpire =new Umpire();
		
		umpire.collectNumFromGuesser();
		umpire.collectnumFromPlayers();
		umpire.compare();
	}
	

}
