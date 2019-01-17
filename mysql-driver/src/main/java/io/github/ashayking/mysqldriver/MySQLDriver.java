package io.github.ashayking.mysqldriver;

import io.github.ashayking.driver.DBConnection;
import io.github.ashayking.driver.DataBaseDriver;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class MySQLDriver implements DataBaseDriver {

	@Override
	public DBConnection getDBConnection() {
		
		// var temp = "ASHAY";
		// temp = 10;
		
		System.out.println("Started to create DB Connection Object");
		DBConnection connection = new DBConnection();
		connection.setImplementorName("MySQL Implementation");
		System.out.println("Completed to create DB Connection Object");
		return connection;
	}

}
