package FileRead;
import java.io.*;
public class FileReadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(
				"C:\\Users\\shrut\\Desktop\\test.txt");

			
			// Creating an object of BufferedReader class
			BufferedReader br=null;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Declaring a string variable
			String st;
			// Condition holds true till
			// there is character in a string
			try {
				while ((st = br.readLine()) != null)

					// Print the string
					System.out.println(st);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
