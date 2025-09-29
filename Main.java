package Assignments;

public class Main {
	public static void main(String [] args) {
		Card c1 = new Card('H', 5);
		Deck d1 = new Deck(42);
		System.out.println(c1);
		
		d1.addCard(c1);
		
		System.out.println(d1);
		
		d1.shuffle();
		
		
	}
}
