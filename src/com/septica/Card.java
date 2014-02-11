package com.septica;

public class Card 
{
	private int rank;
	private int suite;
	
	public Card(int suite, int rank)
	{
		this.rank = rank;
		this.suite = suite;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public int getSuite()
	{
		return suite;
	}
}
