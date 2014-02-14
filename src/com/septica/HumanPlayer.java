package com.septica;

public class HumanPlayer extends Player 
{

	@Override
	public Card discard(int cardIndex) 
	{
		return hand.discard(cardIndex);
	}

	@Override
	public void draw(Card newCard)
	{
		hand.draw(newCard);
	}

}
