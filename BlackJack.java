// Import:
import packages.*;
import java.util.*;


// Class:
public class BlackJack {
	// Constants:
	private static final Debug DEBUG = new Debug();
	
	// Variables:
	Deck deck = new Deck();
	Scanner scanner = new Scanner(System.in);
	
	// Main:
	public static void main(String[] args) {
		BlackJack blackjack =  new BlackJack();
	}
	
	// Constructor:
	public BlackJack() {
		greeting();
	}
	
	// Function: Make the player enter a name and display the greeting.
	public void greeting() {
		System.out.println("Enter your name:");
		String p1 = scanner.next();
		String greeting = p1 + ", lets play Black Jack!";
		System.out.println(greeting);
	}
}