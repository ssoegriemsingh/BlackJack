// Package:
package packages;

// Imports:
import java.util.*;

public class Dealer {
	// Variables:
	Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) {
		
	}
	
	public Dealer() {
		
	}
	
	// Function: Make the player enter a name and display the greeting.
	public void greeting() {
		System.out.println("Enter your name:");
		String p1 = scanner.next();
		String greeting = p1 + ", lets play Black Jack!";
		System.out.println(greeting);
	}
}