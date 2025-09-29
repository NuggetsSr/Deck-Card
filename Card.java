package Assignments;


public class Card {
	private char suit; // suit will be H, S, D, C
	private int rank;
	
	public Card() { // default constructor
		suit = 'H'; 
		rank = 1 ;
	}
	
	public Card(char suit, int rank) {
		this.suit = suit; 
		this.rank = Math.clamp(rank,0,13); // value, min, max
	}
	
	public boolean equals(Card other) {
		if((this.suit == other.suit) && (this.rank == other.rank)) {
			return true;
		}
		else {
			return false;
		}
	}

	public char getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	
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
