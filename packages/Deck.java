// Package:
package packages;

// Imports:
import packages.*;
import java.util.*;

// Class:
public class Deck {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private final Random RANDOM = new Random();
	
	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;
	
	// Global vars:
	private ArrayList<ArrayList<String>> cardList = new ArrayList<ArrayList<String>>();
	private int suite = 0;
	private int cardNumber = 0;
	
	// Main:
	public static void main(String[] args) {
		Deck deck = new Deck();
	}
	
	// Constructor:
	public Deck() {
		shuffle();
	}
	
	// Function: Creates the deck of cards.
	public void shuffle() {
		// Fills the card list array with the four different suites.
		ArrayList<String> suiteClubs = new ArrayList<String>();
		ArrayList<String> suiteDiamonds = new ArrayList<String>();
		ArrayList<String> suiteHearts = new ArrayList<String>();
		ArrayList<String> suiteSpades = new ArrayList<String>();
		
		// Fills the suite arrays with the thirteen different cards.
		for(int i = ACE; i <= KING; i++) {
			// Replaces the number 11 and higher cards with face cards.
			switch(i){
				case ACE:
					suiteClubs.add("AC");
					suiteDiamonds.add("AD");
					suiteHearts.add("AH");
					suiteSpades.add("AS");
					break;

				case JACK:
					suiteClubs.add("JC");
					suiteDiamonds.add("JD");
					suiteHearts.add("JH");
					suiteSpades.add("JS");
					break;
				
				case QUEEN:
					suiteClubs.add("QC");
					suiteDiamonds.add("QD");
					suiteHearts.add("QH");
					suiteSpades.add("QS");
					break;
				
				case KING:
					suiteClubs.add("KC");
					suiteDiamonds.add("KD");
					suiteHearts.add("KH");
					suiteSpades.add("KS");
					break;
				
				default:
					suiteClubs.add(i + "C");
					suiteDiamonds.add(i + "D");
					suiteHearts.add(i + "H");
					suiteSpades.add(i + "S");
					break;
			}
		}
		
		// Adds the suites to the card list array.
		cardList.add(suiteClubs);
		cardList.add(suiteDiamonds);
		cardList.add(suiteHearts);
		cardList.add(suiteSpades);
	}
	
	// Function: Gets a card from the card list array and return it.
	public String getCard() {
		// Get Suite.
		suite = RANDOM.nextInt(4);
		
		// Get Card Number.
		cardNumber = RANDOM.nextInt(cardList.get(suite).size());

		// Get card.
		String card = playCard();
		
		return card;
	}
	
	// Function: Removes the card from the arraylist.
	private String playCard() {
		// Get Card.
		String card = cardList.get(suite).get(cardNumber).toString();
		
		// Remove card.
		 cardList.get(suite).remove(cardNumber);
		
		return card;
	}
}


























