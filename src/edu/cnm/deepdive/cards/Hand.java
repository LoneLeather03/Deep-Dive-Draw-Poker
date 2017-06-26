/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Arrays;

/** Uses other classes to generate hand.
 * @author David Martinez
 *
 */
public class Hand implements Comparable<Hand> {
	
	private final Deck deck;
	private final int size;
	private final ArrayList<Card> cards;
	
	/** 
	 * @param deck Source of cards in the hand.
	 * @param size Number of cards drawn for the hand.
	 */
	public Hand(Deck deck, int size) {
		this.deck = deck;
		this.size = size;
		cards = new ArrayList<>(Arrays.asList(deck.draw(size)));
	}

	@Override
	public int compareTo(Hand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
