package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {

	    String[] deck = new String[52];// total 52 cards
	    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	    String[][] playCards = new String[4][9];
	    static Random random = new Random();

	    /*
	     * getting cards according to their rank and suits
	     */
	    public void alignCards() {
		int deckIndex = 0;// Initializing with 0;
		for (int i = 0; i < suit.length; i++) {
		    for (int j = 0; j < rank.length; j++) {
			// aligning ranks and suits together
			deck[deckIndex] = rank[j] + " of " + suit[i];
			deckIndex++;// incrementing deck index
		    }
		}
	    }

	   
	   
	   
	    public String[] suffleCards() {
		int j = 0;
		String temp;
		for (int i = 0; i < deck.length; i++) {
		    j = random.nextInt(52);/// getting random numbers from 0 to 52
		    // swapping existing data with random data//
		    temp = deck[i];
		    deck[i] = deck[j];
		    deck[j] = temp;
		}
		return deck;
	    }

	    /*
	     * displaying cards
	     */
	    public void displayCards(String[] deck) {
		int deckindex = 0;

		for (int i = 0; i < playCards.length; i++) {
		    System.out.println("player is " + (i + 1));
		    for (int j = 0; j < playCards[i].length; j++) {
			playCards[i][j] = deck[deckindex];
			System.out.println(playCards[i][j]);
			deckindex++;
		    }
		    System.out.println("");
		}
	    }

	    public static void main(String[] args) {
		DeckOfCards player = new DeckOfCards();
		player.alignCards();
		String[] deck = player.suffleCards();
		player.displayCards(deck);

	    }

	}

