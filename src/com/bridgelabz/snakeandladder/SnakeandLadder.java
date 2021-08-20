package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
	public static final int MAXVAL=7;
	public static final int MINVAL=1;
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static final int START=0;
	public static final int FINISH=100;
	
	public static int Playernum=0;
	
	public static int position(int pos,int dicenum) {
		int option=0;

		//for the options
		option=(int)Math.floor(Math.random()*100)%3;
		
		switch(option) {
		
			case LADDER:
				pos+=dicenum;
				if(Playernum==1) {
					Playernum=2;
				}
				else if(Playernum==2) {
					Playernum=1;
				}
				break;
			case SNAKE:
				pos-=dicenum;
				break;
			case NO_PLAY:
				break;
		
			}
		//To handle the case of greater than 100
		if(pos>100) {
			pos-=dicenum;
		}
		//To restart from start position
		else if(pos<0) {
			pos=START;
		}
	
	return pos;
	}


	public static void main(String args[]) {
		
		System.out.println("------------Welcome to SnakeandLadder Problem------------");
		
		//variables
		int currPos=0,diceVal=0,countDiceRoll=0;
		
		currPos=START;
		
		Player P1 = new Player();
		Player P2 = new Player();
		
		Playernum=1;
		
		while(P1.currpos!=FINISH && P2.currpos!=FINISH) {
			
		
			//for dice roll
			diceVal= (int) ((Math.random() * (MAXVAL - MINVAL)) + MINVAL);
			
			countDiceRoll++;
			
			if(Playernum==1) {
				
				Playernum=2;
				P1.currpos=position(P1.currpos,diceVal);
				System.out.println("Player1 position"+P1.currpos);

				
			}
			else if(Playernum==2) {
				
				Playernum=1;
				P2.currpos=position(P2.currpos,diceVal);
				System.out.println("Player2 position"+P2.currpos);

				
			}
		
		}
		
		System.out.println("Number of times dice rolled: "+countDiceRoll);
		if(P1.currpos==FINISH) {
			System.out.println("Player 1 won the game");
		}
		else if(P2.currpos==FINISH) {
			System.out.println("Player 2 won the game");
		}

		
	}
	

}
