import java.sql.DriverManager;
import java.sql.*;
public class MyDbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Mypassword2002#");
		System.out.println("Successfully connected to database");
		// Insert statement
//	PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
//	preparedStatement.setNString(1, "86");
//	preparedStatement.setNString(2, "SHRUTI	");
//	preparedStatement.setNString(3, "COMPS");
//	preparedStatement.executeUpdate();
//	System.out.println("Data inserted successfully");
		
		//Update Statement
//		PreparedStatement preparedStatement=connection.prepareStatement("update student set department=? where Rollno=?");
//		preparedStatement.setNString(1, "MECH");
//		preparedStatement.setNString(2, "86");
//		preparedStatement.executeUpdate();
//		System.out.println("Data updated successfully");
//		
		// Retrieve data
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
//		
		ResultSet resultset=preparedStatement.executeQuery();
		//System.out.println(resultset);
		while(resultset.next()) {
			String rollno=resultset.getString("Rollno");
			String name=resultset.getString("student_name");
			String dept=resultset.getString("department");
			System.out.println(rollno+" "+name+" "+dept);
		}
	
		
		}catch(Exception e) {
			
		System.out.println(e);
	}
		

}}
