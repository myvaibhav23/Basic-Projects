import java.util.Scanner;

	
	class Guesser
	{
		int [] g = {1,2,3,4,5,6,7,8,9,10};
		
		int guessNum;//guesser will guess no which of integer type so int
		int guessNum() // retuen type int this method will be used when umpire call it from PSVM
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("G kindly guess number");
			guessNum = sc.nextInt();
			 return guessNum;
	    }	
	 }
	
	class Player
	{
		int guessNum;//Palyer will try too guess the numebr which is of integer type
		int guessNum()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("P kindly guess number");
			guessNum= sc.nextInt();
			return guessNum;
			
		}
		
	}
	class Umpire
	
	{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		int numFromPlayer4;
		void collectNumFromGuesser() 
		{
			Guesser g=new Guesser();
			numFromGuesser=g.guessNum();
			
		}
		
		void collectNumFromPlayers()
		{
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			Player p4=new Player();
			numFromPlayer1=p1.guessNum();
			numFromPlayer2=p2.guessNum();
			numFromPlayer3=p3.guessNum();
			numFromPlayer4=p4.guessNum();
		}
	  
		void compare()
		{
			int a= numFromGuesser;
			int B1=numFromPlayer1;
			int B2=numFromPlayer2;
			int B3=numFromPlayer3;
			int B4=numFromPlayer4;
			boolean flag=false;
			
			
		if(a<=10 && a>0) // for guseerr
		{
		 if(B1<=10 && B1>0) //for player
		 {
			if(a==numFromPlayer1 ) 
		    {
			if((a==numFromPlayer2) && (a==numFromPlayer3)&& (a==numFromPlayer4))
			 {
				System.out.println("All players won the game");//this condition is for all three
			 } 
			else if(numFromGuesser==numFromPlayer2)
			 {
				System.out.println("Player 1 and player 2 won the game");
			 }
			else if(numFromGuesser==numFromPlayer3) 
			 {
				System.out.println("Player 1 and player 3 won the game");
			 }
			else if(numFromGuesser==numFromPlayer4)
			 {
				System.out.println("Player 1 and player 4 won the game");
			 }
			else
			 {
				System.out.println("Player 1 won the game");
							
			 }
			System.out.println("P1 entering out of limit");
		    }
		  }
				
		   
		    
		    			
			 
		  
		  
		else if(numFromGuesser==numFromPlayer2&&B2<=10&&B2>0) 
		   {
		     if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4) 
		     {
		     System.out.println("Player 2, 3 and player 4 won the game");
		     }
		     else if(numFromGuesser==numFromPlayer3)
		     {
		    	 System.out.println("Player 2 and player 3 won the game");
		    	 
		     }
		     else if(numFromGuesser==numFromPlayer4) 
		     {
		   
			     System.out.println("Player 2 and player 4 won the game");
			    
		     }
		     else
		     {
		    	 System.out.println("Player 2 won the game");
		    	 
		     }
		   }
		     		
		   
		else if(numFromGuesser==numFromPlayer3) 
		 {
			 if  (numFromGuesser==numFromPlayer4)
			 {
				 System.out.println("Player 3 and player 4 won the game");
				
			 }
		    else
		     {
		    	System.out.println("Player 3 won the game");
		    	
		     }
		 }
		else if   (numFromGuesser==numFromPlayer4) 
			{
			System.out.println("Player 4 won the game");
			
			}
		else 
			{  	
		    	System.out.println("All fail try again");
		    	
		    }
		 
	}	
	else
	System.out.println("guesser is gussing out of range number choose between 1 to 10");
		}	
	}
public class Projectfirst {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		  Umpire u =new Umpire();
		  u.collectNumFromGuesser();
		  u.collectNumFromPlayers();
		  u.compare();	
		  
	}
	
}
	
