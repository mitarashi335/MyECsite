package com.internousdev.Task1_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.Task1_1.dto.LoginDTO;
import com.internousdev.Task1_1.util.DBConnector;
public class LoginDAO {
	public LoginDTO select(String name,String pass)throws SQLException{
		LoginDTO dto=new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql="select * from user where user_name=? and password=?";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

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
