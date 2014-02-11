package com.septica;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Deck 
{	
	private Queue<Card> deck = new LinkedList<Card>();

	public void deckInitialize()
	{
		int cardRank, cardSuite;
		for (int i = 0; i < 52; i++)
		{
			cardSuite = i % 4 + 1;
			cardRank = i / 4 + 1;
			deck.add(new Card(cardSuite, cardRank));
		}
	}
	
	public int getNumberOfCards()
	{
		return deck.size();
	}
	
	public Card getTopCard()
	{
		Card topCard = deck.poll();
		return topCard;
	}
	
	public void shuffle()
	{
		Random random = new Random();
		int randomCard, currentDeckSize = getNumberOfCards();
		Card[] deckArray = new Card[52];
		Card auxCard;
		
		//Copies each card from the deck to an auxiliary array for shuffling
		while (getNumberOfCards() != 0)
		{
			deckArray[getNumberOfCards() - 1] = deck.poll();
		}
		
		//Shuffles the deck
		for (int i = currentDeckSize - 1; i >= 0; i--)
		{
			randomCard = random.nextInt(i);
			auxCard = deckArray[randomCard];
			deckArray[randomCard] = deckArray[i];
			deckArray[i] = auxCard;
		}
		
		//Adds the cards back to the deck
		for (int i = 0; i < currentDeckSize; i++)
		{
			deck.add(deckArray[i]);
		}
	}
	
}
