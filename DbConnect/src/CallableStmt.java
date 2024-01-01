import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CallableStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Mypassword2002#");
			System.out.println("Successfully connected to database");
			
			//Preparing a CallableStateement
		      CallableStatement cstmt = connection.prepareCall("{call INSERT_PROCEDURE(?,?,?)}");

		      cstmt.setString(1, "88");
		      cstmt.setString(2, "ASHWIN");
		      cstmt.setString(3, "COMPS");
		      
		      cstmt.executeUpdate();
		      
		      System.out.println("Inserted record");
		      
//		      cstmt.setString(1, "88");
//		      cstmt.setString(2, "ASHWIN");
//		      cstmt.setString(3, "EXTC");

//		      ResultSet resultset=cstmt.executeQuery();
//		      while(resultset.next()) {
//					String rollno=resultset.getString("Rollno");
//					String name=resultset.getString("name");
//					String dept=resultset.getString("department");
//					System.out.println(rollno+" "+name+" "+dept);
//				}
		      
		      
	}
	catch(Exception e) {
		System.out.println(e);

}finally {
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	}}
