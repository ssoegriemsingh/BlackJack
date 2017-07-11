// Package:
package packages;

// Imports:
import java.util.*;

import packages.Deck;

public class Dealer {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private static final Calculate CALC = new Calculate();
	private static final Scanner SCANNER = new Scanner(System.in);
	
	// Variables:
	Deck deck = new Deck();
	
	private List<String> dealerHand = new ArrayList<>();

	public static void main (String[] args) {
		Dealer dealer =  new Dealer();
	}
	
	public Dealer() {
		
	}
	
	// Function: Make the player enter a name and display the greeting.
	public void greeting() {
		System.out.println("Enter your name:");
		String p1 = SCANNER.next();
		String greeting = p1 + ", lets play Black Jack!";
		System.out.println(greeting);
	}
	
	public void addCard(String card) {
		dealerHand.add(card);
	}
	
	public void showing() {
		// DEBUG.log(dealerHand);
		System.out.println("Dealer is showing: " + dealerHand.get(1));
	}
	
	public String hit() {
		// System.out.println("HIT");
		String card = deck.getCard();
		return card;
	}
	
	public void hitOrStand() {
		System.out.println("Hit (h) or Stand (s)?");
	}
	
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
	
	public int calculateHand() {
		int total = CALC.calc(dealerHand);
		return total;
	}
}