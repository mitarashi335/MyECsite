<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>スタート画面</title>
</head>
<body>
	<style type="text/css">
		#header{
		width:100%;
		height:80px
		background-color:green;
		}
	</style>
	<div>
		<div>
			<h1>3桁のコードブレーカー！</h1>
		</div>
	</div>

	<s:form action="StartAction">
		<s:submit value="スタート"/>
	</s:form>
</body>
</html>