<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1.0">
<title>新增书籍</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					<small>新增书籍</small>
				</h1>
			</div>
		</div>
	</div>
	<form action="${pageContext.request.contextPath}/addBook" method="post">
		书籍名称：<input type="text" name="bookName"><br><br><br>
		书籍数量：<input type="text" name="bookCounts"><br><br><br>
		书籍详情：<input type="text" name="detail"><br><br><br>
		<input type="submit" value="添加">
	</form>
</div>
</body>
</html>