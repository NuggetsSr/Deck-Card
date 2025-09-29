package Assignments;

import java.util.ArrayList;
import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card> ();
	private char[] suits = {'H', 'S', 'D', 'C'};
	private int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	
	public Deck(){
		
	}
	
	public Deck(int cardAmount) {
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
	
	@Override
	public String toString() {
		String wholeDeck = "";
		for(Card c: cards) {
			wholeDeck += (String.valueOf(c.getSuit()) + c.getRank() + ' ');
		}
		
		return wholeDeck;
	}
}
