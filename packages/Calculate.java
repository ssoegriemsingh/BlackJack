// Packages:
package packages;

// Import:
import packages.*;
import java.util.*;

// Class:
public class Calculate {
	
	// Constants:
	private static final Debug DEBUG = new Debug();
	
	// Main:
	public static void main(String[] args) {
		
	}
	
	// Constructor:
	public Calculate() {
		
	}
	
	public static int calc(List<String> stringArray) {
		int total = 0;
		
		for(String stringValue : stringArray) {
			if(stringValue.contains("K") || stringValue.contains("Q") || stringValue.contains("J")) {
				total += 10;
			}
			else if(stringValue.contains("A")) {
				total += 11;
			}
			else {
				String value = stringValue.replaceAll("[^0-9.]", "");
				total += Integer.parseInt(value);
			}
		}
		
		return total;
	}
}