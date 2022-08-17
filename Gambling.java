package com.bridgelabz;

public class Gambling {
	//UC1_Stake
	public static int stake = 100;
	public static int bet = 1;
	//UC2_Win or loose
	public static int checkWinOrLose(){
        int check = (int)(Math.floor(Math.random() * 10)%2);
        return check;
    }
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Program");
		
		// UC1_Stake
		System.out.println("Stake" +stake+ "$");
		System.out.println("bet" +bet+ "$");
		//UC2_Win or loose
		int check = checkWinOrLose();
	        if(check == 1){
	            System.out.println("bet wins");
	        }
	        else
	        {
	            System.out.println("bet loose");
	        }
	}

}
