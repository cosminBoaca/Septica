package com.septica;

public class Card 
{

	private int rank;
	private int suite;
	
	/*private Card()
	{
		rank = 0;
		suite = 0;
	}*/
	
	public Card(int suiteValue, int rankValue)
	{
		rank = rankValue;
		suite = suiteValue;
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
