// Package:
package packages;

// Imports
import packages.Debug;
import java.util.*;

// Class:
public class Deck {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private final Random RANDOM = new Random();
	
	// Global private vars:
	private List<List<List<String>>> cardList = new ArrayList<>();
	private int suite = 0;
	private int cardNumber = 0;
	
	// Global public vars:
	public String card;
	
	// Main:
	public static void main(String[] args) {
		Deck deck = new Deck();
	}
	
	public Deck() {
		shuffle();
		//getCard();
	}
	
	// Creates the deck of cards.
	public void shuffle() {
		// Fills the card list array with the four different suites:
		List<List<String>> suiteClubs = new ArrayList<>();
		List<List<String>> suiteDiamonds = new ArrayList<>();
		List<List<String>> suiteHearts = new ArrayList<>();
		List<List<String>> suiteSpades = new ArrayList<>();
		
		List<String> value = new ArrayList<>();
		
		// Fills the suite arrays with the thirteen different cards:
		for(int i = 1; i < 14; i++) {
			// Replaces the number 11 and higher cards with face cards:
			switch(i){
				case 1:
				value.add(11 + "");
				suiteClubs.add(value + "test");
				// suiteClubs.add("AC");
				// suiteDiamonds.add("AD");
				// suiteHearts.add("AH");
				// suiteSpades.add("AS");
				break;

				case 11:
				// suiteClubs.add("JC");
				// suiteDiamonds.add("JD");
				// suiteHearts.add("JH");
				// suiteSpades.add("JS");
				break;
				
				case 12:
				// suiteClubs.add("QC");
				// suiteDiamonds.add("QD");
				// suiteHearts.add("QH");
				// suiteSpades.add("QS");
				break;
				
				case 13:
				// suiteClubs.add("KC");
				// suiteDiamonds.add("KD");
				// suiteHearts.add("KH");
				// suiteSpades.add("KS");
				break;
				
				default:
				value.add(i + "");
				suiteClubs.add(value);
				// suiteClubs.add(i + "C");
				// suiteDiamonds.add(i + "D");
				// suiteHearts.add(i + "H");
				// suiteSpades.add(i + "S");
				break;
			}
		}
		
		// Adds the suites to the card list array:
		cardList.add(suiteClubs);
		cardList.add(suiteDiamonds);
		cardList.add(suiteHearts);
		cardList.add(suiteSpades);
		
		//cardList.get(0).add(new ArrayList());
		
		DEBUG.log(cardList);
	}
	
	// Gets a card from the card list array and return it.
	public void getCard() {
		// Get Suite:
		suite = RANDOM.nextInt(3 + 1);
		
		// Get Card Number:
		cardNumber = RANDOM.nextInt(12 + 1);
		
		checkCard();
	}
	
	// Checks if the card has already been played.
	private void checkCard() {
		// Redraw if the card is played:
		if (((ArrayList) cardList.get(suite)).get(cardNumber).toString() == "") {
			getCard();
			
			DEBUG.log("Card already in play.");
		}
		// Play the card:
		else
		{
			playCard();
		}
	}
	
	// Play the card.
	private void playCard() {
		// Get Card:
		card = ((ArrayList) cardList.get(suite)).get(cardNumber).toString();

		// Replace card:
		//cardList.get(suite).set(cardNumber, "");
		
		// Remove card:
		// cardList.get(suite).remove(cardNumber);
		
		//DEBUG.log(card);
		//DEBUG.log(cardList);
		
		//return card;
	}
}


























