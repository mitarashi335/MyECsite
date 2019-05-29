package com.internousdev.template2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	//JDBC　ドライバー名
	private static String driverName="com.mysql.jdbc.Driver";

	//データベース接続URL
	private static String url="jdbc:mysql://localhost/ecsite33";

	//ユーザー名
	private static String user="root";

	//パスワード
	private static String password="mysql";

	//データベース接続
	public Connection getConnection(){

		//初期値null
		Connection con =null;

	//DB情報を運ぶ準備
	try{
		Class.forName(driverName);
		con =(Connection)DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
	}
}
