package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		//DBと接続
		DBConnector dbConnector=new DBConnector();

		/*下記でDBConnectorメソッドのgetconnectionを手に入れる
		 * DB内のtableの情報を入手する。*/
		Connection connection=dbConnector.getConnection();


		LoginDTO loginDTO=new LoginDTO();

		//sql文を作成
		String sql="SELECT * FROM login_user_transaction where login_id=? AND login_pass=?";

		try{
			//sql文を実行可能な文にしている。
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			//sql文を実行する。
			ResultSet resultSet=preparedStatement.executeQuery();

			//DBと照らし合わせて、当てはまればtrue,なければfalse
			if(resultSet.next()){
				//trueならDTOへ格納
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));

				//下記if文一行は特にいらない。
				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}

}
