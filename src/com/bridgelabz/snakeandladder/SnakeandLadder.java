package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
	public static final int maxVal=7;
	public static final int minVal=1;
	
	
	public static void main(String args[]) {
		
		System.out.println("------------Welcome to SnakeandLadder Problem------------");
		
		int startPos=0,diceVal=0;
		
		diceVal= (int) ((Math.random() * (maxVal - minVal)) + minVal);
		
		System.out.println("The dice roll value is "+diceVal);
		
		
		
		
		
	}
	

}
