package JBC_Demo.JBC_Project;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Fetch {

	public static void main(String[] args) {
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_prueba","root","Chalangalan055");
		Statement st = con.createStatement();
		String query = "UPDATE myemployee SET LAST_NAME='Reta' where FIRST_NAME like'Alan'";
		st.execute(query);
		System.out.println("The query was updated");
		
		con.close();
		}
		catch(SQLException ex) 
		{
			System.out.println(ex);
		}
	}
}
