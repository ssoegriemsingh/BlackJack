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
	
	private void startGame() {
		dealer.greeting();
		
		for (int i = 0; i < 2; i++) {
			String dealerCard = dealer.hit();
			String playerCard = dealer.hit();
			dealer.addCard(dealerCard);
			player.addCard(playerCard);
		}
		
		dealer.showing();
		player.hand();
	}
	
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
	
	private void checkPlayer() {
		if(player.calculateHand() > 21) {
			System.out.println("BUSTED! You lose.");
			System.exit(0);
		}
	}
	
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