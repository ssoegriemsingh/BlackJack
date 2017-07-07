// Import:
import packages.*;


// Class:
public class BlackJack {
	// Variables:
	Debug debug = new Debug();
	
	// Main:
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.GetCard();
		
		// Test to see if CheckCard works:
		for (int i = 0; i < 50; i++) {
			deck.GetCard();
		}
	}
}