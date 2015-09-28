<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<title>注册</title>
	</head>
	<body>
	   	<form>
           <input id="username" type="text" name="username" class="indispensable" value="linlianhuai"/><br>
           <input id="password" type="password" name="password" class="indispensable" value="123456"/><br>
           <input id="passwordComfire" type="text" name="passwordComfire" class="indispensable"  value="123456"/><br>
           <input id="name" type="text" name="name" class="indispensable" value="林炼怀"/><br>
           <input id="phone" type="text" name="phone" class="indispensable" value="13430063218"/><br>
           <select id="sex" name="sex" class="indispensable">
				<option value="0">男</option>
			  	<option value="1">女</option>
		   </select><br>
           <input id="age" type="text" name="age" class="indispensable" value="32"/><br>
           <select id="id_card_type" name="id_card_type" class="indispensable">
				<option value="0">身份证</option>
			  	<option value="1">学生证</option>
		   </select><br>
           <input id="id_card_code" type="text" name="id_card_code" class="indispensable" value="2013060702318"/><br>
           <input id="email" type="text" name="email" class="indispensable" value="995916369@qq.com"/><br>
           <input id="register" type="button" value="注册"><br>
       </form>
  	</body>
  	<script src="bootstrap/js/jquery-1.10.2.js"></script>
  	<script src="js/register.js"></script>
</html>

