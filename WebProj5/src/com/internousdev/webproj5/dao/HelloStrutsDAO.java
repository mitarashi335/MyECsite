package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.internousdev.webproj5.util.DBConnector;

public class HelloStrutsDAO {
	//Listフィールド作成
	List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();
	public List<HelloStrutsDTO> select(){
		//DB接続
		DBConnector db = new DBConnector();
		//DB情報採取
		Connection con =db.getConnection();

		//users tableをすべて抽出文作成①
		String sql = "select * from users";
		try{
			//conと①をpsに代入
			PreparedStatement ps=con.prepareStatement(sql);
			//①を実行可能に
			ResultSet rs = ps.executeQuery();

			//DBとフロントサイドの比較
			while(rs.next()){
				HelloStrutsDTO dto=new HelloStrutsDTO();
				//DBの情報をdtoの各々を代入
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続できます。");
				//Listにdtoという要素の追加
				helloStrutsDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return helloStrutsDTOList;
	}
}
