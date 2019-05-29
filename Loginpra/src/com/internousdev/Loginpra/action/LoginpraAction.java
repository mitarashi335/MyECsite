package com.internousdev.Loginpra.action;
import java.sql.SQLException;

import com.internousdev.Loginpra.dao.LoginpraDAO;
import com.internousdev.Loginpra.dto.LoginpraDTO;
import com.opensymphony.xwork2.ActionSupport;
public class LoginpraAction extends ActionSupport{
	private String name;
	private String pass;

	public String execute() throws SQLException{
		String ret=ERROR;

		LoginpraDAO dao=new LoginpraDAO();
		LoginpraDTO dto=new LoginpraDTO();



		dto=dao.select(name,pass);
		if(name.equals(dto.getName())){
			if(pass.equals(dto.getPass())){
				//Successに上書き
				ret=SUCCESS;
			}
		}
	return ret;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}



}
