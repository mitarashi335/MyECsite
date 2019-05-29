package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name,String password) throws SQLException{
		LoginDTO dto=new LoginDTO();
		//DBつなぎ
		DBConnector db=new DBConnector();
		//情報 もらい
		Connection con=db.getConnection();
		//SQL文つくり
		String sql="select * from user where user_name=? and password=?";
	try{
		//↑をまとめ
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,password);
		//DBのuser_nameをname,passwordをpassとして実行可能な文にする
		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			//rsのusernameをdtoのnameにぶち込む
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	}catch(SQLException e){
		//問題があったら言ってくれ
		e.printStackTrace();
	}finally{
		//バイバイDB
		con.close();
	}
	//actionにお返し
	return dto;
	}
}
