package Assignments;

public class Main {
	public static void main(String [] args) {
		//create new card and new Deck
		Card c1 = new Card('H', 4);
		Deck d1 = new Deck(12); // should have 12 cards in the deck
		
		
		System.out.println(c1); // print out the card to check if tostring of Card class is working correctly
		
		d1.addCard(c1); // Try adding a card that already exists in the 
		
		System.out.println(d1); 
		
		d1.shuffle();
		
		System.out.println("Shuffled Deck");
		System.out.println(d1);
		
		Deck d2 = new Deck(0);
//		System.out.println(d2);
		
		System.out.println(d2.dealcard()); 
		
		System.out.println(d2.isEmpty());
		
		System.out.println(d2.getCard(1)); // index does not exist in d2
		
		//checking card constructor edge case
		Card c2 = new Card('C', -18);
		
		Card c3 = new Card('S', 100);
		
		System.out.println(c2);
		System.out.println(c3);
		
		// setting cardAmount of Deck constructor to a negative value and a value greater than 52
		Deck d3 = new Deck(-3);
		Deck d4 = new Deck(54);
		
		System.out.println(d3.deckSize());
		System.out.println(d4.deckSize());
		
		
		
		
		
	}
}
