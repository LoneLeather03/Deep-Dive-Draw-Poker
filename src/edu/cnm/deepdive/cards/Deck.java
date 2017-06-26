/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * @author David Martinez
 *Class dealing with shuffling and dealing out cards from a deck of cards.
 */
public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<>();
	private boolean shuffled = false;
	private Random rng = null;
	private int position;
	
	/**
	 * Class calling Card class to assign rank and value to each card in the deck.
	 */
	public Deck() {
		super();
		cards = new ArrayList<>();
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				Card card = new Card(suit, rank);
				cards.add(card);
			}
		}
		shuffled = false;
		position = 0;
	}
	/**
	 * Shuffles deck.
	 * @throws NoSuchAlgorithmException
	 */
	public void shuffle()
		throws NoSuchAlgorithmException {
		if (rng == null) {
			rng = SecureRandom.getInstanceStrong();
		}
		Collections.shuffle(cards, rng);
		shuffled = true;
		position = 0;
	}
	
	/**
	 * Returns cards as an array.
	 * @return
	 */
	public Card[] toArray() {
		return cards.toArray(new Card[] {});
		}
	
	/**
	 * Draws cards to deal hand.
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	public Card draw() 
		throws IndexOutOfBoundsException {
		return cards.get(position ++);
	}
	/**
	 * 
	 * @param numCards Number of cards to draw.
	 * @return Cards drawn from the top of the deck.
	 * @throws IndexOutOfBoundsException Thrown when fewer than the requested number of cards
	 * are in the deck.
	 */
	public Card[] draw(int numCards) 
			throws IndexOutOfBoundsException {
		Card[] hand = new Card[numCards];
		for (int i = 0; i < hand.length; i++) {
			hand[i] = draw();
		}
		return hand;
	}
	
	
}	
	
