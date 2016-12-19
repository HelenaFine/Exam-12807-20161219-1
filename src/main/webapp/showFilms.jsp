<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>登录页面</title>
<style type="text/css">
.form-horizontal {
	margin: 100px;
}

#myDiv {
	align：center;
	pidding: 20px;
	margin-top: 70px;
}


</style>

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a href="../index.jsp" class="navbar-brand">首页</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="login.jsp">用户登录</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Film相关 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="showFilms.jsp">显示全部Film</a></li>
						<li class="divider"></li>
						<li><a href="insert.jsp">插入File</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	</nav>




	<div class="container" id="myDiv">
		<div class="starter">
		<form action="<%= request.getContextPath()%>/service/FilmServlet" method="post">
			<button type="submit" class="btn btn-default">点击刷新查看全部</button>
			</form>
		</div>
	</div>


	
	<table class="table table-striped" id="tb" >
		<thead>
			<tr>
				<th>Film_id</th>
				<th>Title</th>
				<th>Description</th>
				<th>language</th>
				<th>Edit</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${filmList}" var="filmList" varStatus="vs"> 
			<tr>
				<th>${filmList.film_id}</th>
				<th>${filmList.title}</th>
				<th>${filmList.description}</th>
				<th>${filmList.language}</th>
				<th>
				<form action="">
					<div class="btn-group-vertical">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							编辑 <span class="caret"></span>
						</button>
						
						
						<ul class="dropdown-menu">
							<li><a href="DeleteServlet?id=${filmList.film_id}">删除</a></li>
							<li><a href="UpdateServlet?id=${filmList.film_id}">更新</a></li>
						</ul>
					</div>
					</form>
				</th>
			</tr>
		</c:forEach>
		</tbody>
	</table>

<nav class="navbar navbar-inverse navbar-fixed-folder" role="navigation">
		<div class="container">
		<div id="navbar" class="collapse navbar-collapse">
			</div>
		</div>
		</nav>
</body>
</html>