package Assignments;


public class Card {
	private char suit; // suit will be H, S, D, C
	private int rank; // rank = 1 to 13
	
	public Card() { // default constructor
		
	}
	// constructor to create a Card object
	public Card(char suit, int rank) { 
		this.suit = suit; 
		// currently does not account for User inputting anything but char and an uppercase H,S,D,C
	
		this.rank = Math.clamp(rank,1,13); // value, min, max
		// Clamp to ensure that the rank stays between 1 and 13, no matter what user inputs
	}
	
	// custom equals method to compare two Cards for checking for duplicates
	@Override
	public boolean equals(Object other) { // Object other bc of @Override
		Card otherC = (Card) other; 
		if((this.suit == otherC.suit) && (this.rank == otherC.rank)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// getters
	public char getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	// Override toString method to have custom outputs in the format of rank + "of" + suits
	@Override
	public String toString() {
		String suitStr = "";
		
		switch(rank){
			case 1:
				suitStr += "Ace";
				break;
			case 11:
				suitStr += "Jack";
				break;
			case 12:
				suitStr += "Queen";
				break;
			case 13:
				suitStr += "King";
				break;
			default:
				suitStr += rank;
				break;
		}
		
		switch(suit) {
			case 'H':
				suitStr += " of Hearts";
				break;
			case 'S':
				suitStr += " of Spades";
				break;
			case 'D':
				suitStr += " of Diamonds";
				break;
			default:
				suitStr += " of Clubs";	
				break;
		}	
		
		return suitStr;
	}
}
