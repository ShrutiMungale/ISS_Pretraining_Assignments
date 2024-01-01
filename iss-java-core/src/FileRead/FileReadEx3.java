package FileRead;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadEx3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(
				"C:\\Users\\shrut\\Desktop\\test.txt");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
	}

}

//Java Program to illustrate
//reading from Text File
//using Scanner Class
