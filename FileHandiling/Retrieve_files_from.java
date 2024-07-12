package jdbc1;
import java.io.*;
import java.sql.*;
class suma{
	public static void main(String[] args) {
		
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hari","hari@2003");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from files");
		int p=1;
		while(rs.next()) {
			Blob b = rs.getBlob("FILE_NAME");
			byte[] by = b.getBytes(p++,(int)b.length());
			File f = new File("C:\\Users\\HP\\Downloads\\Java\\notepad\\Sample."+p+"jpg");
			FileOutputStream fout = new FileOutputStream(f);
			fout.write(by);
			fout.close();
		}
		System.out.print("Success...");
	}
	catch(Exception obj) {
		obj.printStackTrace();
	}
}
	}
