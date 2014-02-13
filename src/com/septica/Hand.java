package com.septica;

public class Hand 
{
	private Card[] hand = new Card[4];
	
	public Hand()
	{
		for (int i = 0; i < 4; i++)
			hand[i] = null;
	}
	
	public Card discard(int cardIndex)
	{
		Card dCard = hand[cardIndex];
		hand[cardIndex] = null;
		return dCard;
	}
	
	public void draw(Card newCard)
	{
		for (int i = 0; i < 4; i++)
			if (hand[i] == null)
			{
				hand[i] = newCard;
				break;
			}
	}
	
	public int getPoints()
	{
		int points = 0;
		for (int i = 0; i < 4; i++)
			if (hand[i].isPoint())
				points++;
		return points;
	}
	
	public int getSlash()
	{
		int slash = 0;
		for (int i = 0; i < 4; i++)
			if (hand[i].isSlash())
				slash++;
		return slash;
	}
	
	public boolean fullHand()
	{
		for (int i = 0; i < 4; i++)
			if (hand[i] == null)
				return false;
		return true;
	}
}
