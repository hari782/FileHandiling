package practice;
import java.util.*;

import com.sun.net.httpserver.Authenticator.Success;

import java.io.*;
import java.sql.*;
public class FileHandling1 {
	public static void main (String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hari","hari@2003");
			PreparedStatement ps = con.prepareStatement("insert into practice values(?,?,?,?)");
			Scanner s = new Scanner(System.in);
			String User = "";
			do {
				
				System.out.println("Enter Reg.No : ");
				String Reg_No = s.nextLine();
				
				System.out.println("Enter Name : ");
				String Name = s.nextLine();
			
				System.out.println("Enter Dept : ");
				String Dept = s.nextLine();
				
				System.out.println("Enter Salary : ");
				double Salary = s.nextDouble();
				s.nextLine();
				
				ps.setString(1, Reg_No);
				ps.setString(2, Name);
				ps.setString(3, Dept);
				ps.setDouble(4, Salary);
				
				ps.addBatch();
				
				System.out.println("Enter the choise(yes/no) : ");
				User = s.nextLine();
			}
			while (User.equals("yes"));
				ps.executeBatch();
				System.out.println("Success...");
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
