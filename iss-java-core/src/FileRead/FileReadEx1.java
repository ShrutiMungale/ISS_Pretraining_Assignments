package FileRead;
import java.io.*;
public class FileReadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File Reader Class
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\shrut\\Desktop\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			// Declaring loop variable
			int i;
			// Holds true till there is nothing to read
			try {
				while ((i = fr.read()) != -1)

					// Print all the content of a file
					System.out.print((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

