package com.internousdev.Task1_1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String DriverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/logindb_14";
	private static String user="root";
	private static String password="mysql";

	public Connection getConnection(){
		Connection con = null;

		try{
			Class.forName(DriverName);
			con=(Connection)DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return con;
	}
}
