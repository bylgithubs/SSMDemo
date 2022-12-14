<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
<title>修改信息</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					<small>修改信息</small>
				</h1>
			</div>
		</div>
	</div>
	
		<form action="${pageContext.request.contextPath}/updateBook" method="post">
		<input type="hidden" name="booID" value="${book.getBookID()}"/>
		书籍名称：<input type="text" name="bookName" value="${book.getBookName()}"/><br><br><br>
		书籍数量：<input type="text" name="bookCounts" value="${book.getBookCounts()}"/><br><br><br>
		书籍详情：<input type="text" name="detail" value="${book.getDetail()}"/><br><br><br>
		<input type="submit" value="提交">
	</form>
</div>
</body>
</html>