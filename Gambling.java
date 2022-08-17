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
		
//		// UC1_Stake
//		System.out.println("Stake" +stake+ "$");
//		System.out.println("bet" +bet+ "$");
//		//UC2_Win or loose
//		int check = checkWinOrLose();
//	        if(check == 1){
//	            System.out.println("bet wins");
//	        }
//	        else
//	        {
//	            System.out.println("bet loose");
//	        }
//		}
		//UC3_Calculate 50 % stake
		int wins = 0;
		int loose = 0;
		boolean status = false;
	    int totalWins = 0;
        int totalLoose = 0;
        
		 for(int day=1; day<=20; day++){      
		 for(int i=1; i<=stake; i++){
	            int check = checkWinOrLose();
	            if(check == 1){
	                wins++;
	                totalWins++;
	                if(wins == 50){
	                	wins = 0;
	                    status = true;
	                    System.out.println("Win by 50%");
	                }
	            	}else if (loose == 50){
	            	loose = 0;
	                status = false;
	                System.out.println("Loose by 50%");
	                }
		 		
		 		else {
		 			loose++;
		 			totalLoose++;
		 			}
		 }
	        if (status){
	            System.out.println("Win stake="+(stake+wins));
	        }
	        else
	        {
	            System.out.println("Loose stake= "+(stake-loose));
	        }
	}
	}
}
