package com.internousdev.templete11.util;

//特定のデータベースとの接続(セッション)を表現します。接続のコンテキスト内でSQL文が実行され結果が返される
import java.sql.Connection;
//getConnectionメソッドが呼び出されると、DriverManagerは、初期化時にロードされたドライバや、現アプレットあるいはアプリケーションと同じクラス・ローダーを使用して明示的にロードされたドライバの中から適切なドライバを探そうとします。
import java.sql.DriverManager;
//データベース・アクセス・エラーまたはその他のエラーに関する情報を提供する例外
import java.sql.SQLException;


public class DBConnector {

	//dbへ入るための情報
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/ecsite";
	private static String user="root";
	private static String password="mysql";

	//java装備のconnection(上記importの)を使用してDB内の情報を採取
	public Connection getConnection(){
		Connection con = null;
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
