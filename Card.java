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

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		String suitStr = "";

		
		
		return this.suit + " " + this.rank;
	}
}
