package practice;
import java.util.*;
import java.io.*;
import java.sql.*;
public class FileHandiling2 {
	public static void main (String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hari","hari@2003");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Practice");
			while(rs.next()) {
				String Reg_No = rs.getString("Reg_No");
				String Name = rs.getString("Name");
				String Dept = rs.getString("Dept");
				Double Salary = rs.getDouble("Salary");
				System.out.println("Reg_No : "+Reg_No);
				System.out.println("Name : "+Name);
				System.out.println("Dept : "+Dept);
				System.out.println("Salary : "+Salary);
				System.out.println("**********************");

			}
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
