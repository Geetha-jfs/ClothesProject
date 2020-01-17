package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
public static void main(String[] args) {
	//get ojdbc14.jar
	//Load the driver
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		//gettheconnection
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			System.out.println("Connection established!");
			//Create Statement
			Statement statement=connection.createStatement();
			//Execute the query
			ResultSet resultSet= statement.executeQuery("SELECT * FROM employees");
			while(resultSet.next()) {
				int employeeId = resultSet.getInt("employee_id");
				String firstName = resultSet.getString("first_name");
				System.out.println(employeeId + ">" + firstName);
			}
			System.out.println(resultSet);
	}
	catch (SQLException e) {
			System.out.println(e);
		}
	catch (ClassNotFoundException e) {
		System.out.println(e);
	}
}
}

