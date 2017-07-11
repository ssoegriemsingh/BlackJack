// Package:
package packages;

// Imports:
import java.util.*;

public class Player {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private static final Calculate CALC = new Calculate();
	private static final Scanner SCANNER = new Scanner(System.in);
	
	// Variables:
	private List<String> playerHand = new ArrayList<>();

	public static void main (String[] args) {
		Player player = new Player();
	}
	
	public Player() {
		
	}

	public void addCard(String card) {
		playerHand.add(card);
	}
	
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
	
	public void hand() {
		System.out.println("Player has: " + playerHand);
		System.out.println("Player total: " + calculateHand());
	}
	
	public int calculateHand() {
		int total = CALC.calc(playerHand);
		return total;
	}
}