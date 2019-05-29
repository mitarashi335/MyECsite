package com.internousdev.webproj1_1.action;

//とりまactionには突っ込む
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport{
//ページ移動のみ
	public String execute(){
		return SUCCESS;
	}
}
