package JBC_Demo.JBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete 
{
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_prueba","root","Chalangalan055");
			Statement st = con.createStatement();
			String query = "DELETE from myemployee where FIRST_NAME like'Alan'";
			st.execute(query);
			System.out.println("The record was deleted");
			
			con.close();
			}
			catch(SQLException ex) 
			{
				System.out.println(ex);
			}
	}
	}
	

