package Modifiers;

public class FinalDemo {
	
		  final int x = 10;
		   int y = 3;

		  public static void main(String[] args) {
		    FinalDemo myObj = new FinalDemo();
		    
		    	 myObj.y = 50; 
				 //myObj.x = 25; //generates error
		   
		   
		  }
		}

