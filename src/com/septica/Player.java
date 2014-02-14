package com.septica;

public abstract class Player 
{
	protected Hand hand;
	public abstract Card discard(int cardIndex);
	public abstract void draw(Card newCard);
}
