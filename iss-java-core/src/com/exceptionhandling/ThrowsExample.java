package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileReader fr = null;
		
			fr = new FileReader("C:\\Users\\shrut\\Desktop\\tes.txt");//incorrect file name throws exception
		

			// Declaring loop variable
			int i;
			// Holds true till there is nothing to read
			
				while ((i = fr.read()) != -1)

					// Print all the content of a file
					System.out.print((char)i);
			

		
		
		
	}

}
