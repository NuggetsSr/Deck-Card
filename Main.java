package Assignments;

public class Main {
	public static void main(String [] args) {
		//create new card and new Deck
		Card c1 = new Card('H', 11);
		Deck d1 = new Deck(42); // should have 42 cards in the deck
		// deck is created 
		System.out.println(c1); // print out the card to check if tostring of Card class is working correctly
		
		d1.addCard(c1); // Try adding a card that already exists in the 
		
//		System.out.println(d1); 
		
		d1.shuffle();
		
//		System.out.println(d1);
		
		
		
		
	}
}
