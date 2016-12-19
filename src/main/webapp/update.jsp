<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>更新页面</title>
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
                    <li><a href="insert.jsp">插入File</a></li>
                </ul>
            </li>
				</ul>
			</div>
		</div>
		</nav>


   
<form class="form-horizontal" role="form" action="<%=request.getContextPath()%>/service/UpdateServlet" method="post">
  <div class="form-group">
    <label for="film_id" class="col-sm-2 control-label">film_id</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="film_id" name="film_id"placeholder="请输入电影id">
    </div>
  </div>
  <div class="form-group">
    <label for="title" class="col-sm-2 control-label">title</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="title"  name="title" placeholder="请输入title">
    </div>
  </div>
  
   <div class="form-group">
    <label for="title" class="col-sm-2 control-label">Description</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="Description"  name="description" placeholder="请输入Description">
    </div>
  </div>
  <label for="title" class="col-sm-2 control-label">language(only one)</label> 
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox" value="1" name="check">English
         </label>
      </div>
    </div>
  </div>
  
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
 <input type="checkbox" value="2" name="check">Italin
         </label>
      </div>
    </div>
  </div>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox" value="3" name="check">Janpanese
         </label>
      </div>
    </div>
  </div>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox" value="4" name="check">Mandarin
         </label>
      </div>
    </div>
  </div>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox" value="5" name="check">French
         </label>
      </div>
    </div>
  </div>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox" value="6" name="check">German
         </label>
      </div>
    </div>
  </div>
   
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">确定</button>
      <button type="reset" class="btn btn-default">取消</button>
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
