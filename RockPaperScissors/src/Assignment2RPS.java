import java.util.Scanner;
import java.util.Random;

// Programmer : Adam Hartman
// Purpose: Create a Rock-Paper-Scissors game

public class Assignment2RPS {

	public static void main(String[] args) {
		
		int computerNum;
		int playerNum;
		String computerTurn;
		String playerTurn;
		
		//Generate random number for computer's turn
		
		Random rand = new Random();
		computerNum = rand.nextInt(3);
		
		Scanner player = new Scanner(System.in);
		System.out.print("Rock (0) Paper (1) Scissors (2): ");
		playerNum = player.nextInt();
		
		String [] gameArray = {"Rock", "Paper", "Scissors"};
		
		computerTurn = gameArray[computerNum];
		playerTurn = gameArray[playerNum];
		
		if (computerNum ==  playerNum)
		{
			System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". It's a tie!");
		}
		else if(computerNum == 0)
		{
			if (playerNum == 1)
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Paper covers Rock, you win!");
			}
			else
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Rock crushes Scissors, you lose.");
			}
		}
		else if (computerNum == 1)
		{
			if (playerNum == 0)
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Paper covers Rock, you lose.");
			}
			else
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Scissors cuts Paper, you win!");
			}
		}
		else
		{
			if (playerNum == 0)
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Rock crushes Scissors, you win!");
			}
			else
			{
				System.out.println("Computer chose " + computerTurn + ", you chose " + playerTurn + ". Scissors cuts Paper, you lose.");
			}
		}
	}
}
