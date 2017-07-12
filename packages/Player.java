// Package:
package packages;

// Imports:
import java.util.*;

// Class:
public class Player {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private static final Calculate CALC = new Calculate();
	private static final Scanner SCANNER = new Scanner(System.in);
	
	// Variables:
	private List<String> playerHand = new ArrayList<>();

	// Main:
	public static void main (String[] args) {
		Player player = new Player();
	}
	
	// Constructor:
	public Player() {
		
	}

	// Function: Adds a card to the players hand.
	public void addCard(String card) {
		playerHand.add(card);
	}
	
	// Function: Gets the input from the player.
	public boolean hitOrStand() {
		String input = SCANNER.next();
		
		if(input.equals("h"))
		{
			return true;
		}
		else if(input.equals("s"))
		{
			return false;
		}
		return false;
	}
	
	// Function: Prints the player hand and player total.
	public void hand() {
		System.out.println("Player has: " + playerHand);
		System.out.println("Player total: " + calculateHand());
	}
	
	// Function: Calculates the total of the players hand.
	public int calculateHand() {
		int total = CALC.calc(playerHand);
		return total;
	}
}