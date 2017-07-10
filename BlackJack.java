// Import:
import packages.*;

// Class:
public class BlackJack {
	// Constants:
	private static final Debug DEBUG = new Debug();
	
	// Variables:
	Deck deck = new Deck();
	Dealer dealer = new Dealer();
	
	// Main:
	public static void main(String[] args) {
		BlackJack blackjack =  new BlackJack();
	}
	
	// Constructor:
	public BlackJack() {
		dealer.greeting();
	}
	
	
}