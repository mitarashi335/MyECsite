<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>失敗</title>
</head>
<body>
	<h1>ログインに失敗しました！</h1>
<p>【入力内容を確認してください】</p>
<p>ユーザー名:<s:text name="name"></s:text></p>
<p>パスワード:<s:text name="pass"></s:text></p>
</body>
</html>