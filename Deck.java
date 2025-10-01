package Assignments;

import java.util.ArrayList;
import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card> (); // arraylist to store all the card objects
	private char[] suits = {'H', 'S', 'D', 'C'}; // suits for generating cards for constructor
	private int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13}; // ranks for generating cards for constructor
	
	public Deck(){ // default constructor
		
	}
	
	//Constructor for creating a deck with a custom amount of cards indicated by the user
	public Deck(int cardAmount) {
		int counter = 0;
		boolean flag = true;
		for(char s: suits) { // generates cards starting with Hearts, then Spades, then Diamonds, then Clubs.
			for(int r: ranks) {
				if(counter >= Math.clamp(cardAmount, 0, 52)) { // moved up
//					System.out.println("Error");
					flag = false;
					break;
				}
				Card c = new Card(s,r);
				cards.add(c);
				counter ++;
			}
			if(!flag) {
				break;
			}
		}
		
	}
	
	// returns the size of the deck
	public int deckSize() {
		return cards.size();
	}
	
	// returns whether the deck is empty 
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	// method for adding a new card to the deck, with checks for whether the deck is full or if there are duplicates
	public void addCard(Card newC) {
		if(cards.size() == 52) {
			System.out.println("Deck is full");
			return;
		}
		for(Card c: cards) {
			if (c.equals(newC)) {
				System.out.println("Card already in deck");
				return;
			}
		}
		cards.add(newC);
	}
	
	// shuffles deck 
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// returns the top most card of the deck, then removes it from the deck
	public Card dealcard() {
		if(!cards.isEmpty()) {
			Card cr = cards.get(0); // cr = card remove
			cards.remove(0);
			return cr;
		}
		else {
			System.out.println("Deck is empty, cannot deal card");
			return null;
		}
	}
	
	// returns the card at an index location, returns a blank card if the index does not exist.
	public Card getCard(int index) {
		if(index > cards.size()) {
			System.out.println("The index you inputed does not exist.");
			return null;
		}
		else {
			return cards.get(index);
		}
	}
	
	// toString to print out the entire deck 
	@Override
	public String toString() {
		String wholeDeck = "";
		for(Card c: cards) {
			wholeDeck += (c.toString() + '\n');
		}
		
		return wholeDeck;
	}
}
