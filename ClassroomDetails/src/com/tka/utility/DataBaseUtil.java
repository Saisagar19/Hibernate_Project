package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtil {

	public static void loadDriver(String DriverAddress) throws Exception
	{
		Class.forName(DriverAddress);
	}

	public static Connection createConnection(String url,String username,String password)throws Exception
	{
		Connection connection=DriverManager.getConnection(url,username,password);
		return connection;
	}

	public static Statement createStatement(Connection connection)throws Exception
	{
		Statement stm=connection.createStatement();
		return stm;
	}

	public static ResultSet createResultSet(Statement stm,String Query)throws Exception
	{

		return stm.executeQuery(Query);

	}

}
