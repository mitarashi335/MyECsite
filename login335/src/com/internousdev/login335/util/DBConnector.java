package com.internousdev.login335.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//ドライバー名、URL、ユーザー名、パスの記載
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/logindb_sasako2";
	private static String user="root";
	private static String password="mysql";

	//DBへ接続の設定
	public  Connection getConnection(){
		Connection con = null;

		try{
			Class.forName(driverName);
			con =(Connection)DriverManager.getConnection(url, user, password);

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return con;
	}



}
