module io.github.ashayking.mysqldriver {

	requires transitive io.github.ashayking.driver;

	exports io.github.ashayking.mysqldriver;

	provides io.github.ashayking.driver.DataBaseDriver 
		with io.github.ashayking.mysqldriver.MySQLDriver;
}