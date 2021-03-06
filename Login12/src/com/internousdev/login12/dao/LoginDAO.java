package com.internousdev.login12.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login12.dto.LoginDTO;
import com.internousdev.login12.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name,String pass)throws SQLException{
		DBConnector db=new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();
		String sql="select * from user where user_name=? and password=?";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,pass);
		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			dto.setName(rs.getString("user_name"));
			dto.setPass(rs.getString("password"));
		}

	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return dto;
	}

}
