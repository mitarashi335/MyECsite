package com.internousdev.Task1_1.action;

import java.sql.SQLException;

import com.internousdev.Task1_1.dao.LoginDAO;
import com.internousdev.Task1_1.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String pass;

	public String execute()throws SQLException{
		String ret =ERROR;
		LoginDAO dao =new LoginDAO();
		LoginDTO dto =new LoginDTO();

		dto=dao.select(name,pass);
		if(name.equals(dto.getName())){
			if(pass.equals(dto.getPass())){
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
