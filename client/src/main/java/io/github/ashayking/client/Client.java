package io.github.ashayking.client;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import io.github.ashayking.driver.DataBaseDriver;

/**
 * 
 * @author Ashay S Patil
 * 
 *         /usr/lib/jvm/java-11-openjdk-amd64/bin/java --module-path
 *         driver/target/driver-1.0-SNAPSHOT.jar:mysql-driver/target/mysql-driver-1.0-SNAPSHOT.jar:client/target/client-1.0-SNAPSHOT.jar
 *         -m io.github.ashayking.client/io.github.ashayking.client.Client
 * 
 */
public class Client {

	private static List<DataBaseDriver> dbDrivers = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Entering Client");

		ServiceLoader.load(DataBaseDriver.class).forEach(dbDrivers::add);

		dbDrivers.stream().forEach(DataBaseDriver::getDBConnection);

		System.out.println("Exiting Client");
	}
}
