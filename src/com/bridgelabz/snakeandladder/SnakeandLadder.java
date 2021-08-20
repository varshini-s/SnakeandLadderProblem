package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
	public static final int MAXVAL=7;
	public static final int MINVAL=1;
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static final int START=0;
	public static final int FINISH=100;


	public static void main(String args[]) {
		
		System.out.println("------------Welcome to SnakeandLadder Problem------------");
		
		//variables
		int currPos=0,diceVal=0,option=0;
		
		currPos=START;
		
		while(currPos!=FINISH) {
			System.out.println(currPos);
			
			//To restart from start position
			if(currPos<0) {
				currPos=START;
			}
	
			//for dice roll
			diceVal= (int) ((Math.random() * (MAXVAL - MINVAL)) + MINVAL);
			
			//for the options
			option=(int)Math.floor(Math.random()*100)%3;
			
			switch(option) {
			
				case LADDER:
					currPos+=diceVal;
					break;
				case SNAKE:
					currPos-=diceVal;
					break;
				case NO_PLAY:
					break;
			
				}
		

		}
		
		
		System.out.println("Reached final position :"+currPos);

		
	}
	

}
