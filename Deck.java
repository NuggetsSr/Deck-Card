package Assignments;

import java.util.ArrayList;
import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card> (); // arraylist to store all the card objects
	private char[] suits = {'H', 'S', 'D', 'C'}; // suits for generating cards for constructor
	private int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13}; // ranks for generating cards for constructor
	
	public Deck(){
		
	}
	
	public Deck(int cardAmount) { // cardAmount specifies how many cards is needed in the deck
		int counter = 0;
		boolean flag = true;
		for(char s: suits) {
			for(int r: ranks) {
				Card c = new Card(s,r);
				cards.add(c);
				if(counter > Math.clamp(cardAmount, 0, 52)) {
					flag = false;
					break;
				}
				counter ++;
			}
			if(!flag) {
				break;
			}
		}
		
	}
	
	public int deckSize() {
		return cards.size();
	}
	
	
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
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card dealcard() {
		if(cards.size() > 0) {
			Card cr = cards.get(0); // cr = card remove
			cards.remove(0);
			return cr;
		}
		else {
			Card cNo = new Card();
			System.out.println("Deck is empty, cannot deal card");
			return cNo;
		}
	}
	
	public Card getCard(int index) {
		Card blank = new Card();
		if(index > cards.size()) {
			System.out.println("The index you inputed does not exist.");
			return blank;
		}
		else {
			return cards.get(index);
		}
	}
	
	@Override
	public String toString() {
		String wholeDeck = "";
		for(Card c: cards) {
			wholeDeck += (c.toString() + '\n');
		}
		
		return wholeDeck;
	}
}
