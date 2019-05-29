package com.internousdev.Loginpra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.Loginpra.dto.LoginpraDTO;
import com.internousdev.Loginpra.util.DBConnector;

public class LoginpraDAO {
	public LoginpraDTO select(String name, String pass) throws SQLException{
		LoginpraDTO dto =new LoginpraDTO();
		DBConnector db =new DBConnector();
		Connection con= db.getConnection();

		String sql="select * from user where user_name=? And user_password=?";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
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
