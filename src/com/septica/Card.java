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
