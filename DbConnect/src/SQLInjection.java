import java.sql.*;
import java.util.Scanner;
public class SQLInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Mypassword2002#");
			System.out.println("Successfully connected to database");
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter username: ");
			String uname=sc.nextLine();
			System.out.println("Enter password: ");
			String pwd=sc.nextLine();
			
			//String sql= "SELECT * FROM USERS WHERE USERNAME =?" ;
			String sql = "SELECT * FROM USERS WHERE USERNAME = '" + uname + "';";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//preparedStatement.setNString(1,uname);
			
			//System.out.println(preparedStatement.toString());
			
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				String un=resultset.getString("USERNAME");
				String ps=resultset.getString("U_PASSWORD");
				String fn=resultset.getString("FNAME");
				String ln=resultset.getString("LNAME");
				System.out.println(un+" "+ps+" "+fn+" "+ln);
				
			}
			connection.close();
	}catch(Exception e) {
		System.out.println(e);
	}

}}

