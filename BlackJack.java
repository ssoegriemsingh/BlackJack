// Import:
import packages.*;

// Class:
public class BlackJack {
	// Constants:
	private static final Debug DEBUG = new Debug();
	
	// Variables:
	Dealer dealer = new Dealer();
	Player player = new Player();
	
	// Main:
	public static void main(String[] args) {
		BlackJack blackjack =  new BlackJack();
	}
	
	// Constructor:
	public BlackJack() {
		startGame();
		playerTurn();
		dealerTurn();
	}
	
	// Function: Starts the game with a greeting and deals the starting hand.
	private void startGame() {
		dealer.greeting();
		
		// Deals the starting hand.
		for (int i = 0; i < 2; i++) {
			String dealerCard = dealer.hit();
			String playerCard = dealer.hit();
			dealer.addCard(dealerCard);
			player.addCard(playerCard);
		}
		
		// Shows the last card the dealer got and the cards the player has.
		dealer.showing();
		player.hand();
	}
	
	// Function: Give the player the choice between hit and stand.
	private void playerTurn() {
		boolean playerTurn = true;
		
		while(playerTurn) {
			dealer.hitOrStand();
			boolean hit = player.hitOrStand();
			
			if(hit) {
				player.addCard(dealer.hit());
				player.hand();
				checkPlayer();
			}
			else {
				playerTurn = false;
			}
		}
	}
	
	// Function: Makes the dealer hit if he is behind.
	private void dealerTurn() {
		boolean dealerTurn = true;
		
		while(dealerTurn) {
			boolean hit = dealer.checkCards(player.calculateHand());
			
			if(hit) {
				dealer.addCard(dealer.hit());
				dealer.calculateHand();
			}
			else {
				dealerTurn = false;
			}
		}
		
		checkDealer();
	}
	
	// Function: Checks if the player busted after each hit.
	private void checkPlayer() {
		if(player.calculateHand() > 21) {
			System.out.println("BUSTED! You lose.");
			System.exit(0);
		}
	}
	
	// Function: Checks the final score and displays results.
	private void checkDealer() {
		int dealerTotal = dealer.calculateHand();
		int playerTotal = player.calculateHand();
		
		if(dealerTotal > 21) {
			System.out.println("Dealer BUSTED! You win.");
			System.exit(0);
		}
		else if(dealerTotal == playerTotal) {
			System.out.println("Draw");
			System.exit(0);
		}
		else if(dealerTotal > playerTotal) {
			System.out.println("You lose.");
			System.exit(0);
		}
	}
}