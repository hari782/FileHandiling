package jdbc1;
import java.util.*;
import java.sql.*;

public class Mysql2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the name: ");
			String name = s.nextLine();
			System.out.println("Enter the dept: ");
			String dept = s.nextLine();
			System.out.println("Enter the salary: ");
			double salary = s.nextDouble();

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","hari@2003");

			PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, dept);
			ps.setDouble(3, salary);
			ps.execute();
			System.out.println("Success...");
		} 
		catch(Exception obj) {
			obj.printStackTrace();
		}
		
	}

}
