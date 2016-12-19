<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>登录页面</title>
<style type="text/css">
	.form-horizontal{
		margin:100px;
	}
	#myDiv{
		pidding:40px;
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
					<li class="active"><a>用户登录</a></li>
					<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    Film相关
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="showFilms.jsp">查询全部Film</a></li>
                    <li class="divider"></li>
                    <li><a href="insert.jsp">新增film</a></li>
                </ul>
            </li>
				</ul>
			</div>
		</div>
		</nav>

<!-- <div class="container">
	<div class="starter">
	<h1>BootStrap starter template</h1>
	<p class="lead">..</p>
	</div> -->
</div>
<form id="loginForm" class="form-horizontal" role="form" action="<%=request.getContextPath()%>/service/LoginServlet" method="post">
  <div class="form-group">
    <label for="username" class="col-sm-2 control-label">姓名</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" id="username" name="username" placeholder="请输入名字">
    </div>
  </div>
 
   <div class="form-group">
   <div class="col-sm-offset-2 col-sm-2" id="myDiv">
      <button  class="btn btn-default" type="submit">登录</button>
       <button  class="btn btn-default" type="reset">重置</button>
    </div>
    </div>
    
  
</form>
<nav class="navbar navbar-inverse navbar-fixed-folder" role="navigation">
		<div class="container">
		<div id="navbar" class="collapse navbar-collapse">
			</div>
		</div>
		</nav>
</body>
</html>