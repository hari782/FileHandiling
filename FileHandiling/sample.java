package jdbc1;
import java.util.*;
import java.io.*;
import java.sql.*;
public class sample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hari","hari@2003");
			PreparedStatement ps = con.prepareStatement("insert into STD_DETAILS values(?,?,?,?,?)");
			Scanner s = new Scanner(System.in);
			String user_value = "";
			do {
				System.out.println("Enter Reg.no: ");
				String reg_no = s.nextLine();
				System.out.println("Enter Dept: ");
				String Dept = s.nextLine();
				System.out.println("Enter Name: ");
				String Name = s.nextLine();
				System.out.println("Enter Email: ");
				String Email = s.nextLine();
				System.out.println("Enter Ph: ");
				String Ph_no = s.nextLine();
				
				ps.setString(1, reg_no);
				ps.setString(2, Dept);
				ps.setString(3, Name);
				ps.setString(4, Email);
				ps.setString(5, Ph_no);
				
			ps.addBatch();
	
				System.out.println("Enter your choice(yes/no): ");
				user_value = s.nextLine();
			} while (user_value.equals("yes"));
				ps.execute();
				System.out.println("Success...");
		
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
