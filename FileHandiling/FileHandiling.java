package practice;
import java.util.*;
import java.io.*;
import java.sql.*;

public class FileHandiling {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter S.io : ");
			int S_IO = s.nextInt();
			System.out.println("Enter Reg_No : ");
			String Reg_No = s.nextLine();
			s.nextLine();
			System.out.println("Enter Name : ");
			String Name = s.nextLine();
			System.out.println("Enter Dept : ");
			String Dept = s.nextLine();
			System.out.println("Enter Salary : ");
			Double Salary = s.nextDouble();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hari","hari@2003");
			PreparedStatement ps = con.prepareStatement("insert into practice values(?,?,?,?,?)");
			ps.setString(1, Reg_No);
			ps.setString(2, Name);
			ps.setInt(3, S_IO);
			ps.setString(4, Dept);
			ps.setDouble(5, Salary);
			ps.execute();
			System.out.println("Success...");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
