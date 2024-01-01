package oop;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAccNo(10089);  
	    acc.setName("Shruti Mungale");  
	    acc.setEmail("shruti.mungale@somaiya.edu");  
	    acc.setPassword("Ghj90#");  
	    //getting values through getter methods  
	    System.out.println(acc.getAccNo()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getPassword());  
	}  
		
	}

