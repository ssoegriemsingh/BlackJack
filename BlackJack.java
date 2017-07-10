// Import:
import packages.*;


// Class:
public class BlackJack {
	// Constants:
	private static final Debug DEBUG = new Debug();
	
	// Main:
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.GetCard();
		
		// Test to see if CheckCard works:
		for (int i = 0; i < 50; i++) {
			deck.GetCard();
		}
		
		DEBUG.log(deck.card);
	}
}