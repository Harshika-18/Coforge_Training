package com.coforge.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		// step 1 : Load Driver
		Class.forName(ApplicationProperties.driver);

		// step 2 : Connect with DB
		Connection connection = DriverManager.getConnection(ApplicationProperties.url, ApplicationProperties.userName, ApplicationProperties.password);

		return connection;
	}
}

//this class connects with database and return the connection object.
