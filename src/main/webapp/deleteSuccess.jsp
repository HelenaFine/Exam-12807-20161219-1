<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>登录成功</title>
<style type="text/css">
	.form-horizontal{
		margin:100px;
	}
	#mydiv{
		margin:100px;
		pidding:300px;
	}
</style>

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a href="index.jsp" class="navbar-brand">首页</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li ><a href="login.jsp">用户登录</a></li>
					<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Film相关
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="showFilms.jsp">查询全部Film</a></li>
                    <li class="divider"></li>
                    <li><a href="insert.jsp">新增Film</a></li>
                </ul>
            </li>
				</ul>
			</div>
		</div>
		</nav>
<!-- <div class="container" id="mydiv">
	<div class="starter">
	<h1>BootStrap starter template</h1>
	<p class="lead">..</p>
	</div>
</div> -->


<div class="container" id="mydiv">
   <div class="jumbotron">
        <h1>删除成功</h1>
        <p><a class="btn btn-primary btn-lg" role="button" href="../showFilms.jsp">
       返回继续查看</a>
      </p>
   </div>
</div>



</body>
</html>
