// Package:
package packages;

// Imports
import packages.*;
import java.util.*;

// Class:
public class Deck {
	// Constants:
	private static final Debug DEBUG = new Debug();
	private final Random random = new Random();
	
	// Global private vars:
	private ArrayList<ArrayList<String>> cardList = new ArrayList<ArrayList<String>>();
	private int suite = 0;
	private int cardNumber = 0;
	
	// Global public vars:
	public String card;
	
	// Main:
	public static void main(String[] args) {
		Deck deck = new Deck();
	}
	
	public Deck() {
		Shuffle();
		//GetCard();
	}
	
	// Creates the deck of cards.
	public void Shuffle() {
		// Fills the card list array with the four different suites:
		ArrayList<String> suiteClubs = new ArrayList<String>();
		ArrayList<String> suiteDiamonds = new ArrayList<String>();
		ArrayList<String> suiteHearts = new ArrayList<String>();
		ArrayList<String> suiteSpades = new ArrayList<String>();
		
		// Fills the suite arrays with the thirteen different cards:
		for(int i = 1; i < 14; i++) {
			// Replaces the number 11 and higher cards with face cards:
			switch(i){
				case 1:
				suiteClubs.add("AC");
				suiteDiamonds.add("AD");
				suiteHearts.add("AH");
				suiteSpades.add("AS");
				break;

				case 11:
				suiteClubs.add("JC");
				suiteDiamonds.add("JD");
				suiteHearts.add("JH");
				suiteSpades.add("JS");
				break;
				
				case 12:
				suiteClubs.add("QC");
				suiteDiamonds.add("QD");
				suiteHearts.add("QH");
				suiteSpades.add("QS");
				break;
				
				case 13:
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
		
		// Adds the suites to the card list array:
		cardList.add(suiteClubs);
		cardList.add(suiteDiamonds);
		cardList.add(suiteHearts);
		cardList.add(suiteSpades);
		
		//DEBUG.log(cardList);
	}
	
	// Gets a card from the card list array and return it.
	public void GetCard() {
		// Get Suite:
		suite = random.nextInt(3 + 1);
		
		// Get Card Number:
		cardNumber = random.nextInt(12 + 1);
		
		CheckCard();
	}
	
	// Checks if the card has already been played.
	private void CheckCard() {
		// Redraw if the card is played:
		if (((ArrayList) cardList.get(suite)).get(cardNumber).toString() == "") {
			GetCard();
			
			DEBUG.log("Card already in play.");
		}
		// Play the card:
		else
		{
			PlayCard();
		}
	}
	
	// Play the card.
	private void PlayCard() {
		// Get Card:
		card = ((ArrayList) cardList.get(suite)).get(cardNumber).toString();

		// Replace card:
		cardList.get(suite).set(cardNumber, "");
		
		// Remove card:
		// cardList.get(suite).remove(cardNumber);
		
		//DEBUG.log(card);
		//DEBUG.log(cardList);
		
		//return card;
	}
}


























