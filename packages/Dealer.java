// Package:
package packages;

// Imports:
import java.util.*;
import packages.Deck;

// Class:
public class Dealer {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private static final Calculate CALC = new Calculate();
	private static final Scanner SCANNER = new Scanner(System.in);
	
	// Variables:
	Deck deck = new Deck();
	private List<String> dealerHand = new ArrayList<>();

	// Main:
	public static void main (String[] args) {
		Dealer dealer =  new Dealer();
	}
	
	// Constructor:
	public Dealer() {
		
	}
	
	// Function: Make the player enter a name and display the greeting.
	public void greeting() {
		System.out.println("Enter your name:");
		String p1 = SCANNER.next();
		String greeting = p1 + ", lets play Black Jack!";
		System.out.println(greeting);
	}
	
	// Function: Adds a card to the dealers hand.
	public void addCard(String card) {
		dealerHand.add(card);
	}
	
	// Function: Shows the last card the dealer got.
	public void showing() {
		System.out.println("Dealer is showing: " + dealerHand.get(1));
	}
	
	// Function: Get a card from the deck.
	public String hit() {
		String card = deck.getCard();
		return card;
	}
	
	// Function: Asks the player hit or stand.
	public void hitOrStand() {
		System.out.println("Hit (h) or Stand (s)?");
	}
	
	// Function: Checks to see if the dealer hits or stands.
	public boolean checkCards(int playerTotal) {
		int dealerTotal = calculateHand();
		
		System.out.println("Dealer has: " + dealerHand);
		System.out.println("Dealer total: " + dealerTotal);
		
		if(dealerTotal < playerTotal) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Function: Calculates the total of the dealers hand.
	public int calculateHand() {
		int total = CALC.calc(dealerHand);
		return total;
	}
}