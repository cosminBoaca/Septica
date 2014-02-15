package com.septica;

public class Card 
{
	private static Card[] instance = new Card[52];
	private int rank;
	private int suite;
	
	public static Card getInstance(int rank, int suite)
	{
		int index = (rank - 2) * 4 + suite - 1;
		if (instance[index] == null)
			instance[index] = new Card(rank, suite);
		return instance[index];
	}
	
	private Card(int suite, int rank)
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
	
	public boolean isPoint()
	{
		if (rank == 10 || rank == 11)
			return true;
		else return false;
	}
	
	public boolean isSlash()
	{
		if (rank == 7)
			return true;
		else return false;
	}
}
